import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("       _.-;;-._"+"\n");
        bw.write("'-..-'|   ||   |"+"\n");
        bw.write("'-..-'|_.-;;-._|"+"\n");
        bw.write("'-..-'|   ||   |"+"\n");
        bw.write("'-..-'|_.-''-._|"+"\n");
        bw.flush();
        bw.close();
    }
}