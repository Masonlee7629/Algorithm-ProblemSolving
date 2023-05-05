package baekjoon.Silver.Num_11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] intArr = new int[1001];

        intArr[0] = 0;
        intArr[1] = 1;
        intArr[2] = 2;

        /*
        점화식
        arr[i] = arr[i-1] + arr[i-2]
        배열에 할당할 때, 미리 10007로 나눈 나머지 값을 넣어야 함
        그렇지 않으면 46번째부터 오버플로우 발생
         */
        for(int i = 3; i <= N; i++) {
            intArr[i] = (intArr[i-1] + intArr[i-2]) % 10007;
        }
        System.out.println(intArr[N]);
    }
}