package solvedac.class_02.Num_1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] nArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
        N을 입력받고 N개의 요소를 가진 배열 생성
         */
        int N = Integer.parseInt(br.readLine());
        nArr = new int[N];

        /*
        입력한 숫자 N개를 배열에 할당
         */
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }

        /*
        M을 입력받고 M개의 요소를 가진 배열 생성
         */
        int M = Integer.parseInt(br.readLine());
        int[] mArr = new int[M];

        /*
        입력한 숫자 M개의 배열에 할당
         */
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            mArr[i] = Integer.parseInt(st.nextToken());
        }

        /*
        N개의 숫자를 가진 배열을 오름차순 정렬
         */
        Arrays.sort(nArr);

        /*
        M만큼 반복하여
        바이너리 서치 메서드 호출
        mArr의 각 요소를 비교하여 sb에 리턴값을 추가
         */
        for(int i = 0; i < M; i++) {
//            if(binarySearch(mArr[i]) > 0) {
//                sb.append(1).append("\n");
//            } else {
//                sb.append(0).append("\n");
//            }
            sb.append(binarySearch(mArr[i])).append("\n");
        }

        System.out.println(sb);

    }

    /*
    바이너리 서치 메서드
    파라미터로 입력된 값을 nArr 배열의 인덱스를 기준으로 비교
    nArr[mid]와 element가 같으면 1을 리턴
    같지 않으면 0을 리턴
     */
    public static int binarySearch(int element) {
        int min = 0;
        int max = nArr.length - 1;

        while(max >= min) {
            int mid = (min + max) / 2;

            if(element > nArr[mid]) {
                min = mid + 1;
            } else if(element < nArr[mid]) {
                max = mid - 1;
            } else {
                return 1;
            }
        }

        return 0;
    }


//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        /*
//        첫 번째 정수 N개의 숫자를 입력받고, N개의 요소를 가진 배열 생성
//         */
//        int N = Integer.parseInt(br.readLine());
//        int[] nArr = new int[N];
//
//        /*
//        배열에 입력한 N개의 숫자를 할당
//         */
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for(int i = 0; i < N; i++) {
//            nArr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        /*
//        두 번째 정수 M개의 숫자를 입력받고, M개의 요소를 가진 배열 생성
//         */
//        int M = Integer.parseInt(br.readLine());
//        int[] mArr = new int[M];
//
//        /*
//        배열에 입력한 M개의 숫자를 할당
//         */
//        st = new StringTokenizer(br.readLine(), " ");
//        for(int i = 0; i < M; i++) {
//            mArr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for(int i = 0; i < N; i++) {
//            for(int j = 0; j < M; j++) {
//                if(mArr[i] == nArr[j]) {
//                    sb.append(1).append("\n");
//                    break;
//                } else if(j == M-1) {
//                    if(mArr[i] != nArr[j]) {
//                        sb.append(0).append("\n");
//                    }
//                }
//            }
//        }
//        System.out.println(sb);
//    }
}
