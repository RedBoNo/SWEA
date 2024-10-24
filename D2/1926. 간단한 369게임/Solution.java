import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
    3 6 9 게임을 프로그램으로 제작중이다. 게임 규칙은 다음과 같다.



    1. 숫자 1부터 순서대로 차례대로 말하되, “3” “6” “9” 가 들어가 있는 수는 말하지 않는다.

    1 2 3 4 5 6 7 8 9…

    2. "3" "6" "9"가 들어가 있는 수를 말하지 않는대신, 박수를 친다. 이 때, 박수는 해당 숫자가 들어간 개수만큼 쳐야 한다.  
    예를 들어 숫자 35의 경우 박수 한 번, 숫자 36의 경우 박수를 두번 쳐야 한다.


    입력으로 정수 N 이 주어졌을 때, 1~N 까지의 숫자를

    게임 규칙에 맞게 출력하는 프로그램을 작성하라.

    박수를 치는 부분은 숫자 대신, 박수 횟수에 맞게 “-“ 를 출력한다.

    여기서 주의해야 할 것은 박수 한 번 칠 때는 - 이며, 박수를 두 번 칠 때는 - - 가 아닌 -- 이다. 


    [제약사항]

    N은 10이상 1,000이하의 정수이다. (10 ≤ N ≤ 1,000)



    [입력]

    입력으로 정수 N 이 주어진다.


    [출력]

    1 ~ N까지의 숫자를 게임 규칙에 맞게 출력한다.

    입력
    10

    출력
    1 2 - 4 5 - 7 8 - 10

 */

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        // 반복문에 사용하기 위해 형 변환
        int num_length = Integer.parseInt(num);

        // 입력한 숫자만큼 반복문을 실행
        for(int i = 1; i <= num_length; i++) {
            // 문자 비교를 위한 형 변환
            String match_369 = String.valueOf(i);
            // 문자에 3,6,9가 포함되어있는지 검사 
            if(match_369.contains("3") || match_369.contains("6") || match_369.contains("9")) {
                // 자릿수만큼 검사하기 위한 반복문
                for(int j = 0; j < match_369.length(); j++) {
                    // 아래 문자가 포함되어 있는만큼 "-"를 출력
                    if(match_369.charAt(j) == '3' || match_369.charAt(j) == '6' || match_369.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
                // "-" 출력이 끝난 이후에 공백 추가
                System.out.print(" ");
            } else {
                // 3,6,9가 포함되어 있지 않으면 숫자와 공백을 출력
                System.out.print(i + " ");
            }
        }
    }
}