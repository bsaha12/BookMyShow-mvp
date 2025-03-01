import java.util.ArrayList;
import java.util.List;

public class RegisteredUser extends User {
    @SuppressWarnings("unused")
    private List<Ticket> bookingHistory ;
    @SuppressWarnings("unused")
    private boolean isLoggedIn ;

    public RegisteredUser(String name) {
        super(name);
        this.bookingHistory = new ArrayList<>();
        isLoggedIn = false ;
    }

    public void login(String name , String pass){
        System.out.println("User Logged In : "+ name);
        isLoggedIn = true ;
    }
    
}
