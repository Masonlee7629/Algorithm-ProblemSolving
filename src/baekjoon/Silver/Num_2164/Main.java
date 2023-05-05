package baekjoon.Silver.Num_2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /*
        N개의 숫자를 담을 큐 생성
         */
        Queue<Integer> intQue = new LinkedList<>();


        /*
        큐에 1 ~ N 까지의 숫자를 순서대로 추가
         */
        for(int i = 1; i <= N; i++) {
            intQue.add(i);
        }

        /*
        큐의 첫 요소를 삭제하고, 두 번째 요소를 삭제 후, 큐의 마지막에 추가
         */
        while(intQue.size() > 1) {
            intQue.poll();
            intQue.add(intQue.poll());
            System.out.println(intQue);
        }

        System.out.println(intQue.element());
    }
}
