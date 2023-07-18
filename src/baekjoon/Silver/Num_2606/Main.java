package baekjoon.Silver.Num_2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertex = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());
        int[][] edges = new int[edge][2];
        int[] resultArr = new int[101];

        for(int i = 0; i < edge; i++) {
            String[] strArr = br.readLine().split(" ");
            edges[i][0] = Integer.parseInt(strArr[0]);
            edges[i][1] = Integer.parseInt(strArr[1]);

            if(edges[i][0] == 1) {
                resultArr[i] = edges[i][1];
            } else if(edges[i][1] == 1) {
                resultArr[i] = edges[i][0];
            }
        }

        for(int i = 0; i < edges.length; i++) {
            if(resultArr[i] == edges[i][0]) {

            }
        }


        System.out.println(Arrays.deepToString(edges));
    }
}
