package baekjoon.Silver.Num_2630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static int white = 0;
    private static int blue = 0;
    private static int[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        for(int i = 0; i < N; i++) {
            String[] strArr = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        divide(0, 0, N);

        System.out.println(white);
        System.out.println(blue);
    }

    /*
    row 는 배열의 가로 시작점
    column 는 배열의 세로 시작점
    range 는 배열의 길이
     */
    private static void divide(int row, int column, int range) {
        if(sameArr(row, column, range)) {
            if(board[row][column] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }

        int newRange = range / 2;
        divide(row, column, newRange);
        divide(row, column + newRange, newRange);
        divide(row + newRange, column, newRange);
        divide(row + newRange, column + newRange, newRange);
    }

    private static boolean sameArr(int row, int column, int range) {
        int startPoint = board[row][column];

        for(int i = row; i < row + range; i++) {
            for(int j = column; j < column + range; j++) {
                if(startPoint != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
