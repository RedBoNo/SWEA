import java.util.Scanner;

/*
 * "level" 과 같이 거꾸로 읽어도 제대로 읽은 것과 같은 문장이나 낱말을 회문(回文, palindrome)이라 한다.
 * 
 * 단어를 입력 받아 회문이면 1을 출력하고, 아니라면 0을 출력하는 프로그램을 작성하라.
 * 
 * 
 * [제약 사항]
 * 
 * 각 단어의 길이는 3 이상 10 이하이다.
 * 
 * 
 * [입력]
 * 
 * 가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
 * 
 * 각 테스트 케이스의 첫 번째 줄에 하나의 단어가 주어진다.
 * 
 * 
 * [출력]
 * 
 * 출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
 * 
 * (t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
 * 
 * 입력
 * 3
 * level
 * samsung
 * eye
 * 
 * 출력
 * #1 1
 * #2 0
 * #3 1
 * 
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스 수
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            // nextLine() 사용시 공백제거 해줘야 함
            String palindrome = sc.next();
            // 회문 검사 변수
            int result = 0;
            // StringBuilder에 문자를 뒤집는 reserve() 메소드를 제공
            String ReservePalindrome = new StringBuilder(palindrome).reverse().toString();

            result = (palindrome.equals(ReservePalindrome)) ? 1 : 0;

            System.out.printf("#%d %d\n", i, result);
        }
    }
}