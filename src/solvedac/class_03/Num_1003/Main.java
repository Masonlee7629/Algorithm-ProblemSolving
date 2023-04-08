package solvedac.class_03.Num_1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
    숫자 0, 1의 개수를 담을 zoroCount, oneCount 선언 및 초기화
     */
    public static int zeroCount = 0;
    public static int oneCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
        입력 받을 테스트케이스 T의 개수
         */
        int T = Integer.parseInt(br.readLine());

        /*
        T번 만큼 피보나치 함수를 실행
        피보나치 함수를 실행시키고 sb에 zeroCount, oneCount를 추가
        zeroCount, oneCount를 0으로 초기화;
         */
        for(int i = 0; i < T; i++) {
            fibonacci(Integer.parseInt(br.readLine()));
            sb.append(zeroCount).append(" ").append(oneCount).append("\n");
            zeroCount = 0;
            oneCount = 0;
        }

        System.out.println(sb);
    }

    /*
    피보나치 함수
     */
    static void fibonacci(int n) {
        if(n == 0) {
            zeroCount++;
        } else if(n == 1) {
            oneCount++;
        } else {
            fibonacci(n-1);
            fibonacci(n-2);
        }
    }
}
