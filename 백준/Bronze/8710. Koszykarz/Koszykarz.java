import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		
		while(true) {
			if(x >= y) {
				bw.write(Integer.toString(cnt));
				break;
			}
			else {
				cnt++;
				x += m;
			}
		}
		bw.flush();
	}
}