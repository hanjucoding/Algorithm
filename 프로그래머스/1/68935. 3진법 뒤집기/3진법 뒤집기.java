class Solution {
    public int solution(int n) {
        if(n<3)return n;
        int answer = 0;
        String temp ="";
        while(true){
            temp += Integer.toString(n % 3);
            n /= 3;
            if(n<3){
                temp += Integer.toString(n);
                break;
            }
        }
        answer = Integer.parseInt(temp, 3);
        return answer;
    }
}