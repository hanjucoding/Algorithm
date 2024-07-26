import java.io.*;
import java.util.*;

class Solution {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int N, M, result;
    static Queue<Integer[]> queue;

    public int solution(int[][] maps) {
        map = maps;
        N = maps.length;
        M = maps[0].length;
        queue = new LinkedList<>();
        visited = new boolean[N][M];


        bfs(0,0);
        if(maps[N-1][M-1] == 1){
            return -1;
        }else
            return maps[N-1][M-1];


    }
    static void bfs(int s1, int s2) {
        queue.add(new Integer[]{s1, s2});
        visited[s1][s2] = true;
        result++;
        while (!queue.isEmpty()) {
            Integer[] temp = queue.poll();
            int cx = temp[0];
            int cy = temp[1];
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M &&
                        !visited[nx][ny] && map[nx][ny] != 0) {
                    visited[nx][ny] = true;
                    map[nx][ny] = map[cx][cy] + 1;
                    queue.add(new Integer[]{nx, ny});


                }
            }
        }
    }
}

