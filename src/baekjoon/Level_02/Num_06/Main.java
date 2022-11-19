package baekjoon.Level_02.Num_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int hour = Integer.parseInt(arr[0]);
        int minute = Integer.parseInt(arr[1]);
        int timer = Integer.parseInt(br.readLine());

        int total = hour * 60 + minute+ timer;
        hour = total / 60;
        minute = total % 60;

        if(hour >= 24) {
            hour = hour - 24;
        }

        System.out.println(hour + " " + minute);
    }
}
