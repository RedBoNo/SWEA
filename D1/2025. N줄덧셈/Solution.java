import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
    1부터 주어진 숫자만큼 모두 더한 값을 출력하시오.

    단, 주어질 숫자는 10000을 넘지 않는다.


    [예제]

    주어진 숫자가 10 일 경우 출력해야 할 정답은,

    1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55

    입력
    10

    출력
    55

 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int number = Integer.parseInt(str);
        // 합계
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}