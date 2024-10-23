public class InventoryClerk {

    String clerkID;
    String authCode;
    Pharmaceutical pharmaceutical[];

    public InventoryClerk(String clerkID, String authCode) {
        this.clerkID = clerkID;
        this.authCode = authCode;
        pharmaceutical=new Pharmaceutical[10];
    }
public  void exceptionhandling(Pharmaceutical medicine){
    System.out.println("medicine already exists");

}






}
