package solvedac.class_03.Num_11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        boolean[] booleans = new boolean[21];

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            int num = 0;

            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch (str) {
                case "add" : {
                    if(!booleans[num]) {
                        booleans[num] = true;
                    }
                    break;
                }
                case "remove" : {
                    if(booleans[num]) {
                        booleans[num] = false;
                    }
                    break;
                }
                case "check" : {
                    if(booleans[num]) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "toggle" : {
                    if(booleans[num]) {
                        booleans[num] = false;
                    } else {
                        booleans[num] = true;
                    }
                    break;
                }
                case "all" : {
                    Arrays.fill(booleans, true);
                    break;
                }
                case "empty" : {
                    Arrays.fill(booleans, false);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}