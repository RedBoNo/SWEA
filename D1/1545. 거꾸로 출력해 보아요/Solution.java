import java.util.Scanner;
import java.io.FileInputStream;

/*
    주어진 숫자부터 0까지 순서대로 찍어보세요.

    아래는 입력된 숫자가 N일 때 거꾸로 출력하는 예시입니다

    N, N-1, N-2 ... 0

    입력
    8

    출력
    8 7 6 5 4 3 2 1 0
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.close();
    
        for(int num = T; T >= 0; T--) {
            System.out.print(num + " ");
            num--;
        }
    }
}

