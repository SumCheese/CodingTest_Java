import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double num = (Integer.parseInt(st.nextToken())+1)*(Integer.parseInt(st.nextToken())+1)/(Integer.parseInt(st.nextToken())+1) -1;
        bw.write(Integer.toString((int)num));
        bw.flush();
        bw.close();
    }
}