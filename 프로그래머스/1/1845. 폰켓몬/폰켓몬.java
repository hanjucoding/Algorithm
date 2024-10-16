import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        Set<Integer> arr = new HashSet<>();
        for (int i: nums){
            arr.add(i);
        }
        if(arr.size()<answer)return arr.size();
        return answer;
    }
}