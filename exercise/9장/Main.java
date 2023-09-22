import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "test.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            while ((line = bufferedReader.readLine()) != null) {
                lineNumber++;
                if (line.length() > 80) {
                    throw new ExceptionLineTooLong("Line " + lineNumber + ": 문자 80자 이상");
                }
            }
        } catch (ExceptionLineTooLong e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("FileNoFoundException " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
    public class ExceptionLineTooLong extends Exception {
        public ExceptionLineTooLong(String message) {
            super(message);
        }
    }
}
