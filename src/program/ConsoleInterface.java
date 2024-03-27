package program;

import java.util.Scanner;
import java.util.Set;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ConsoleInterface {
    private LogParser logParser;

    public ConsoleInterface(LogParser logParser) {
        this.logParser = logParser;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = getChoice(scanner);

            switch (choice) {
                case 1:

                    printUniqueIPs();
                    break;
                case 2:
                    printUserStatistics();
                    break;
                case 3:
                    printEventStatistics();
                    break;
                case 4:
                    printStatusStatistics();
                    break;
                case 5:
                    printAllUsers();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 6);

        scanner.close();
    }

    private void printMenu() {
        System.out.println("┌──────────────────────────────────────────────┐");
        System.out.println("│                  Log Parser                  │");
        System.out.println("├──────────────────────────────────────────────┤");
        System.out.println("│ 1. Print Unique IP Addresses                 │");
        System.out.println("│ 2. Print User Statistics                     │");
        System.out.println("│ 3. Print Event Statistics                    │");
        System.out.println("│ 4. Print Status Statistics                   │");
        System.out.println("│ 5. Print All Users                           │");
        System.out.println("│ 6. Exit                                      │");
        System.out.println("└──────────────────────────────────────────────┘");
        System.out.print("Enter your choice: ");
    }

    private int getChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void printUniqueIPs() {
        Set<String> uniqueIPs = logParser.getUniqueIPs(null, null);
        System.out.println("Unique IP addresses:");
        for (String ip : uniqueIPs) {
            System.out.println(ip);
        }
    }

    private void printUserStatistics() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        Set<String> userIPs = logParser.getIPsForUser(username, null, null);
        System.out.println("User " + username + " accessed from the following IP addresses:");
        for (String ip : userIPs) {
            System.out.println(ip);
        }
    }

    private void printEventStatistics() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event type (e.g., LOGIN, DOWNLOAD_PLUGIN): ");
        String eventType = scanner.nextLine();
        System.out.print("Enter date range (format: dd.MM.yyyy HH:mm:ss dd.MM.yyyy HH:mm:ss): ");
        String dateRange = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        try {
            String[] dates = dateRange.split(" ");
            Date startDate = dateFormat.parse(dates[0] + " " + dates[1]);
            Date endDate = dateFormat.parse(dates[2] + " " + dates[3]);
            Set<String> eventIPs = logParser.getIPsForEvent(Event.valueOf(eventType), startDate, endDate);
            System.out.println("IP addresses where event " + eventType + " occurred:");
            for (String ip : eventIPs) {
                System.out.println(ip);
            }
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
        }
    }

    private void printStatusStatistics() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter status (e.g., OK, FAILED): ");
        String statusType = scanner.nextLine();
        Set<String> statusIPs = logParser.getIPsForStatus(Status.valueOf(statusType), null, null);
        System.out.println("IP addresses with status " + statusType + ":");
        for (String ip : statusIPs) {
            System.out.println(ip);
        }
    }

    private void printAllUsers() {
        Set<String> allUsers = logParser.getAllUsers();
        System.out.println("All users:");
        for (String user : allUsers) {
            System.out.println(user);
        }
    }
}
