import java.util.ArrayList;
import java.util.List;

public class Theater {
    private static int idCounter = 0 ;
    private int id ;
    private String name ;
    private String location ;
    private int capacity ;

    private List<Show> shows ;

    public Theater(String name, String location, int capacity) {
        idCounter++ ;
        this.id = idCounter;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.shows = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public void updateShow(Show oldShow , Show newShow){
        this.shows.remove(oldShow);
        this.shows.add(newShow);
    }
}
