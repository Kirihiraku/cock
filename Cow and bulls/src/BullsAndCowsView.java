import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BullsAndCowsView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}