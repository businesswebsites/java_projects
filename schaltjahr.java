
public class schaltjahr {

	public static void main(String[] args) {
		istSchaltjahr(2014);
		
	}
	public static boolean istSchaltjahr(int jahr) {
		if(jahr % 4 == 0) {
			if(jahr % 100 == 0 && jahr % 400 == 0) {
				System.out.println("Schaltjahr!");
				return true;
			}else {
				if(jahr % 100 == 0  && jahr % 400 != 0) {
					System.out.println("Kein Schaltjahr.");
					return false;
				}
			}
			return true;
		} 
		return false;
				
		
	}

}
