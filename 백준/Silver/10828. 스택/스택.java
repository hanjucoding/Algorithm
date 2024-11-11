import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String action = st.nextToken();
            switch(action){
                case "push":
                    int a = Integer.parseInt(st.nextToken());
                    stack.push(a);
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    else{
                        System.out.println(stack.pop());
                        break;
                    }
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        System.out.println(1);
                        break;
                    }
                    else{
                        System.out.println(0);
                        break;
                    }
                case "top":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    else{
                        System.out.println(stack.peek());
                        break;
                    }
            }

        }
    }

}