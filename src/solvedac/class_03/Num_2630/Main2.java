package solvedac.class_03.Num_2630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

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

    private static void divide(int row, int column, int range) {
        boolean sameCheck = true;
        for(int i = 0; i < range; i++) {
            for(int j = 0; j < range; j++) {
                if(board[row][column] != board[row+i][column+j]) {
                    sameCheck = false;
                    break;
                }
            }
        }

        if(sameCheck) {
            if(board[row][column] == 1) {
                blue++;
            } else {
                white++;
            }
        } else {
            int newRange = range / 2;
            divide(row, column, newRange);
            divide(row, column + newRange, newRange);
            divide(row + newRange, column, newRange);
            divide(row + newRange, column + newRange, newRange);
        }
    }
}