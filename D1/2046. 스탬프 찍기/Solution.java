import java.util.Scanner;

/*
    주어진 숫자만큼 # 을 출력해보세요.

    주어질 숫자는 100,000 이하다.

    입력
    3

    출력
    ###
*/

public class Solution {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.close();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            System.out.printf("#");
        }
    }

    
}
