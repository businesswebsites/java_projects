
public class MathematischeMethode {

	public static void main(String[] args) {
		System.out.println(pow(2,4));
		
	}
	public static double add(double x, double y) {
		return x + y;
	}
	public static double sub(double x, double y) {
		return x-y;
	}
	public static double mul( double x, double y) {
		double ergebnis = 0;
		if(x ==0 || y==0) {
			return 0;
		}
		if(x ==1) {
			return y;
		}
		if(y == 1) {
			return x;
		}
		while(y > 0) {
			ergebnis = ergebnis + x;
			y--;
		}
		return ergebnis;
	}
	public static double pow (int basis, int exponent) {
		double ergebnis = 0;
		while (exponent > 0) {
			ergebnis = mul(basis,basis);
		}
		return ergebnis;
	}

}
