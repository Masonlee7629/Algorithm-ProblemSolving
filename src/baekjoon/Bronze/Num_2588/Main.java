package baekjoon.Bronze.Num_2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        String second = br.readLine();
        char[] charScd = new char[second.length()];
        for(int i = 0; i < second.length(); i++) {
            charScd[i] = second.charAt(i);
        }

        for(int i = second.length() - 1; i >= 0; i--) {
            System.out.println(first * (charScd[i] - '0'));
        }

        System.out.println(first * Integer.parseInt(second));
    }
}