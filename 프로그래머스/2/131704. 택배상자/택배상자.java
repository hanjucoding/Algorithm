import java.util.*;

class Solution {
    public int solution(int[] order) {

        int[] pri = new int[order.length];
        
        for(int i = 0; i < order.length; i++){
            pri[order[i] - 1] = i;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        int temp = 0;
     
        for(int i = 0; i < pri.length; i++){
            if(pri[i] == temp){
                temp++;
            }else{
                stack.push(pri[i]);
            }
            while(!stack.isEmpty() && stack.peek() == temp){
                stack.pop();
                temp++;
            }
        }
        return temp;
    }
}