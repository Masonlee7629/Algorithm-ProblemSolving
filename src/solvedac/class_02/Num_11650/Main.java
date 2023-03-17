package solvedac.class_02.Num_11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
        첫 번째 입력 : 입력 받을 점의 갯수
         */
        int N = Integer.parseInt(br.readLine());

        /*
        점의 갯수에 맞춰 2차원 배열 생성
         */
        int[][] intArr = new int[N][2];

        /*
        두 번째 입력 : x좌표와 y좌표를 입력 받고 2차원 배열에 할당
         */
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            intArr[i][0] = Integer.parseInt(st.nextToken());
            intArr[i][1] = Integer.parseInt(st.nextToken());
        }

        /*
        2차원 배열 정렬하기
        배열을 비교하여 [0]의 요소가 같으면 [1] 의 요소를 비교하여 정렬
        아닐 경우, [0]의 요소를 기준으로 정렬
         */
        Arrays.sort(intArr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        /*
        2차원 배열을 sb에 추가
         */
        for(int i = 0; i < intArr.length; i++) {
            sb.append(intArr[i][0]).append(" ").append(intArr[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}
