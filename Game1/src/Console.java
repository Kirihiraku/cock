import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.io.File;



  class ConsoleGuessNumberGame  {
    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(100) + 1;
        String filePath = "number.txt";
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(String.valueOf(secretNumber));
            fileWriter.close();

            NumberInput numberInput = new FileNumberInput(filePath); // Замените на ConsoleNumberInput для ввода с консоли
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