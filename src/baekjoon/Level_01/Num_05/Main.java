package baekjoon.Level_01.Num_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        double a = Double.parseDouble(strArr[0]);
        double b = Double.parseDouble(strArr[1]);

        System.out.println(a/b);
    }
}