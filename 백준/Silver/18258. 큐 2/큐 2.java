import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                q.add(x);
            } else if (s.equals("pop")) {
                if (q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(q.poll()).append('\n');
                }
            } else if (s.equals("size")) {
                sb.append(q.size()).append('\n');
            } else if (s.equals("empty")) {
                if (q.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (s.equals("front")) {
                if (q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(q.element()).append('\n');
                }
            } else if (s.equals("back")) {
                if (q.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(((LinkedList<Integer>) q).getLast()).append('\n');
                }
            }
        }

        System.out.print(sb.toString());
    }
}
