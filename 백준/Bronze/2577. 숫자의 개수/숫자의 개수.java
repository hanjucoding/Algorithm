import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = 1;
        for(int i = 1; i <= 3; i++) {
            Long temp = Long.valueOf(br.readLine());
            N = N * temp;
        }
        String NUM = String.valueOf(N);
        int[] num = new int[10];
        for(int i = 0; i < NUM.length(); i++) {
            int n = Integer.parseInt(NUM.substring(i, i + 1));
            num[n]++;
        }
        for(int i : num){
            System.out.println(i);
        }
    }

}