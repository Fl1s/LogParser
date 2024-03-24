package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your logs directory: ");
        LogParser logParser = new LogParser(Path.of(reader.readLine()));
        ConsoleInterface consoleInterface = new ConsoleInterface(logParser);
        consoleInterface.start();
    }
}
