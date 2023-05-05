package baekjoon.Silver.Num_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] timeArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        timeArr[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            timeArr[i] = timeArr[i - 1] + arr[i];
        }

        int result = 0;

        for(int i = 0; i < timeArr.length; i++) {
            result = result + timeArr[i];
        }

        System.out.println(result);
    }
}
