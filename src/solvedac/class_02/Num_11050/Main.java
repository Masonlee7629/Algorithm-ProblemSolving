package solvedac.class_02.Num_11050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int n = Integer.parseInt(strArr[0]);
        int k = Integer.parseInt(strArr[1]);

        /*
        이항계수 공식
        N! / (K! * (N-K)!)
         */
        int result = factorial(n) / (factorial(k) * factorial(n-k));
        System.out.println(result);
    }

    /*
    팩토리얼 매서드
     */
    public static int factorial(int n) {
        int returnFactorial = 1;

        for(int i = 1; i <= n; i++) {
            returnFactorial *= i;
        }

        return returnFactorial;
    }
}