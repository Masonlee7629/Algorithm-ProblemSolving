package baekjoon.Silver.Num_11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] intArr = new int[N + 1];

        intArr[0] = 1;
        intArr[1] = 1;

        for(int i = 2; i <= N; i++) {
            intArr[i] = (intArr[i-1] + intArr[i-2]) % 10007;
        }
        System.out.println(intArr[N]);
    }
}