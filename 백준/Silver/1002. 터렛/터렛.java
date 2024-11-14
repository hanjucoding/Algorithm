import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            double r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            double r2 = Integer.parseInt(st.nextToken());

            int result = calculate(x1, y1, r1, x2, y2, r2);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
    public static int calculate(int x1, int y1, double r1, int x2, int y2, double r2) {
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        if(x1 == x2 && y1 == y2) {
            if(r1 == r2) return -1;
            else return 0;
        }
        else if(Math.abs(r1 - r2) >= distance) {
            if(Math.abs(r1 - r2) == distance) return 1;
            else return 0;
        }
        else {
            if(distance > r1 + r2) return 0;
            else if(distance == r1 + r2) return 1;
            else return 2;
        }
    }
}