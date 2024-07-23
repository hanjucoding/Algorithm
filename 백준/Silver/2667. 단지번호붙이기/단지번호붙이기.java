import java.io.*;
import java.util.*;

public class Main {
    static int total = 0;
    static int N;
    static int[][] map;
    static int size;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Integer[]> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] str = s.split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    size = 0;
                    total++;
                    bfs(i, j);
                    list.add(size);
                }

            }
        }
        System.out.println(total);
        int[] result = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        for (int i : result) {
            System.out.println(i);
        }
    }

    static void bfs(int x, int y) {
        queue.add(new Integer[]{x, y});
        map[x][y] = 0;
        size++;
        while (!queue.isEmpty()) {

            Integer[] element = queue.poll();
            int cx = element[0];
            int cy = element[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N && map[nx][ny] == 1) {
                    queue.add(new Integer[]{nx, ny});
                    map[nx][ny] = 0;
                    size++;
                }

            }
        }
    }
}