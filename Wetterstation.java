
public class Wetterstation {

	public static void main(String[] args) {
		
		//A1
		int[] tag = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] tempe = {12,14,9,12,15,16,15,15,11,8,13,13,15,12};
		
		//A2
		int durch = 0;
		for(int i = 0; i<tempe.length; i++) {
			durch = durch + tempe[i];
		}
		durch = durch / tempe.length;
		System.out.println(durch);

	
		int max = tempe[0];
		int min = tempe[0];
		
		for(int i =0; i < tempe.length; i++) {
			if(max < tempe[i]) {
				max = tempe[i];
			}else {
				max = max;
			}
		}
		for(int i =0; i < tempe.length; i++) {
			if(min > tempe[i]) {
				min = tempe[i];
			}else {
				min = min;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
