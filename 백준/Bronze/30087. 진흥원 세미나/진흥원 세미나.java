import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 int N = Integer.parseInt(br.readLine());
		 
		 for(int i = 0; i<N; i++) {
			 String str = br.readLine();
			 
			 switch(str) {
			 	case "Algorithm": bw.write("204\n");
			 					  break;
			 	case "DataAnalysis" : bw.write("207\n");
			 						  break;
			 	case "ArtificialIntelligence" : bw.write("302\n");
			 								    break;
			 	case "CyberSecurity" : 	bw.write("B101\n");
			 							break;
			 	case "Network" : bw.write("303\n");
			 					 break;
			 	case "Startup" : bw.write("501\n");
			 					 break;
			 	case "TestStrategy" : bw.write("105\n");
			 						  break;
			 }
			 
		 }
		 
		 bw.flush();
		 
	}
}
