class TicketBooking {
    void journey(int passengers){
        System.out.println("Number of passengers: " + passengers);
    }
  
    void journey(String destination){
        System.out.println("Destination: " + destination);
    }

    void journey(String destination, String date){
        System.out.println("Destination: " + destination);
        System.out.println("Date: " + date);
    }
}

public class Polymorphysim{
    public static void main(String[] args) {
        TicketBooking ticket = new TicketBooking();

        ticket.journey(30);
        ticket.journey("Vadodara");                         
        ticket.journey("Vadodara", "31/05/2025");           
    }
}