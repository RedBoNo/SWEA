import java.util.Scanner;
/* 
    [제약 사항]

    자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)


    [입력]

    입력으로 자연수 N이 주어진다.


    [출력]

    각 자릿수의 합을 출력한다.

    입력
    6789

    출력
    30
*/


class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
        
        // 1000 자리
        int a = input / 1000;
        // 100 자리
        int b = (input % 1000) / 100;
        // 10자리
        int c = (input % 100) / 10;
        // 1자리    
        int d = input % 10;
        
		System.out.print(a+b+c+d);
        
	}
}