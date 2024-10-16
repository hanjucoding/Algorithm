class Solution {
    public int[] solution(int n, int m) {
        int lcm = 0;
        int gcd = 1;
        
        int a = n;
            int b = m;
        if(n>m){
            b = n;
            a = m;
        }
        for(int i = 1; i < b+1;i++){
            if(a % i ==0 && b%i==0){
                gcd = i;
            }
        }
        lcm = a * b / gcd;
        int[] answer = {gcd,lcm};
        return answer;
    }
}