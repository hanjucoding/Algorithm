class Solution {
    public int solution(int a, int b, int n) {
        int total = 0;//총 개수
        while(n >= a){
            int temp = n%a; //안나눠 떨어지는애
            n -= temp;
            n /= a;
            n *= b;
            total += n;
            n += temp;

        }
        
        return total;
    }
}