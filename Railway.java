import java.util.Scanner;
public class Railway {
    public static void main(String[] args) {
        int acSeats = 2;
        int sleeperSeats = 3;
        int generalSeats = 5;
        Scanner sc = new Scanner(System.in);
        int rail;

        do {
            System.out.println("\nWelcome to Indian Railway Booking System:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Availability");
            System.out.println("4. Exit");
            rail = sc.nextInt();

            switch (rail) {
                case 1:
                    System.out.println("Select the class:");
                    System.out.println("1. AC Class");
                    System.out.println("2. Sleeper Class");
                    System.out.println("3. General Class");
                    int ticket = sc.nextInt();

                    switch (ticket) {
                        case 1:
                            if (acSeats > 0) {
                                acSeats--;
                                System.out.println("AC Class booked. Remaining seats: " + acSeats);
                            } else {
                                System.out.println("No AC seats available.");
                            }
                            break;
                        case 2:
                            if (sleeperSeats > 0) {
                                sleeperSeats--;
                                System.out.println("Sleeper Class booked. Remaining seats: " + sleeperSeats);
                            } else {
                                System.out.println("No Sleeper seats available.");
                            }
                            break;
                        case 3:
                            if (generalSeats > 0) {
                                generalSeats--;
                                System.out.println("General Class booked. Remaining seats: " + generalSeats);
                            } else {
                                System.out.println("No General seats available.");
                            }
                            break;
                        default:
                            System.out.println("Invalid class option.");
                    }
                    break;

                case 2:
                    System.out.println("Select class to cancel:");
                    System.out.println("1. AC Class");
                    System.out.println("2. Sleeper Class");
                    System.out.println("3. General Class");
                    int cancel = sc.nextInt();
                    switch (cancel) {
                        case 1: acSeats++; System.out.println("AC ticket cancelled."); break;
                        case 2: sleeperSeats++; System.out.println("Sleeper ticket cancelled."); break;
                        case 3: generalSeats++; System.out.println("General ticket cancelled."); break;
                        default: System.out.println("Invalid class option.");
                    }
                    break;

                case 3:
                    System.out.println("Availability:");
                    System.out.println("AC Seats: " + acSeats);
                    System.out.println("Sleeper Seats: " + sleeperSeats);
                    System.out.println("General Seats: " + generalSeats);
                    break;

                case 4:
                    System.out.println("Thank you! Have a pleasant journey.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        } while (rail != 4);
    }
}


