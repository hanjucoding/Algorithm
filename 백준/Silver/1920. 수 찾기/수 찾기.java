import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        int[] result = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            //result[i] = binarySearch(A, target, 0, A.length - 1) > -1 ? 1 : 0;
            result[i] = Arrays.binarySearch(A, target) > -1 ? 1 : 0;
//            매개변수:
//                  a: 정렬된 배열입니다. 배열이 정렬되어 있어야만 정확한 결과를 보장합니다.
//                  key: 배열에서 검색할 값입니다.
//            반환 값:
//                  메서드는 배열에서 key 값의 인덱스를 반환합니다. 만약 key 값이 배열에 존재하지 않으면 음수 값을 반환합니다. 반환된 음수 값의 절댓값에 1을 빼면 key가 삽입될 위치를 알 수 있습니다.
        }

        for (int r : result) {
            System.out.println(r);
        }
    }

}