import java.util.Scanner;
import java.lang.Math;
/*
    1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.

    주어질 숫자는 30을 넘지 않는다.

    입력
    8

    출력
    1 2 4 8 16 32 64 128 256
 */


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
  
		for(int test_case = 0; test_case <= T; test_case++)
		{
            System.out.print((int)Math.pow(2, test_case)+" ");
		}

        sc.close();
	}
}