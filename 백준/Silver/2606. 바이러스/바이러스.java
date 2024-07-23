import java.io.*;
import java.util.*;

public class Main {
    static int result = 0;
    static int node,branch;
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        branch = Integer.parseInt(br.readLine());

        arr = new int[node+1][node+1];
        visited = new boolean[node+1];
        for (int i = 0; i < branch; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        dfs(1);
        System.out.println(result-1);
    }
    static void dfs(int V) {
        visited[V] = true;
        result++;
        for (int i = 0; i < node+1; i++) {
            if (arr[V][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}