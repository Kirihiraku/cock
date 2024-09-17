import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInput implements InputMethod {
    private String fileName;

    public FileInput(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getInput() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            reader.close();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void sendOutput(String output) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(output);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}