import java.util.Date;

public class Ticket {
    private static int idCounter = 0;
    private int id;
    private String ownerName;
    private Date bookingTime;
    private int noOfSeats;
    // private Show bookedShow ;
    private String theater;

    public Ticket(String ownerName, Date bookingTime, int noOfSeats, String theater) {
        idCounter++;
        this.id = idCounter;
        this.ownerName = ownerName;
        this.bookingTime = bookingTime;
        this.noOfSeats = noOfSeats;
        // this.bookedShow = bookedShow;
        this.theater = theater;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public String getTheater() {
        return theater;
    }

    public void setTheater(String theater) {
        this.theater = theater;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // public Show getBookedShow() {
    // return bookedShow;
    // }

    // public void setBookedShow(Show bookedShow) {
    // this.bookedShow = bookedShow;
    // }

    public String ticketInfo() {
        return "Ticket booked for: " + this.ownerName + ", Number of seats booked : " + this.noOfSeats
                + ", In theater : " + this.theater;
    }

    public void cancelTicket() {
        this.theater = null;
        this.ownerName = null;
        this.noOfSeats = 0;

        System.out.println("Ticket Cancelled Succsfully");

    }

}
