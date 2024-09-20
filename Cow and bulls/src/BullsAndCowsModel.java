import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BullsAndCowsModel {
    private final int numberLength;
    private final boolean allowRepeats;
    private int[] secretNumber;

    public BullsAndCowsModel(int numberLength, boolean allowRepeats) {
        this.numberLength = numberLength;
        this.allowRepeats = allowRepeats;
        generateSecretNumber();
    }

    private void generateSecretNumber() {
        secretNumber = new int[numberLength];
        Random random = new Random();
        List<Integer> availableDigits = IntStream.range(0, allowRepeats ? 10 : 9)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < numberLength; i++) {
            int randomIndex = random.nextInt(availableDigits.size());
            secretNumber[i] = availableDigits.get(randomIndex);
            if (!allowRepeats) {
                availableDigits.remove(randomIndex);
            }
        }
    }

    public int[] getSecretNumber() {
        return secretNumber;
    }

    public int getNumberLength() {
        return numberLength;
    }

    public boolean isAllowRepeats() {
        return allowRepeats;
    }
}
