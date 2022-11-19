package baekjoon.Level_02.Num_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);

        if(b < 45) {
            b = 60 - 45 + b;
            if(a == 0) {
                a = 23;
            } else {
                a--;
            }
        } else {
            b = b - 45;
        }

        System.out.println(a + " " + b);
    }
}