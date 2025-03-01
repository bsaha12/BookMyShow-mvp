public class GuestUser extends User {

    @SuppressWarnings("unused")
    private boolean isregistered ;
    public GuestUser(String name) {
        super(name);
        isregistered = false ;
    }
    
    public void register(String name , String email , String password){
        System.out.println("User Registered Succesfully : " + name);
        isregistered = true ;
        
    }
   
}
