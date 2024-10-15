class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        long total = 0;
        for(long i = 1; i< count+1;i++){
            total+= i*price;
        }
        if(total<money)return 0;
        answer= total-money;
        return answer;
    }
}