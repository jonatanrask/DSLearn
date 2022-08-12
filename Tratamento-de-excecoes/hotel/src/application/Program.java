package application;

import model.entities.Reservation;
import model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in data (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out data (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation: ");
            System.out.print("Check-in data (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out data (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);

        }
        catch (ParseException exception){
            System.out.println("Incorrect date format");
        }
        catch (DomainException exception){
            System.out.println("Error in reservation: " + exception.getMessage());
        }
    }
}
