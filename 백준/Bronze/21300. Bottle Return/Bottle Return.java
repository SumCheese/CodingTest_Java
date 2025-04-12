import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int sum = 0;
        
        for(int i = 0; i<6; i++) {
            sum += Integer.parseInt(st.nextToken())*5;
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}