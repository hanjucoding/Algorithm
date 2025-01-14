import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        if(s / n == 0) return new int[]{-1};
        else{
            int count  = s / n;
            int temp = s % n;
            int [] answer = new int [n];
            for(int i = 0; i < n; i++){
                if(i >= n - temp ){
                    answer[i] = count + 1;
                }
                else answer[i] = count;
            }
            return answer;
        }
    }
}