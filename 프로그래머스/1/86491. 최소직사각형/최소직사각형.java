class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i = 0 ; i < sizes.length ; i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        int max_a = 0;
        int max_b = 0;
        for(int i = 0 ; i < sizes.length ; i++){
            if(sizes[i][0]>max_a){
                max_a = sizes[i][0];
            }
        }
        for(int i = 0 ; i < sizes.length ; i++){
            if(sizes[i][1]>max_b){
                max_b = sizes[i][1];
            }
        }
        return max_a*max_b;
    }
}