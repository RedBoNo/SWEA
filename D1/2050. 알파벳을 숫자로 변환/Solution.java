import java.util.Scanner;

/*
    알파벳으로 이루어진 문자열을 입력 받아 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력하라.


    [제약 사항]

    문자열의 최대 길이는 200이다.


    [입력]

    알파벳으로 이루어진 문자열이 주어진다.


    [출력]

    각 알파벳을 숫자로 변환한 결과값을 빈 칸을 두고 출력한다.

    입력
    ABCDEFGHIJKLMNOPQRSTUVWXYZ

    출력
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
*/


class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String alpha = sc.nextLine();
        
        for(int i = 0; i < alpha.length(); i++) {
            // 대문자 'A'의 아스키 코드 값은 65
        	System.out.print(alpha.charAt(i) - 64+" ");
        }
        sc.close();
    }
}

