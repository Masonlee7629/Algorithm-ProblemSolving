package solvedac.class_02.Num_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int GCD = getGCD(a, b);

        System.out.println(GCD); // 최대공약수
        System.out.println((a * b) / GCD); // 최소공배수
    }

    private static int getGCD(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}
