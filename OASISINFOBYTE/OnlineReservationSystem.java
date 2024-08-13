import java.util.Scanner;

public class OnlineReservationSystem {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        OnlineReservationSystem system = new OnlineReservationSystem();
        system.run();
    }
    private void run() {
        System.out.println("Welcome to the Online Reservation System");
        if (login()) {
            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Make a Reservation");
                System.out.println("2. Cancel a Reservation");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        makeReservation();
                        break;
                    case 2:
                        cancelReservation();
                        break;
                    case 3:
                        System.out.println("Exiting the system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 3);
        } else {
            System.out.println("Invalid login credentials. Exiting the system.");
        }
    }
    private boolean login() {
        System.out.print("Enter Login ID: ");
        String loginId = scanner.next();
        System.out.print("Enter Password: ");
        String password = scanner.next();
        if (loginId.equals("Shravan") && password.equals("4788")) {
            return true;
        }
        return false;
    }
    private void makeReservation() {
        System.out.println("\nReservation Form:");
        System.out.print("Enter your Name: ");
        String name = scanner.next();
        System.out.print("Enter Train Number: ");
        int trainNumber = scanner.nextInt();
        System.out.print("Enter Class Type (1. First Class, 2. Second Class): ");
        int classType = scanner.nextInt();
        System.out.print("Enter Date of Journey (dd-mm-yyyy): ");
        String dateOfJourney = scanner.next();
        System.out.print("Enter From (Place): ");
        String fromPlace = scanner.next();
        System.out.print("Enter To (Destination): ");
        String toDestination = scanner.next();
        System.out.println("Reservation Successful for " + name + " on " + dateOfJourney);
    }
    private void cancelReservation() {
        System.out.println("\nCancellation Form:");
        System.out.print("Enter PNR Number: ");
        int pnrNumber = scanner.nextInt();
        System.out.println("Reservation Details for PNR: " + pnrNumber);
        System.out.print("Do you want to confirm cancellation? (yes/no): ");
        String confirm = scanner.next();
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Reservation with PNR " + pnrNumber + " has been cancelled.");
        } else {
            System.out.println("Cancellation aborted.");
        }
    }
}
