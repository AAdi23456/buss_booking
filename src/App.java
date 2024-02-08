import java.util.Scanner;

public class App {
    private static final int TotalSeats = 20;
    private static int AvilableSeats = TotalSeats;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Bus Ticket Booking System");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    ViewAvailableSeats();
                    break;
                case 2:
                    BookTicket(input);
                    break;
                case 3:
                    System.out.println("Thank you for using Bus Ticket Booking System");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void ViewAvailableSeats() {
        System.out.println("Available Seats: " + AvilableSeats);
    }

    private static void BookTicket(Scanner input) {
        if (AvilableSeats == 0) {
            System.out.println("bhool ja ");
        }
        System.out.println("bata kitne ticket chhey");
        int NoOfTickets = input.nextInt();
        if (NoOfTickets <= 0) {
            System.out.println("bakchodi karega bsdk");
        }
        if (NoOfTickets > AvilableSeats) {
            System.out.println("chal jaa koi bus doondh le");
        }else{
        AvilableSeats = AvilableSeats - NoOfTickets;
        
        System.out.println("chal khus ho jaa kaam ho gaya tera");
        }
    }
}
