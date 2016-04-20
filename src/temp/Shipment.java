package temp;

public class Shipment implements Comparable<Shipment> {
	 
    //1. deklaroval jsem hodnotz pro tridu shipment
    private int units;
    private String region;
    private String country;
    private String vendor;
     
    //2. protoze budu mit vice shipmentu ney jeden, potrebuji vztvorit metodu, ktera umoyni k promennym pristoupit z venku 
    //2. z jine tridy. --Vytvarim tedy konstruktor instance tridy?--
    public Shipment(String country, String region, String vendor, int units){
        this.country = country;
        this.region = region;
        this.vendor = vendor;
        this.units = units;
}
 
    public String getCountry(){
        return country;
    }

    
	public int getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return "Shipment [units=" + units + ", region=" + region + ", country=" + country + ", vendor=" + vendor + "]";
	}

	@Override
	public int compareTo(Shipment shipment) {
		// TODO Auto-generated method stub
		if (this.getUnits() > shipment.getUnits()){
			return 1;
		}
		else if (this.getUnits() < shipment.getUnits()){
		return -1;	
		}
		return 0;
	}
     
     
     
     
     
     
     
     
        // TODO Auto-generated method stub
         
//          public Shipment(String country2, String region2, String vendor2, int units2) {
//      // TODO Auto-generated constructor stub
//              this.country = country2;
//              this.region = region2;
//              this.vendor = vendor2;
//              this.units = units2;
//              
//  }
//          int units;
//          String region;
//          String country;
//          String vendor;
 
}
