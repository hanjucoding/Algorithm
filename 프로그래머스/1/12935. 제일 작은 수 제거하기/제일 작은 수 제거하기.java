class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[arr.length-1];
        int min_index = 0;
        for(int i = 1 ; i < arr.length;i++){
            if(arr[min_index]>arr[i])min_index=i;
        }
        int index=0;
        for(int i = 0 ; i < arr.length;i++){
            if(i==min_index)continue;
            answer[index++] = arr[i];
        }
        return answer;
    }
}