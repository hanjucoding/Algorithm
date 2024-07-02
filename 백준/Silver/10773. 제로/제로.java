import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < K ; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n!=0)stack.add(n);
			else stack.pop();
		}
		int result=0;
		for(int i : stack) {
			result += i;
		}
		System.out.println(result);
	}
}
