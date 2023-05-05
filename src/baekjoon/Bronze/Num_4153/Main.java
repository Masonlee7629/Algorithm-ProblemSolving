package baekjoon.Bronze.Num_4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] intArr = new int[3];

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int i = 0; i < intArr.length; i++) {
                intArr[i] = Integer.parseInt(st.nextToken());
            }

            if(intArr[0] == 0 && intArr[1] == 0 && intArr[2] == 0) {
                break;
            }

            Arrays.sort(intArr);
            if(Math.pow(intArr[2], 2) == (Math.pow(intArr[0], 2) + Math.pow(intArr[1], 2))) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }

        System.out.println(sb);
    }
}
