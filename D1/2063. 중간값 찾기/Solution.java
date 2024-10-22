import java.util.Scanner;
import java.util.Arrays;

/*
    중간값은 통계 집단의 수치를 크기 순으로 배열 했을 때 전체의 중앙에 위치하는 수치를 뜻한다.

    입력으로 N 개의 점수가 주어졌을 때, 중간값을 출력하라.


    [예제]

    N이 9 이고, 9개의 점수가 아래와 같이 주어질 경우,

    85 72 38 80 69 65 68 96 22

    69이 중간값이 된다.


    [제약 사항]

    1. N은 항상 홀수로 주어진다.

    2. N은 9이상 199 이하의 정수이다. (9 ≤ N ≤ 199)


    [입력]

    입력은 첫 줄에 N 이 주어진다.

    둘째 줄에 N 개의 점수가 주어진다.


    [출력]

    N 개의 점수들 중, 중간값에 해당하는 점수를 정답으로 출력한다.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // 배열 선언
        int arrs[] = new int[T];
        // 중간값 찾기
        int mid = T / 2;
        
        for(int i = 0; i < T; i++) {
            arrs[i] = sc.nextInt();
        }

        // 오름차순 정렬
        Arrays.sort(arrs);

        // 중간값 출력
        System.out.print(arrs[mid]);
    }
}

