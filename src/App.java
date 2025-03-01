import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    private List<User> users;
    private List<Theater> theaters;
    private Map<String, List<Show>> movieMap;

    public App(List<Theater> theaterList) {
        users = new ArrayList<>();
        theaters = theaterList;
        movieMap = new HashMap<>();
        generateMovieMap();
    }

    private void generateMovieMap() {
        for (Theater theater : theaters) {
            for (Show show : theater.getShows()) {
                String movieName = show.getMovie().getName();
                if (!movieMap.containsKey(movieName)) {
                    movieMap.put(movieName, new ArrayList<>());
                }
                movieMap.get(movieName).add(show);
            }
        }
    }

    public List<Show> searchShows(String movieName) throws Exception {

        if (movieMap.containsKey(movieName)) {
            return movieMap.get(movieName);
        }

        throw new Exception("No Shows Present for the given movie");
    }

    private Ticket bookTicket(Show show, User user, int seats) throws Exception {
        if (user instanceof RegisteredUser) {
            return show.bookTicket(seats, user);
        }

        throw new Exception("Please Register first to book tickets");
    }

    public static void main(String[] args) throws ParseException {
        // User
        User guest1 = new GuestUser("Ram");
        User register1 = new RegisteredUser("Shiva");
        User register2 = new RegisteredUser("Ganapati");

        // Movie
        Movie ironMan = new Movie("Iron Man", Language.ENGLISH, Genre.ACTION);
        Movie capTainAmerica = new Movie("Captain America", Language.ENGLISH, Genre.ACTION);
        Movie reminiscence = new Movie("Reminiscence", Language.ENGLISH, Genre.ACTION);

        // Theater
        Theater svf = new Theater("SVF", "Kolkata", 100);
        Theater pvr = new Theater("PVR Cinemas", "Salt Lake", 100);

        // For time SimpleDateFormatter
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd, yyyy HH:mm:ss a");

        // Shows
        Show ironManShow = new Show(formatter.parse("Friday, May 10, 2024 10:00:00 AM"), reminiscence, pvr);
        Show ironManShow2 = new Show(formatter.parse("Friday, May 15, 2024 10:00:00 AM"), reminiscence, pvr);
        Show ironManShow3 = new Show(formatter.parse("Friday, May 18, 2024 10:00:00 AM"), reminiscence, pvr);

        // App
        List<Theater> theaterList = new ArrayList<>();
        theaterList.add(pvr);
        theaterList.add(svf);

        App bookMyShow = new App(theaterList);

        // shows
        try {
            List<Show> shows = bookMyShow.searchShows(reminiscence.getName());
            // System.out.println(shows);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Book Tickets
        try {
            Ticket ticket = bookMyShow.bookTicket(ironManShow3, register2, 100);
            System.out.println(ticket.ticketInfo());
            Ticket ticket2 = bookMyShow.bookTicket(ironManShow3, guest1, 100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
