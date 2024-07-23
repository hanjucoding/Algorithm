import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        System.out.println(factorial(N));
        }


        static long factorial(long n) {
            if(n == 0) return 1;
            else return n * factorial(n-1);
        }
    }


