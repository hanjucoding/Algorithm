import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int N, M, result;
    static Queue<Integer[]> queue;
    static int depth;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] temp = s.split("");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

//        result = 0;
        bfs(0, 0);
//        System.out.println(result);
        System.out.println(map[N - 1][M - 1]);
    }

    static void bfs(int s1, int s2) {
        queue.add(new Integer[]{s1, s2});
        visited[s1][s2] = true;
        result++;
        A:while (!queue.isEmpty()) {
            Integer[] temp = queue.poll();
            int cx = temp[0];
            int cy = temp[1];
            for(int i = 0 ; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && ny >= 0 && nx < N && ny < M &&
                        !visited[nx][ny] && map[nx][ny] != 0) {
                    visited[nx][ny] = true;
                    map[nx][ny] = map[cx][cy]+1;
                    queue.add(new Integer[]{nx, ny});
//                    result++;
//                    for(int a = 0; a < N; a++) {
//                        for (int b = 0; b < M; b++) {
//                            System.out.print(visited[a][b] ? map[a][b] : 0);
//                        }
//                        System.out.println();
//                    }

                }
            }
        }
    }
}



