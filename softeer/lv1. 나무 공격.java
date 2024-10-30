import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] map;
    static int first,trash;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] temp = s.split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }
        st = new StringTokenizer(br.readLine());
        first = Integer.parseInt(st.nextToken()) - 1;
        trash = Integer.parseInt(st.nextToken());
        attack(first);
        // System.out.println(first);
        st = new StringTokenizer(br.readLine());
        first = Integer.parseInt(st.nextToken()) - 1;
        trash= Integer.parseInt(st.nextToken());
        attack(first);
        // System.out.println(first);

        int result = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
               // System.out.print(map[i][j]);
                if(map[i][j]==1)result++;
            }//System.out.println();
        }
        System.out.println(result);
    }

    public static void attack(int start){
        for(int i = start ; i <= start+4 ; i++){
            for(int j = 0 ; j < m;j++){
                if(map[i][j]==1){
                    map[i][j]=0;
                    break;
                }
                
            }
        }
    }
}
