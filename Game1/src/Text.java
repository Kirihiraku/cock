import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

    class GuessNumberGame {
    public static void main(String[] args) {
        String filePath = "number.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("52"); // Загаданное число
            fileWriter.close();

            NumberInput numberInput = new FileNumberInput.ConsoleNumberInput(); // Замените на ConsoleNumberInput для ввода с консоли
            String targetNumber = numberInput.getNumber();

            Scanner scanner = new Scanner(System.in);
            String guess;
            do {
                System.out.print("Guess the number: ");
                guess = scanner.nextLine();
                if (Integer.parseInt(guess) > Integer.parseInt(targetNumber)) {
                    System.out.println("Less");
                } else if (Integer.parseInt(guess) < Integer.parseInt(targetNumber)) {
                    System.out.println("Greater");
                }
            } while (!guess.equals(targetNumber));

            System.out.println("Congratulations! You guessed the number.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}