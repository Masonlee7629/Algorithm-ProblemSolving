package solvedac.class_03.Num_11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        int[] intArr = new int[21];

        for(int i = 0; i < M; i++) {
            String[] strArr = br.readLine().split(" ");
            switch (strArr[0]) {
                case "add" : {
                    if(intArr[Integer.parseInt(strArr[1])] == 0) {
                        intArr[Integer.parseInt(strArr[1])] = Integer.parseInt(strArr[1]);
                    }
                    break;
                }
                case "remove" : {
                    if(intArr[Integer.parseInt(strArr[1])] != 0) {
                        intArr[Integer.parseInt(strArr[1])] = 0;
                    }
                    break;
                }
                case "check" : {
                    if(intArr[Integer.parseInt(strArr[1])] != 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "toggle" : {
                    if(intArr[Integer.parseInt(strArr[1])] == Integer.parseInt(strArr[1])) {
                        intArr[Integer.parseInt(strArr[1])] = 0;
                    } else {
                        intArr[Integer.parseInt(strArr[1])] = Integer.parseInt(strArr[1]);
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
