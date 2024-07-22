import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean result = true;
            for(int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c =='(') stack.push(c);
                else if(stack.empty()){
                    result =false;
                    break;
                }else{
                    stack.pop();
                }
            }
            System.out.println(result && stack.empty()?"YES":"NO");
        }

    }


}