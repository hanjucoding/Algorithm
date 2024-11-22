class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0 ; i < babbling.length ; i++){
            answer += check(babbling[i]);
        }
        return answer;
    }
    
    public int check(String talk){
        if(talk.contains("ayaaya")||talk.contains("yeye")||
          talk.contains("woowoo")||talk.contains("mama"))return 0;
        
        talk = talk.replace("aya"," ");
        talk = talk.replace("ye"," ");
        talk = talk.replace("woo"," ");
        talk = talk.replace("ma"," ");
        talk = talk.replace(" ","");
        if(talk.length()==0)return 1;
        else return 0;
    }
}
