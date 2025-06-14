public class MovieTicket {
    static int totalTicketsSold = 0;

    MovieTicket() {
        totalTicketsSold++;
        System.out.println("Ticket booked. Total tickets: " + totalTicketsSold);
    }

    public static void main(String[] args) {
        new MovieTicket();
        new MovieTicket();
    }
}
