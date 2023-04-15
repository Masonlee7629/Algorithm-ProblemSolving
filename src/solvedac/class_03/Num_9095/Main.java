package solvedac.class_03.Num_9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] intArr = new int[11];
        intArr[1] = 1;
        intArr[2] = 2;
        intArr[3] = 4;

        for(int i = 4; i < intArr.length; i++) {
            intArr[i] = intArr[i-1] + intArr[i-2] + intArr[i-3];
        }

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(intArr[n]).append(" ");
        }

        System.out.println(Arrays.toString(intArr));
    }
}

/*
1 - 1개
1 + 3

2 - 2개
1 + 1
2

3 - 4개
1 + 1 + 1
1 + 2
2 + 1
3

4 - 7개
1 + 1 + 1 + 1
1 + 1 + 2
1 + 2 + 1
2 + 1 + 1
2 + 2
3 + 1
1 + 3

5 - 13개
1 + 1 + 1 + 1 + 1
1 + 1 + 1 + 2
1 + 1 + 2 + 1
1 + 2 + 1 + 1
2 + 1 + 1 + 1
1 + 2 + 2
2 + 1 + 2
2 + 2 + 1
1 + 1 + 3
1 + 3 + 1
3 + 1 + 1
2 + 3
3 + 2

6 - 24개
1 + 1 + 1 + 1 + 1 + 1
1 + 1 + 1 + 1 + 2
1 + 1 + 1 + 2 + 1
1 + 1 + 2 + 1 + 1
1 + 2 + 1 + 1 + 1
2 + 1 + 1 + 1 + 1
1 + 1 + 2 + 2
1 + 2 + 1 + 2
2 + 1 + 1 + 2
1 + 2 + 2 + 1
2 + 1 + 2 + 1
2 + 2 + 1 + 1
2 + 2 + 2
1 + 1 + 1 + 3
1 + 1 + 3 + 1
1 + 3 + 1 + 1
3 + 1 + 1 + 1
1 + 2 + 3
1 + 3 + 2
2 + 1 + 3
2 + 3 + 1
3 + 1 + 2
3 + 2 + 1
3 + 3

7 - 44개

 */