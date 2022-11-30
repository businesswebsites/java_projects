
public class Palindrome {

	public static void main(String[] args) {
		String s = "otto";
		String t = "";
		
		for(int i = s.length()-1;i>=0; i-- ) {
			char result = s.charAt(i);
			t = t + result;
		}
		System.out.println(s);
		System.out.println(t);
		
		if(s == t && t == s) {
			System.out.println("Das  Wort " + s + " ist ein Palindrom!");
		}else {
			System.out.println("Das Wort " + s + " ist kein Palindrom!");
		}
	}
		
		
	
	
}
