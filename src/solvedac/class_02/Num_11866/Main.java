package solvedac.class_02.Num_11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        /*
        N개의 숫자를 담을 큐 생성
         */
        Queue<Integer> intQue = new LinkedList<>();

        /*
        큐에 1 ~ N 까지의 숫자를 순서대로 추가
         */
        for(int i = 1; i < N + 1; i++) {
            intQue.add(i);
        }

        /*
        큐의 크기가 0이 될 때까지 반복하며
        K번째 숫자는 큐에서 삭제 후, sb에 추가하고,
        그 이전 숫자는 큐에서 삭제하고 다시 큐에 추가
         */
        while(intQue.size() > 0) {
            if(sb.length() == 0) {
                sb.append("<");
            }

            for(int i = 0; i < K - 1; i++) {
                intQue.add(intQue.poll());
            }

            if(intQue.size() != 1) {
                sb.append(intQue.poll()).append(", ");
            } else {
                sb.append(intQue.poll()).append(">");
            }
        }

        System.out.println(sb);
    }
}
