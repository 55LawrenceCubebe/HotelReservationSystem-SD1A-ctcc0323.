import javax.swing.*;
import java.util.ArrayList;

public class FinalRequirement {

    static int numRooms = 15;
    static boolean[] Availroom = new boolean[numRooms];
    static ArrayList<Reservation> reservations = new ArrayList<>();

    // Fixed prices for rooms (for demonstration)
    static double[] roomPrices = {100.0, 120.0, 110.0, 130.0, 105.0, 125.0, 115.0, 135.0, 108.0, 128.0, 118.0, 138.0, 112.0, 132.0, 122.0};

    public static void main(String[] args) {
        // Initialize availability of rooms
        for (int i = 0; i < numRooms; i++) {
            Availroom[i] = true; // All rooms initially available
        }

        // Start the main menu
        MainMenuFrame mainMenu = new MainMenuFrame();
        mainMenu.setVisible(true);
    }

    // Method to make a reservation
    public static boolean makeReservation(int roomNumber, String guestName, String checkInDate, String checkOutDate) {
        if (Availroom[roomNumber - 1]) { // Check if room is available
            double price = getRoomPrice(roomNumber); // Get price for the room
            reservations.add(new Reservation(roomNumber, guestName, checkInDate, checkOutDate, price));
            Availroom[roomNumber - 1] = false; // Mark room as reserved
            return true; // Reservation successful
        }
        return false; // Room not available for reservation
    }

    // Method to view reservation details for a specific room
    public static String viewReservationDetails(int roomNumber) {
        for (Reservation reservation : reservations) {
            if (reservation.roomNumber == roomNumber) {
                return "Room Number: " + reservation.roomNumber + "\n"
                     + "Guest Name: " + reservation.guestName + "\n"
                     + "Check-in Date: " + reservation.checkInDate + "\n"
                     + "Check-out Date: " + reservation.checkOutDate + "\n"
                     + "Price per night: $" + reservation.price + "\n";
            }
        }
        return "No reservation found for room number " + roomNumber + ".";
    }

    // Method to get details of all reservations
    public static String getReservationDetails() {
        if (reservations.isEmpty()) {
            return "No reservations made.";
        }

        StringBuilder details = new StringBuilder();
        for (Reservation reservation : reservations) {
            details.append("Room Number: ").append(reservation.roomNumber).append("\n")
                   .append("Guest Name: ").append(reservation.guestName).append("\n")
                   .append("Check-in Date: ").append(reservation.checkInDate).append("\n")
                   .append("Check-out Date: ").append(reservation.checkOutDate).append("\n")
                   .append("Price per night: $").append(reservation.price).append("\n\n");
        }
        return details.toString();
    }

    // Method to get the price for a specific room
    private static double getRoomPrice(int roomNumber) {
        // In a real application, you might have a more sophisticated way to fetch prices
        // For demonstration, using a fixed array of prices
        if (roomNumber >= 1 && roomNumber <= roomPrices.length) {
            return roomPrices[roomNumber - 1];
        }
        return 0.0; // Return default price or handle error as per your application logic
    }

    // Nested static class Reservation within FinalRequirement
    static class Reservation {
        int roomNumber;
        String guestName;
        String checkInDate;
        String checkOutDate;
        double price;

        // Constructor for Reservation class
        public Reservation(int roomNumber, String guestName, String checkInDate, String checkOutDate, double price) {
            this.roomNumber = roomNumber;
            this.guestName = guestName;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
            this.price = price;
        }
    }
}
