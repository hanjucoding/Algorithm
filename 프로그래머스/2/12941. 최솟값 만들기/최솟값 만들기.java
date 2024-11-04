import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int n = B.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = B[i];
            B[i] = B[n - 1 - i];
            B[n - 1 - i] = temp;
        }
        
        for(int i = 0 ;  i < A.length; i++){
            answer+=A[i]*B[i];
        }
        return answer;
    }
}
