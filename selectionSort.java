
public class selectionSort {

	public static void main(String[] args) {
		int [] liste = {5, 8, 3 ,6 ,9 ,4 , 2};
		
		for(int j= 0; j< liste.length;j++) {
			for(int i = j+1; i<= liste.length; i++) {
				if(liste[j] > liste[i]) {
					swap(liste, j, i );
				}
			}		
		}
		System.out.println(liste);
	}
	public static void swap (int liste[], int pos1, int pos2) {
		int tmp = liste[pos1];
		liste[pos1] = liste[pos2];
		liste[pos2] = tmp;
	}
		
}
