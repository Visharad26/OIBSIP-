import java.util.Scanner;

public class OnlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] seats = new boolean[10][10]; // array to keep track of seats
                     
        while (true) {
            // Display the seating chart
            System.out.println("Seats: ");
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    if (seats[i][j]) {
                        System.out.print("X ");
                    } else {
                        System.out.print("O ");
                    }
                }
                System.out.println();
            }

            // Ask user for seat selection
            System.out.print("Enter row number (0-9) or -1 to quit: ");
            int row = scanner.nextInt();
            if (row == -1) {
                break;
            }

            System.out.print("Enter seat number (0-9): ");
            int seat = scanner.nextInt();

            // Check if seat is available
            if (seats[row][seat]) {
                System.out.println("Sorry, that seat is already taken.");
            } else {
                seats[row][seat] = true;
                System.out.println("Seat " + row + "-" + seat + " has been reserved.");
            }
        }
    }
    
}


