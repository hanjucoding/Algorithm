import java.util.*;
class Solution {
    
    static List<Integer> list = new ArrayList();
    static boolean[] check;
    
    public int solution(int k, int[][] dungeons) {
        
        check = new boolean[dungeons.length];
        dfs(dungeons, k, 0);    
                
        return Collections.max(list);
    }
    
    public void dfs(int[][] dungeons, int k, int cnt){

        for(int i = 0; i<dungeons.length; i++){
            if(!check[i] && k >= dungeons[i][0]){
                check[i] = true;
                list.add(cnt+1);
                
                dfs(dungeons, k-dungeons[i][1], cnt+1);
                check[i] = false;
            }
        }
    }
}