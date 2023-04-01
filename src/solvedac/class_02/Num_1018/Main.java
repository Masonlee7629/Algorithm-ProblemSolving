package solvedac.class_02.Num_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[][] booleans = new boolean[M][N];

        for(int i = 0; i < M; i++) {
            String str = br.readLine();
            for(int j = 0; j < N; j++) {
                if(str.charAt(j) == 'W') {
                    booleans[i][j] = true;
                } else {
                    booleans[i][j] = false;
                }
            }
        }
    }

}
