package baekjoon.Level_01.Num_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] chess = {1, 1, 2, 2, 2, 8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int[] intrlt = new int[chess.length];
        String[] result = new String[chess.length];

        for(int i = 0; i < chess.length; i++) {
            intrlt[i] = chess[i] - Integer.parseInt(strArr[i]);
            result[i] = String.valueOf(intrlt[i]);
        }

        System.out.println(String.join(" ", result));
    }
}