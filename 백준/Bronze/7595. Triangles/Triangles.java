import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j<=i; j++) {
					bw.write("*");
				}
				bw.write("\n");
			}
		}
		bw.flush();
	}
}
