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

        //bfs로 풀기
        queue = new LinkedList<>();
//        result = 0;
//        bfs(1);
//        System.out.println(result);

        //dfs로 풀기
        result = 0;
        dfs(1);
        System.out.println(result - 1);
    }

    static void dfs(int V) {
        visited[V] = true;
        result++;
        for (int i = 0; i < N + 1; i++) {
            if (arr[V][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int n) {
        visited[n] = true;
        queue.add(n);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int i = 1; i < N + 1; i++) {
                if (arr[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                    result++;
                }
            }
        }
    }


}



