package temp;

public class StringMetody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //sTRING BLA HONZA SE_UCI_JAVU prevest na string ya pomoci metod co na stringu jsou na HONZA SE UCI JaVu 
 
        String test = new String("BLA HONZA SE_UCI_JAVU");
         
        String vysledek = test.substring(4, test.length());
        vysledek = vysledek.replace("_", " ");
        vysledek = vysledek.replace("JAVU", "JaVu");
        System.out.println(vysledek.indexOf(" "));
         
        System.out.println(vysledek);
         
        //char convert = vysledek.charAt(vysledek.length());
        //vysledek.
 
 
	}

}
