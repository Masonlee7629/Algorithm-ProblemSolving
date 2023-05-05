package baekjoon.Bronze.Num_18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        int result = Integer.parseInt(String.valueOf(sb)) - 543;
        System.out.println(result);
    }
}