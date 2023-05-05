package baekjoon.Bronze.Num_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] strArr = br.readLine().split(" ");
        int[] floorCard = new int[n];

        for(int i = 0; i < n; i++) {
            floorCard[i] = Integer.parseInt(strArr[i]);
        }

        int result = 0;

        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    int max = floorCard[i] + floorCard[j] + floorCard[k];

                    if(result < max && max <= m) {
                        result = max;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
