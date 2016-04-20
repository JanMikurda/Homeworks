package temp;

import java.util.ArrayList;
import java.util.List;

public class ShipmentList {

	   //3.sem se pokusim vytvorit seznam shipmentu za pomoci tridy Shipment. data budu krmit ze tridy main
    
    //5. jeste nevim proc, ale operuje se tu s instanci tridy (neznam!)
    private static final ShipmentList INSTANCE = new ShipmentList();
     
     
    //4. nechapu proc, ale vytvarim list z tridy shipment. tedy asi vytvarim list shipmentu :)
    private List<Shipment>shipmenty;
     
    //15. Protoye jsem se setkal s NPE, zjistil jsem po jistem badani, ze misto tho abzch mel 
    // array shipmentu, tak mam list jen na jeden. Snad tedy takto:
    // SAM BYCH NA TO NIKDY NEPRISEL
    private ShipmentList(){
        shipmenty = new ArrayList<>();
    }
     
     
    //8. sem bych asi mel pridat metodu, ktera umozni nacist/poslat data z main tridy !a prida data do SEZNAMU/LISTU!
    public void novyShipment(Shipment ns){
        shipmenty.add(ns);
    }
     
    //10. metoda pod bodem 8. neni to co jsem potreboval, potrebuji lepsi konstruktor.
    // takovy konstruktor, ktery sezere vsechny parametry shipmentu tak jak jsou deklarovane v Shipment tride
    public void novyShipment(String country, String region, String vendor, int units){
        shipmenty.add(new Shipment(country, region, vendor, units));
    }
     
    //13. konstrukce metody co vrati objekt shipment jako list v instanci tridy shipmentlist
    public List<Shipment> vypisto(){
        List<Shipment>vypis = new ArrayList<>(shipmenty);
        return vypis;
    }
     
    
    @Override
	public String toString() {
		return "ShipmentList [shipment=" + shipmenty + "]";
	}


	//6. Proto aby instance tridy sla nejak cist/volat/zapisovat do ni data, je treba pro ni deklarovat metodu (taky neznam!). 
    //6. Pak je mozne z main classy volat metodu getInstance pro tridu shipmentlist
    public static ShipmentList getInstance(){
        return INSTANCE;
}


	public List<Shipment> getShipmenty() {
		return shipmenty;
	}


	public void setShipmenty(List<Shipment> shipmenty) {
		this.shipmenty = shipmenty;
	}


	
}
