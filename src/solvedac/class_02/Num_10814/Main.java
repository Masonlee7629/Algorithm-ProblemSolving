package solvedac.class_02.Num_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 첫번 째 입력 : 가입한 회원의 수 */
        int N = Integer.parseInt(br.readLine());

        /* 회원의 수만큼 2차원 배열 선언 */
        String[][] strArr = new String[N][2];

        /* 두번 째 입력 : 회원의 나이와 이름(각 줄마다 공백으로 구분) */
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            strArr[i][0] = st.nextToken();
            strArr[i][1] = st.nextToken();
        }

        /* 각 배열의 첫번 째 요소를 기준으로 정렬 */
        Arrays.sort(strArr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        /* sb에 배열의 값을 넣으며 한 줄씩 띄우기 */
        for(int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i][0]).append(' ').append(strArr[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}
