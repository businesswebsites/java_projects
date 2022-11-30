
public class Zahlenumrechner {

	static char[] hexTabelle = {'0','1', '2','3','4', '5','6','7', '8','9','A', 'B', 'C','D', 'E', 'F'};
	
	public static void main(String[] args) {
		System.out.println(dezNachBin(25));
		System.out.println(dezNachHex(25));
		System.out.println(binNachDez("11001"));
		System.out.println(hexNachDez("19"));


	}
	
	public static String dezNachBin(int dez) {
		
		String bin = "";
		
		while(dez>0) {
			if(dez % 2 == 0) {
				bin = "0" + bin;
			}
			if(dez % 2 == 1) {
				bin = "1" + bin;
			}
			dez = dez / 2;
		}
		return bin;
		
		
	}
	public static String dezNachHex(int dez) {
		String hex = "";
		while(dez >0) {
			hex = hexTabelle[dez % 16] + hex;
			dez = dez / 16;
		}
		return hex;
	}
	
	public static int binNachDez(String bin) {
		int dez = 0;
		
		//aus dem string ein array gemacht
		char[] tokens = bin.toCharArray();
		
		//potenz erzeugt und mit null beginnend später hochzählen
		double pow = 0;
		
		//schleife mit stringlaenge von hinten aufzählen 
		for(int i = (tokens.length -1); i>=0; i--) {
			
			//dez ist gleich dez plus von hinten aufgezaehlte einsen und nullen mit 2er potenzen multipliziert
			//String.valueof(tokens[i]) gibt die stringdarstellung des char arguments namens tokens zurück
			dez = dez + (int)((Integer.parseInt(String.valueOf(tokens[i]))  * Math.pow(2,  pow)));
			
			pow++;
		}
		return dez;
	}
	public static int hexNachDez(String hex) {
		int dez = 0;
		
		// string in ein array umgewandelt
		char[] tokens = hex.toCharArray();
		double pow = 0;
		for(int i = (tokens.length-1); i>= 0; i--) {
			int a = 0;
			
			// schleife um die hexTabelle durch zu gehen/durch zu zaehlen
			for(int j = 0; j < hexTabelle.length; j++) {
				
				// string und hexTabelle werden durchgegangen und auf ein match kontrolliert
				if(hexTabelle[j] == tokens[i])	{
					// bei einem match wird der wert von a auf j gesetzt
					a = j;
					
					//break um vorgang zu stoppen und nicht weiter durch zu suchen
					break;
				}	
			}
			
			// dez ist gleich dez plus die gefundene stelle also a und dann mal 16te potenz
			dez = dez + ( a * (int) Math.pow(16,  pow));
			pow ++;
		}
		return dez;
		
	}
	
}
