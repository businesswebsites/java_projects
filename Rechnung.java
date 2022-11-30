
public class Rechnung {

	public static void main(String[] args) {
		double gesamtbetrag  = 100;
		double rechnungsbetrag;
		
		if(gesamtbetrag >= 100 && gesamtbetrag < 200) {
			rechnungsbetrag = gesamtbetrag * 0.95 ;
			System.out.println(rechnungsbetrag);
			
		}else if(gesamtbetrag >= 200 && gesamtbetrag < 250) {
			rechnungsbetrag = gesamtbetrag * 0.9;
			System.out.println(rechnungsbetrag);
			
		}else {
			rechnungsbetrag = gesamtbetrag * 0.85;
			System.out.println(rechnungsbetrag);
		}
		
		
	}

}

















