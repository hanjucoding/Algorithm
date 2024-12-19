import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] alp = new int[26];
        String s = br.readLine();
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            alp[c - 97]++;
        }
        
        for (int i=0; i<26; i++) {
            System.out.print(alp[i]+" ");
        }
    }
}