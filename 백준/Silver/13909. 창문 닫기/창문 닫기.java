import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;

        for(int i = 1; i <= N; i++) {
            if(i*i <= N)count++;
            else break;
        }

        System.out.println(count);

    }

}
