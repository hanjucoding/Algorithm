import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		String num = sc.next();
		String[] Num = num.split("");
		for(int i = 0; i < N; i++)sum += Integer.parseInt(Num[i]);
		System.out.println(sum);
		
		
	}

}
