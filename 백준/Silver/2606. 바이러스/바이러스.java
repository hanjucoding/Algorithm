import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int N, T, result;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());

        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        result = 0;
        queue = new LinkedList<>();
        bfs(1);
        System.out.println(result);

    }

    static void bfs(int n) {
        visited[n] = true;
        queue.add(n);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int i = 1; i < N+1; i++) {
                if(arr[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                    result++;
                }
            }
        }
    }
}

