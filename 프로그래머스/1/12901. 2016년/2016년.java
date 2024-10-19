class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int temp = 0;
        for(int i = 1 ; i < a ; i++){
            temp+= month[i];
        }
        temp += b;
        temp%=7;
        int temp2 = 5+temp-1;
        if(temp2>6)temp2-=7;
        
        
        return day[temp2];
    }
}