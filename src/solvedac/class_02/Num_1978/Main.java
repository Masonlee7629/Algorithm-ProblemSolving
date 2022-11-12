package solvedac.class_02.Num_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] intArr = new int[n];
        int count = 0;

        for(int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        for(int i = 0; i < n; i++) {
            if(isPrime(intArr[i])) {
                count++;
            }
        }


        System.out.println(count);
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;

        if(num < 2) {
            isPrime = false;
            return isPrime;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                isPrime = false;
                return isPrime;
            }
        }

        return isPrime;
    }
}
