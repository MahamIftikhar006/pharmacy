public class Analgesic extends Pharmaceutical implements Classifiable{
    String Paintype;

    public Analgesic(String medname, String manufacturer, String expirydate, String paintype) {
        super(medname, manufacturer, expirydate);
        Paintype = paintype;
    }
    public String getPaintype() {
        return Paintype;}
        @Override
        public void addMedicine(){
            System.out.println("Medicine added");
        }
        @Override
        public void removeMedicine(){
            System.out.println("Medicine removed");
        }
        @Override
        public void searchMedicine(){
            System.out.println("Medicine searched");
        }


    @Override
    public void displaysepcs(){

        System.out.println("Paintype: " + Paintype);
        System.out.println("Medicine Name: " + medname);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("ExpiryDate: " + expirydate);
        System.out.println("instock  or not: " +stock);



    }

}
