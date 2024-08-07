import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < N ; i++){
            queue.add(arr[i]);
        }
        int n = 1;
        while(!queue.isEmpty()||!stack.isEmpty()){
            while(queue.contains(n)){
                int temp = queue.poll();
                if(temp != n){
                    stack.push(temp);
                }else{
                    break;
                }
            }
            if(stack.contains(n)){
                int temp = stack.pop();
                if(temp != n){
                    System.out.println("Sad");
                    return;
                }else{
                    continue;
                }
            }
            n++;

            if(n==N){
                System.out.println("Nice");
                return;
            }
        }

    }
}
