public class Antibiotic extends Pharmaceutical implements Classifiable{
   private  String spectrum;

    public Antibiotic(String medname, String manufacturer, String expirydate, String spectrum) {
        super(medname, manufacturer, expirydate);
        this.spectrum = spectrum;
    }
    public String getSpectrum() {
        return spectrum;

        }
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
        System.out.println("Spectrum: " + spectrum);
        System.out.println("Medicine Name: " + medname);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("ExpiryDate: " + expirydate);
    }
}
