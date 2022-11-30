
public class Primzahlen {

	public static void main(String[] args) {
		int x = 25;
		for(int y=x; y >=2; y--) {
			if(x%y ==1	) {
				System.out.println(x + " modulo " + y);
				System.out.println("Ist eine Primzahl");
			}else {
				System.out.println(x + " modulo " + y);
				System.out.println("Ist keine Primzahl.");
			}
		}
	}

}
