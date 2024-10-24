/*
    주어진 텍스트를 그대로 출력하세요.

    입력

    출력
    #++++
    +#+++
    ++#++
    +++#+
    ++++#
 */

public class Solution {
    public static void main(String[] args) {

    int T = 5;
    
    for(int test_case = 1; test_case <= T; test_case++)
    {
        for(int i  = 1; i <= 5; i++) {
            // 대각선 "#" 출력
            if(test_case == i) {
                System.out.print("#");
            } else {
                System.out.print("+");
            }
        }
        System.out.println("");
    }
    }
}