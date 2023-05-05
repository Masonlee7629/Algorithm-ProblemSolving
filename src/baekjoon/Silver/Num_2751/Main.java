package baekjoon.Silver.Num_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 입력 받을 숫자의 총 갯수 */
        int num = Integer.parseInt(br.readLine());

        /* 입력 받은 숫자를 담을 배열 선언 */
        int[] intArr = new int[num];

        /* 입력 받은 수를 배열에 넣기 */
        for(int i = 0; i < num; i++) {
            intArr[i] = Integer.parseInt(br.readLine());
        }

        /* 배열의 오름차순 정렬 */
        Arrays.sort(intArr);

        /* sb에 배열 값을 넣으며 한 줄씩 띄우기 */
        for (int i = 0; i < intArr.length; i++) {
            sb.append(intArr[i]).append('\n');
        }

        System.out.println(sb);
    }
}
