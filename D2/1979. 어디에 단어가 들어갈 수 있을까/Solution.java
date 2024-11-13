import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            // 퍼즐의 크기
            int N = sc.nextInt();
            // 단어의 길이
            int K = sc.nextInt();
            // 퍼즐
            int arr[][] = new int[N][N];
            // 퍼즐안에 흑백 추가
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            // 들어갈 수 있는 자리 갯수
            int result = 0;

            // 가로 탐색
            for (int i = 0; i < N; i++) {
                // 단어 자릿수 체크용 변수
                // 다음 행으로 넘어갈 때 초기화 되어야 함
                int count = 0;
                for (int j = 0; j < N; j++) {
                    // 0:흑, 1:백
                    // 백일 때 카운트 값 증가
                    if (arr[i][j] == 1)
                        count++;
                    // 흑일 때 카운트 초기화
                    if (arr[i][j] == 0) {
                        if (count == K)
                            result++;
                        count = 0;
                    }
                }
                if (count == K)
                    result++;
            }

            // 세로 탐색
            for (int i = 0; i < N; i++) {
                // 단어 자릿수 체크용 변수
                // 다음 행으로 넘어갈 때 초기화 되어야 함
                // 0:흑, 1:백
                int count = 0;
                for (int j = 0; j < N; j++) {
                    // 백일 때 카운트 값 증가
                    if (arr[j][i] == 1) {
                        count++;
                    }
                    // 흑일 때 카운트 초기화
                    if (arr[j][i] == 0) {
                        if (count == K) {
                            result++;
                        }
                        count = 0;
                    }
                }
                if (count == K) {
                    result++;
                }
            }
            System.out.printf("#%d, %d\n", t, result);
        }
    }
}