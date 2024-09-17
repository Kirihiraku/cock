import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

interface NumberInput {
    String getNumber();
}

public class FileNumberInput implements NumberInput {
    private final String filePath;

    public FileNumberInput(String filePath) {
        this.filePath = filePath;
    }
    static class ConsoleNumberInput implements NumberInput {
        @Override
        public String getNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            return scanner.nextLine();
        }
    }

    @Override
    public String getNumber() {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            return scanner.nextLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}