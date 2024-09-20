import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class BullsAndCowsController {
    private final BullsAndCowsModel model;
    private final BullsAndCowsView view;

    public BullsAndCowsController(BullsAndCowsModel model, BullsAndCowsView view) {
        this.model = model;
        this.view = view;
    }

    public void playGame() {
        int[] secretNumber = model.getSecretNumber();
        int numberLength = model.getNumberLength();

        view.displayMessage("Добро пожаловать в игру быки и коровы!");

        int[] guessedNumber = new int[numberLength];
        Arrays.fill(guessedNumber, 0);

        int bulls = 0;
        int cows = 0;

        do {
            view.displayMessage("Введите ваше число:");
            String userInput = view.getUserInput();
            for (int i = 0; i < numberLength; i++) {
                guessedNumber[i] = Character.getNumericValue(userInput.charAt(i));
            }

            bulls = 0;
            cows = 0;

            for (int i = 0; i < numberLength; i++) {
                if (guessedNumber[i] == secretNumber[i]) {
                    bulls++;
                } else {
                    int finalI = i;
                    if (Arrays.stream(secretNumber).anyMatch(num -> num == guessedNumber[finalI])) {
                        cows++;
                    }
                }
            }

            view.displayMessage("Быки: " + bulls + ", Коровы: " + cows);

        } while (bulls != numberLength);

        view.displayMessage("Поздравляем! вы угадали число!");
    }

    public void processUserInput(String userInput) {
    }

    public int getBulls() {
        return 0;
    }

    public int getCows() {
        return 0;
    }
}