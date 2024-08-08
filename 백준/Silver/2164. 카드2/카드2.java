import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < N+1; i++) {
            q.add(i);
        }
        int temp = 0;
        while (!q.isEmpty()) {
            temp = q.poll();
            if(q.isEmpty())break;

            temp  =q.poll();
            q.add(temp);
        }
        System.out.println(temp);
    }

}