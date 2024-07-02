import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String k = st.nextToken();
			
			if(k.equals("1")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}else if(k.equals("2")) {	
				if(stack.empty()) {System.out.println("-1");}
				else {System.out.println(stack.pop());}
			}else if(k.equals("3")) {
				System.out.println(stack.size());
			}else if(k.equals("4")) {
				if(stack.empty()) {System.out.println("1");}
				else {System.out.println("0");}
			}else if(k.equals("5")) {
				if(stack.empty()) {System.out.println("-1");}
				else {System.out.println(stack.peek());}
			}
		}
	}
}