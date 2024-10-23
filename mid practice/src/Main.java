//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            PharmaControl pharmaControl = new PharmaControl();
        //creating sample medicines
Antibiotic amoxillian = new Antibiotic("Amoxillian","ABC pharma","2024-12-01","Broad");
Analgesic ibuprofan = new Analgesic("Ibuprofan","XYZ pharma","2024-05-15","Acute");
Antibiotic ciproflaoxacin=new Antibiotic("ciproflaoxacin","123 Pharma","2023-06-15","Broad");
        Analgesic paracetamol = new Analgesic("Paracetamol","456 pharma","2025-09-30","General");
        Antibiotic erthromycin = new Antibiotic("Erthromycin","789 pharma","2022-11-20","Narrow");
//Add medicine to inventory
        pharmaControl.addToInventory(amoxillian);
        pharmaControl.addToInventory(ibuprofan);
        pharmaControl.addToInventory(ciproflaoxacin);
        pharmaControl.addToInventory(paracetamol);
        pharmaControl.addToInventory(erthromycin);

        //Search for medicine
        System.out.println("Search results for Amoxillian:");
        pharmaControl.searchInInventory("Amoxillian");

        //Remove from Inventory
        pharmaControl.RemoveFromInventory("Ibuprofan");

        //Try searching for remove medicine
        System.out.println("Search results for Ibuprofan:");
pharmaControl.searchInInventory("Ibuprofan");


}}