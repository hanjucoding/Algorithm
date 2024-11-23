import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer,-1);
        String[] arr = s.split("");
        for(int i = 1;i<arr.length;i++){
            for(int j = i-1 ; j >= 0 ; j--){
                if(arr[i].equals(arr[j])){
                    answer[i] = i-j;
                    break;
                }
            }
        }
        return answer;
    }
}