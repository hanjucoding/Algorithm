import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < commands.length ; i++){
            
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            int index= 0;
            for(int j = commands[i][0]-1 ; j < commands[i][1];j++){
                temp[index] = array[j];
                index++;
            }
            Arrays.sort(temp);
            arr.add(temp[commands[i][2]-1]);
        }
        
        answer = arr.stream().mapToInt(i->i).toArray();
        return answer;
    }
}