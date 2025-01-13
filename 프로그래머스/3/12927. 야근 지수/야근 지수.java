import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());
        
        for(int work: works) {
            pq.offer(work);
        }
        while(n>0) {
            int value = pq.poll();
            pq.offer(value > 0 ? value - 1 : value);
            n--;
        }

        for(int value: pq) {
            if(value == 0) {
                continue;
            }
            answer += Math.pow(value,2);
        }

        return answer;
    }
}