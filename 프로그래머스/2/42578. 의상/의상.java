import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        for(String[] c : clothes){
            if(map.containsKey(c[1])){
                map.put(c[1],map.get(c[1])+1);
            }else{
                map.put(c[1],1);
            }
        }
        if(map.size()!=1){
            int temp = 1;
            for(String k : map.keySet()){
                temp *= map.get(k)+1;
            }
            answer += temp-1;
        }else{
            answer += clothes.length;
        }
        
    
        return answer;
        
    }
}