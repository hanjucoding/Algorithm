class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]==' '){
                answer += " ";
            }else{
                answer += caesar(arr[i],n);
            }
        }
        
        return answer;
    }
    static String caesar(char c,int n){
    int temp = (byte) c;
    int num = temp+n;
    if((temp <= 90 && num>90)||(temp >= 97 && num> 122)){
        num -= 26;
    }
    return Character.toString((char)num);
}
}

