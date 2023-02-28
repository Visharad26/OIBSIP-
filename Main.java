import java.util.Scanner;

public class QuizApp {

    private static User currentUser;
    private static final int TIME_LIMIT = 60; // Time limit for answering the questions in seconds

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the Quiz App!");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login(Scanner scanner) {
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        User user = UserDatabase.authenticateUser(username, password);
        if (user == null) {
            System.out.println("Invalid username or password. Please try again.");
            return;
        }

        currentUser = user;
        System.out.println("Login successful!");

        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("Welcome, " + currentUser.getName() + "!");
            System.out.println("1. Update profile and password");
            System.out.println("2. Take the quiz");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    updateProfile(scanner);
                    break;
                case 2:
                    takeQuiz(scanner);
                    break;
                case 3:
                    currentUser = null;
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void updateProfile(Scanner scanner) {
        System.out.println("Enter your new name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your new password: ");
        String
