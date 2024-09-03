# LogParser

**LogParser** is a Java-based console utility designed for parsing and analyzing log files. The program allows you to extract and filter log data based on various criteria, such as users, IP addresses, dates, and events.

## Features

- Extraction of log information based on various criteria (user, IP address, date, event).
- Command-line support for executing queries.
- Flexible query structure for log analysis.

## Installation and Usage

### Requirements

- Java Development Kit (JDK) version 20 or higher
- Java compiler (`javac`)

### Building the Project

1. Clone the repository or download the source code.

    ```sh
    git clone https://github.com/your-repo/LogParser.git
    cd LogParser
    ```

2. Compile the project using the command line.

    ```sh
    javac -d out src/program/*.java src/commands/*.java src/query/*.java
    ```

### Running the Program

1. Run the program.

    ```sh
    java -cp out program.Main
    ```

2. Follow the on-screen instructions to input your criteria for log parsing (e.g., user, IP address, event type).

3. The program will process the logs based on your input and display the filtered results.

## Usage Example

```plaintext
Enter the command to filter logs:
get_user <username>
get_ip <IP address>
get_event <event type>
get_date <date>
```

Example:

```plaintext
get_user john_doe
Results:
Event: LOGIN, Date: 2024-08-28, IP: 192.168.1.1, User: john_doe
...
```

## Project Structure

- **Main.java**: The main class that initiates the program.
- **LogParser.java**: Handles the core functionality of parsing the logs.
- **ConsoleInterface.java**: Manages user interaction through the console.
- **LogEntity.java, Event.java, Status.java**: Define the structure of log entries.
- **Commands**:
  - **Command.java**: Base class for all commands.
  - **GetUserCommand.java, GetIpCommand.java, GetEventCommand.java, GetDateCommand.java, GetStatusCommand.java**: Specific commands for filtering logs.
- **Queries**:
  - **UserQuery.java, IPQuery.java, EventQuery.java, DateQuery.java**: Classes responsible for building and executing queries.

## License

This project is licensed under the MIT License.
