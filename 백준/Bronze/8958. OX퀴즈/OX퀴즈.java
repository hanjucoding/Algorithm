import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N ; i++){
            String answer = br.readLine();
            int score = 0;
            int seq = 1;
            for(int j = 0 ; j < answer.length() ; j++){
                if(answer.charAt(j) == 'O'){
                    score += seq;
                    seq++;
                }else{
                    seq =1;
                }
            }
            System.out.println(score);
        }
    }

}