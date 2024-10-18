import java.util.Scanner;
/*
    10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력하는 프로그램을 작성하라

    [제약 사항]

    각 수는 0 이상 10000 이하의 정수이다.

    [입력]

    가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

    각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.


    [출력]

    출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.

    (t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
    
    입력
    3
    3 17 1 39 8 41 2 32 99 2
    22 8 5 123 7 2 63 7 3 46
    6 63 2 3 58 76 21 33 8 1
    
    출력
    #1 200
    #2 208
    #3 121

*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++) {
            
            int totalOdd = 0;

            for(int i = 0; i < 10; i++) {
                int input = sc.nextInt();
                
                // 입력받은 값 중 홀수만 따로 저장
                if(input % 2 == 1) {
                    totalOdd += input;
                }
            }

            System.out.println("#" + test_case + " " + totalOdd);
        }
        sc.close();
    }
}
