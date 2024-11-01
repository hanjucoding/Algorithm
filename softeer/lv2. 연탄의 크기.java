import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] stoves;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        stoves = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            stoves[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for(int i=2; i<=100; i++) {
            int cnt = 0;
            for(int j=0; j<n; j++) {
                if(stoves[j] % i == 0) cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
        
    }
}
