public abstract class Pharmaceutical {

      String medname;
    String manufacturer;
    String expirydate;
instock stock;

    public Pharmaceutical(String medname, String manufacturer, String expirydate) {
        this.medname = medname;
        this.manufacturer = manufacturer;
        this.expirydate = expirydate;
    }

    public boolean isEquivalent(Pharmaceutical p) {
       return this.manufacturer.equals(p.manufacturer) && this.expirydate.equals(p.expirydate);
   }

public abstract void displaysepcs();

    public String getMedname() {
        return medname;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getExpirydate() {
        return expirydate;
    }
}
