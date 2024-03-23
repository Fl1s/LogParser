package program;

import java.nio.file.Paths;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LogParser logParser = new LogParser(Paths.get("*select-logs*"));
        System.out.println(logParser.getNumberOfUniqueIPs(null, new Date()));
    }
}
