
public class Quersummen {

	public static void main(String[] args) {
		//System.out.println(quer(135));
		//querVonBis(0,1000,15);
		querVonBisViel(0,1000,5);
	}
	public static int quer(int zahl) {
		int zahl1 = 0;
		while(zahl>0) {
			zahl1 = zahl1 + (zahl % 10);
					
			zahl = zahl/10;
		}
	return zahl1;
	}
	
	// gib die ersten zahlen von 0-1000 aus welche die quersumme 15 haben
	public static void querVonBis(int zahlvon, int zahlbis, int quersumme){
		for(int i = zahlvon; i<= zahlbis; i++) {
				int qs = quer(i);
				if(qs == quersumme) {
					System.out.println(i);
			}
		}
	}
	public static void querVonBisViel(int zahlvon, int zahlbis, int quersumme) {
		for(int i = zahlvon; i<= zahlbis; i++) {
			int qs = quer(i);
			if(0 != qs && 0 == (qs % quersumme)) {
				System.out.println(i);
			}
		}
	}
	
	
	
}
