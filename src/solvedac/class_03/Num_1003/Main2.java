package solvedac.class_03.Num_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
        입력 받을 테스트케이스 T의 개수
         */
        int T = Integer.parseInt(br.readLine());

        /*
        테스트케이스만큼 반복문 실행
         */
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            /*
            피보나치 수열은 N = (N-1) + (N-2)의 개념이기 떄문에
            N이 0 또는 1일 경우를 고려해서 N+2개의 배열 선언
             */
            int[] count = new int[N+2];
            count[0] = 0;
            count[1] = 1;

            if (N == 0) {
                sb.append(1).append(" ").append(0).append("\n");
            } else if (N == 1) {
                sb.append(0).append(" ").append(1).append("\n");
            } else if (N >= 2) {
                for(int j = 2; j <= N; j++) {
                    count[j] = count[j-1] + count[j-2];
                }
                sb.append(count[N - 1]).append(" ").append(count[N]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
