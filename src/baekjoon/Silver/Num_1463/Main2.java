package baekjoon.Silver.Num_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] cnt = new int[1000001];

        cnt[0] = 0;
        cnt[1] = 0;
        cnt[2] = 1;
        cnt[3] = 1;

        for(int i = 4; i <= N; i++) {
            cnt[i] = cnt[i-1] + 1;

            if(i % 6 == 0) {
                cnt[i] = Math.min(cnt[i/2], cnt[i/3]) + 1;
            } else if(i % 3 == 0) {
                cnt[i] = Math.min(cnt[i], cnt[i/3] + 1);
            } else if(i % 2 == 0) {
                cnt[i] = Math.min(cnt[i], cnt[i/2] + 1);
            }

        }
        System.out.println(cnt[N]);
    }
}
