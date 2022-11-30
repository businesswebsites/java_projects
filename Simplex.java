public class Simplex {

	public static void main(String[] args) {
		System.out.println("Erstes Tableau:");
		
		//Idee mit Arrays arbeiten 
		double reihe1[] = {10, 0, 0, 0};
		double reihe2[] = {1, 0, 0, 0};
		double reihe3[] = {1, 0, 0, 0};
		double reihe4[] = {1, 0, 0, 0};
		
		//Idee mit variablen arbeiten (eher schlecht)
		double a = 1;
		double b = 2;
		double c = 3;
		double d = 10;
		double x = 1;
		double y = 1;
		double z = 1;
		
		//Spalte x
		double e1 = 1;
		double e2 = 2;
		double e3 = 3;
		
		//Spalte y
		double e4 = 4;
		double e5 = 5;
		double e6 = 6;
		//Spalte z
		double e7 = 7;
		double e8 = 8;
		double e9 = 9;
		
		System.out.println("");
		
		System.out.println("         " + " |   " + "a" + " | " + "b" + "   | " + "c");
		System.out.println("    |" + d + " | " + a + " | " + b + " | " + c);
		System.out.println("| x | " + x  + " | " + e1 + " | " + e2 + " | " + e3);
		System.out.println("| y | " + y  + " | " + e4 + " | " + e5 + " | " + e6);
		System.out.println("| z | " + z  + " | " + e7 + " | " + e8 + " | " + e9);
		
		System.out.println("");
		
		System.out.println("Zweites Tableau:");
		System.out.println("");
		
		if(pivotZeile(a,b,c) == a) {
			
			System.out.println("a ist das kleinste!");
			System.out.println("a = " + a + " , b = " + b + " , c = " + c);
			
			x = pivotSpalte(x,e1);
			y = pivotSpalte(y,e4);
			z = pivotSpalte(z,e7);
			
			if(x<y &&  x<z) {
				e1 = diffPivot(e1, e1);
				e2 = diffPivot(e2, e1);
				e3 = diffPivot(e3, e1);
			}
			if(y<x && y<z) {
				e4 = diffPivot(e4, e4);
				e5 = diffPivot(e5, e4);
				e6 = diffPivot(e6, e4);
			}
			if(z<x && z <y) {
				e7 = diffPivot(e7, e7);
				e8 = diffPivot(e8, e7);
				e9 = diffPivot(e9, e7);
			}
		}
		if(pivotZeile(a,b,c) == b) {
			
			System.out.println("b ist das kleinste!");
			System.out.println("a = " + a + " , b = " + b + " , c = " + c);
			
			x = pivotSpalte(x,e2);
			y = pivotSpalte(y,e5);
			z = pivotSpalte(z,e8);
			
			if(x<y &&  x<z) {
				e1 = diffPivot(e1, e2);
				e2 = diffPivot(e2, e2);
				e3 = diffPivot(e3, e2);
			}
			if(y<x && y<z) {
				e4 = diffPivot(e4, e5);
				e5 = diffPivot(e5, e5);
				e6 = diffPivot(e6, e5);
			}
			if(z<x && z <y) {
				e7 = diffPivot(e7, e8);
				e8 = diffPivot(e8, e8);
				e9 = diffPivot(e9, e8);
			}
		}
		if(pivotZeile(a,b,c) == c) {
			
			System.out.println("c ist das kleinste");
			System.out.println("a = " + a + " , b = " + b + " , c = " + c);
			
			x = pivotSpalte(x,e3);
			y = pivotSpalte(y,e6);
			z = pivotSpalte(z,e9);
			
			if(x<y &&  x<z) {
				e1 = diffPivot(e1, e3);
				e2 = diffPivot(e2, e3);
				e3 = diffPivot(e3, e3);
				
			}
			if(y<x && y<z) {
				e4 = diffPivot(e4, e6);
				e5 = diffPivot(e5, e6);
				e6 = diffPivot(e6, e6);
			}
			if(z<x && z <y) {
				e7 = diffPivot(e7, e9);
				e8 = diffPivot(e8, e9);
				e9 = diffPivot(e9, e9);
			}
		}
		
		
		System.out.println("         " + "                  | " + "a" + "   | " + "b" + "   | " + "c");
		System.out.println("    | " + d + " | " + a + " | " + b + " | " + c);
		System.out.println("| x | " + x  + "  | " + e1 + " | " + e2 + " | " + e3);
		System.out.println("| y | " + y  + " | " + e4 + " | " + e5 + " | " + e6);
		System.out.println("| z | " + z  + " | " + e7 + " | " + e8 + " | " + e9);
		
		System.out.println("");
		System.out.println("Drittes Tableau:");
		
		
		
		System.out.println("Tableau optimiert.");
		
	}
	
	//
	public static double pivotZeile(double u, double v, double w) {
		double wert = 0;
		if(u < v && u < w) {
			wert = wert + u;
		}
		if(v < u && v < w) {
			wert = wert + v;		}
		if(w < u && w < v) {
			wert = wert + w;
		}
		return wert;
	}
	
	//
	public static double pivotSpalte(double a, double b) {
		double wert = 0;
		wert = a /b;
		
		return wert;
	}
	
	public static double diffPivot(double pivot, double a) {
		double wert = 0;
		
		wert = a / pivot; 
		
		return wert;
	}
	

}

