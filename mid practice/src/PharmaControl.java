public class PharmaControl {


Pharmaceutical pharmaceutical[]=new Pharmaceutical[10];
static int inventoryClerkCount=0;

public  void addToInventory(Pharmaceutical medicine){
    if(inventoryClerkCount>=pharmaceutical.length){
        System.out.println("Inventory is full");
        return;
    }
    for(int i=0;i<inventoryClerkCount;i++){
      if( pharmaceutical[i].isEquivalent(medicine)){
          System.out.println("Medicine already exists");
          return;


      }}
        pharmaceutical[inventoryClerkCount]=medicine;
        inventoryClerkCount++;
        System.out.println("Medicine added");

    }



public  void RemoveFromInventory(String medicine){
for(int i=0;i<inventoryClerkCount;i++){
    if(pharmaceutical[i]!=null && pharmaceutical[i].getMedname().equalsIgnoreCase(medicine)){
       for  (int j=i;j<inventoryClerkCount-1;j++){
            pharmaceutical[j]=pharmaceutical[j+1];

        }
        pharmaceutical[inventoryClerkCount-1]=null;
        inventoryClerkCount--;
        System.out.println("Medicine removed");
        return;
    }}
    System.out.println("Medicine not found");
}




public  void searchInInventory(String medicine){
for(int i=0;i<inventoryClerkCount;i++){
    if(pharmaceutical[i]!=null &&  pharmaceutical[i].getMedname().equalsIgnoreCase(medicine)){
        pharmaceutical[i].displaysepcs();
        System.out.println("Medicine found");
        return;
    }}
    System.out.println("Medicine not found");
}



public  void issuemedicine(String medicine){
    for(int i=0;i<inventoryClerkCount;i++){
        if(pharmaceutical[i]!=null && pharmaceutical[i].getMedname().equalsIgnoreCase(medicine)){
            for  (int j=i;j<inventoryClerkCount-1;j++){
                pharmaceutical[j]=pharmaceutical[j+1];

            }
            pharmaceutical[inventoryClerkCount-1]=null;
            inventoryClerkCount--;
            System.out.println("Medicine issued");
            return;
        }}
        System.out.println("Medicine not found");
    }




public  void restockmedicine(Pharmaceutical medicine){
    for(int i=0;i<inventoryClerkCount;i++){
        if( pharmaceutical[i].isEquivalent(medicine)){
            System.out.println("Medicine already exists");
            return;


        }}
        pharmaceutical[inventoryClerkCount]=medicine;
        inventoryClerkCount++;
        System.out.println("Medicine restocked");

    }





public  void generateReport(){
if(inventoryClerkCount==0){
    System.out.println("Inventory is empty");
    return;
}
for(int i=0;i<inventoryClerkCount;i++){
    pharmaceutical[i].displaysepcs();

}


}





}
