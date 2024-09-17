public class GuessNumberGame {

    private InputMethod inputMethod;
    private int secretNumber;

    public GuessNumberGame(InputMethod inputMethod) {
        this.inputMethod = inputMethod;
    }

    public void play() {
        generateSecretNumber();
        inputMethod.sendOutput("Guess the number!");
        while (true) {
            String guess = inputMethod.getInput();
            try {
                int number = Integer.parseInt(guess);
                if (number == secretNumber) {
                    inputMethod.sendOutput("Congratulations! You guessed the number.");
                    break;
                } else if (number < secretNumber) {
                    inputMethod.sendOutput("Try a higher number.");
                } else {
                    inputMethod.sendOutput("Try a lower number.");
                }
            } catch (NumberFormatException e) {
                inputMethod.sendOutput("Please enter a valid number.");
            }
        }
    }

    private void generateSecretNumber() {
        secretNumber = (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        InputMethod inputMethod;
        if (args.length > 0 && args[0].equals("file")) {
            inputMethod = new FileInput("secret_number.txt");
        } else {
            inputMethod = new ConsoleInput();
        }

        GuessNumberGame game = new GuessNumberGame(inputMethod);
        game.play();
    }
}