class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int x = 0;
        for(String str : arr){
            if(str.equals(" ")){
                answer+= " ";
                x = 0;
            }
            else{
                if(x%2==0){
                    answer += str.toUpperCase();x++;
                }else{
                    answer += str.toLowerCase();x++;
                }
            }
        }
        
        return answer;
    }
}