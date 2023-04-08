package solvedac.class_03.Num_11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        int[] intArr = new int[21];

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch (str) {
                case "add" : {
                    if(intArr[num] == 0) {
                        intArr[num] = num;
                    }
                    break;
                }
                case "remove" : {
                    if(intArr[num] != 0) {
                        intArr[num] = 0;
                    }
                    break;
                }
                case "check" : {
                    if(intArr[num] != 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "toggle" : {
                    if(intArr[num] == num) {
                        intArr[num] = 0;
                    } else {
                        intArr[num] = num;
                    }
                    break;
                }
                case "all" : {
                    for(int j = 1; j <= 20; j++) {
                        intArr[j] = j;
                    }
                    break;
                }
                case "empty" : {
                    for(int j = 1; j <= 20; j++) {
                        intArr[j] = 0;
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}