import java.io.*;
import java.util.*;

public class Main {
    static int total; // 필요한 지렁이 수
    static int T, M, N; // 테케수, 가로, 세로크기
    static int[][] field; // 밭 배열

    static int[] dx = {1, 0, -1, 0}; // x방향으로 탐색
    static int[] dy = {0, 1, 0, -1}; // y방향으로 탐색
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int a = 0; a < T; a++) {
            total = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            field = new int[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[y][x] = 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (field[i][j] == 1) {
                        total++;
                        bfs(i, j);
                    }
                }
            }
            System.out.println(total);
        }
    }

    static void bfs(int x, int y) {
        queue.add(new int[]{x, y});
        field[x][y] = 0;
        while (!queue.isEmpty()) {
            int[] element = queue.poll();
            int cx = element[0];
            int cy = element[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M && field[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny});
                    field[nx][ny] = 0;
                }
            }
        }
    }
}
