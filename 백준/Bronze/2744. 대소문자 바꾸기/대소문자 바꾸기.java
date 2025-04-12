import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String answer = "";
		
		for(int i = 0; i<str.length(); i++) {
			char temp = str.charAt(i);
			
			if(Character.isUpperCase(temp)) {
				answer += Character.toLowerCase(temp);
			}
			
			else {
				answer += Character.toUpperCase(temp);
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
