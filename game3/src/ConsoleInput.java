import java.util.Scanner;

public class ConsoleInput implements InputMethod {

    private Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        return scanner.nextLine();
    }

    @Override
    public void sendOutput(String output) {
        System.out.println(output);
    }
}