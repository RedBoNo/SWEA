import java.util.Scanner;

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

