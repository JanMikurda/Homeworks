package temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String, List<String>> countriesByRegionMap = new HashMap<String, List<String>>();

        List<String> countriesWest = new ArrayList<String>();
        List<String> countriesEast = new ArrayList<String>();
        countriesWest.add("Germany");
        countriesWest.add("France");
        countriesByRegionMap.put("Western Europe", countriesWest);
        countriesEast.add("CZ");
        countriesEast.add("SK");
        countriesByRegionMap.put("Eastern Europe", countriesEast);

       

        // TODO - sout: 'Western Europe: Germany, France'

        
        
        
        for (String key : countriesByRegionMap.keySet())
        {
            String countries = "";
            
            for (String country : countriesByRegionMap.get(key))
            {
                countries += country + ", ";
            }
            System.out.println(key + ": " + countries.substring(0, countries.length() -2));            
        }
//TODO - trida shipment, kde bude region country, quarter, vendor a units. Dat do ni nejake hodnoty ala shipment e.g. 4 shipmenty. Construktor s parametry
        // pak muzeme udelat sorotvani treba podle units popr. secist units pro quartaly...
        // metodou to string vzpsat informace o shipmentech.
        //NASTUDOVAT KOLEKCE A COMPARABLE COLLECTIONS
        
        //sTRING BLA HONZA SE_UCI_JAVU prevest na string ya pomoci metod co na stringu jsou na HONYA SE UCI JaVu
}
}

