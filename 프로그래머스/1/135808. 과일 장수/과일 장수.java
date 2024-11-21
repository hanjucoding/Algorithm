import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer Score[] = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(Score,Collections.reverseOrder());
        // for(int i : Score)System.out.print(i);
        
        for(int i = 0 ; i < Score.length;i++){
            if((i+1)%m==0){
                answer += Score[i] * m;
            }
        }
        
        return answer;
    }
}