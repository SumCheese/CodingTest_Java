import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		switch(str) {
		case"M" :	System.out.println("MatKor");
					break;
		case"W" :   System.out.println("WiCys");
					break;
		case"C" :   System.out.println("CyKor");
					break;
		case"A" :   System.out.println("AlKor");
					break;
		case"$" : 	System.out.println("$clear");
					break;
		}
	}
}
