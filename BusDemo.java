package BusReservationSystem;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args){

        ArrayList<Bus> buses = new ArrayList<Bus>();   //Arraylist for Bus class
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(1,false,25));
        buses.add(new Bus(1,true,15));


        int userOpt = 1;
        Scanner scanner = new Scanner(System.in);

        for(Bus b:buses){
            b.displayBusInfo();
        }
        while(userOpt==1){
            System.out.println("Enter 1 to book and 2 to exit");
            userOpt = scanner.nextInt();
            if(userOpt == 1){
                Booking booking = new Booking();

                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed!!!!!!");
                }
                else
                    System.out.println("Sorry....Bus is full. Try another bus or date.");
               
        }
        }
    }
    
}