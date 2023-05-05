package baekjoon.Silver.Num_1181;

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

        /*
        첫 번째 입력 : 입력 받을 단어의 수 N
         */
        int N = Integer.parseInt(br.readLine());

        /*
        입력 받는 단어의 수만큼 배열 선언
         */
        String[] strArr = new String[N];

        /*
        두 번째 입력 : N개 만큼의 단어 입력
         */
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            strArr[i] = st.nextToken();
        }

        /*
        길이가 짧은 것부터 길이가 같으면 사전 순으로 재정렬
         */
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        /*
        첫 번째 배열 요소를 sb에 추가
         */
        sb.append(strArr[0]).append("\n");

        /*
        두 번째 배열 요소부터 중복을 제거하고 sb에 추가
         */
        for(int i = 1; i < strArr.length; i++) {
            if(!strArr[i - 1].equals(strArr[i])) {
                sb.append(strArr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
