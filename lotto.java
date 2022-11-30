
public class lotto {

	public static void main(String[] args) {
			int a;
			int b;
			int c;
			int d;
			int e;
			int f;
			//int[] sechs = {a,b,c,d,e,f};
			for( a= 0 ; a <2; a++) {
				for( b = 0; b <2; b++) {
					for (c = 0; c<2; c++) {
						for( d = 0; d<2; d++) {
							for( e = 0; e<2; e++) {
								for(f = 0; f<2; f++) {
									int[] sechs = {a,b,c,d,e,f};
									/*sechs[0] = sechs[a];
									sechs[1] = sechs[b];
									sechs[2] = sechs[c];
									sechs[3] = sechs[d];
									sechs[4] = sechs[e];
									sechs[5] = sechs[f];
									*/
									
									//sechs[a] = a;
									

									System.out.println(a + "," + b+ "," + c + "," + d + "," + e + "," + f);
								}
							}
						}
					}
				}
			}
	}
	
}


