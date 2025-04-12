import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cnt = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<cnt; i++) {
            String pw = br.readLine();
            
            if(pw.length() >= 6 && pw.length() <= 9) {
                bw.write("yes"+"\n");
            }
            else {
                bw.write("no"+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}