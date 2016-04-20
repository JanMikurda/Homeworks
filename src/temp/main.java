package temp;

import java.util.Collections;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
       //7. abych mohl naplnit seznam shipmentu (class shipmentlist) musim si zavolat instanci teto tridy (neznam nevim proc)
       ShipmentList shl = ShipmentList.getInstance();
       //9. po pridani metody pro plneni ve tride shipmentlist muzu zacit nalivat shipmenty
       //shl.novyShipment(ns); a yjistil jsem, ye potrebuji kontruktor pro novy shipment, protoye to co jsem v shipmentlist 
       //tride stvoril funguje jako normalni promenna
        
       //11. v tride shipmentlist jsem vytvoril lepsi metodu, ktera mi dovoli nalit shipmenty
       shl.novyShipment("CZ", "East", "Dell", 210);
       shl.novyShipment("CZ", "East", "Apple", 100);
       shl.novyShipment("D", "West", "Dell", 105);
       shl.novyShipment("D", "West", "ASUS", 350);
        
      // System.out.println(shl);
       
       Collections.sort(shl.getShipmenty());
        
       //12. kontrola
       //System.out.println();
       //Chybi metoda, ktera by list shipmentu umela vratit
        
       //14. kontrola po deklaraci metody vypis
       System.out.println(shl.vypisto().toString());

	}

}
