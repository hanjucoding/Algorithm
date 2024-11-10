class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
 
        int ic1 = 0;
        int ic2 = 0;
 
        for (int i = 0; i < goal.length; i++) {
            if(ic1 < cards1.length && goal[i].equals(cards1[ic1])) {
                ic1++;
                continue;
            }
            
            if(ic2 < cards2.length && goal[i].equals(cards2[ic2])) {
                ic2++;
                continue;
            }
 
            answer = "No"; 
            return answer;
        }
 
        return answer;
    }
}