import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제
//에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾는 유명한 알고리즘이다.
//이 알고리즘은 다음과 같다.
//
//1)2부터 N까지 모든 정수를 적는다.
//2)아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
//3)P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
//4)아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
//N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 N과 K가 주어진다. (1 ≤ K < N, max(1, K) < N ≤ 1000)
//
//출력
//첫째 줄에 K번째 지워진 수를 출력한다.

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr= new int[N+1];
        for(int i = 0 ;i <= N;i++)arr[i] = i;
        arr[1] = 0;
        int count =0;
        int answer = 0;

        //2부터 쭉 검사 시작
        //지우는 애들은 0으로 바꾸기
        A: for(int i = 2; i <= N; i++) {
            //0이 아닌애들 0으로 바꾸고 count올리기
            if(arr[i]!=0){
                answer = arr[i];
                count++;
                if(count == K)break A;
                arr[i] = 0;
                //i의 배수도 0으로 바꾸기
                for(int j = i*2 ; j <= N; j += i){
                    if(arr[j] != 0){
                        answer = arr[j];
                        count++;
                        if(count == K)break A;
                        arr[j] = 0;
                    }
                }

            }
        }

        System.out.println(answer);


    }
}
