import java.util.Scanner;
        
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int a = 1; a <= T; a++) {
            // number
			int N = sc.nextInt();
            // Combination
			int C[][] = new int[N][N];
            // 초기값 1
			C[0][0] = 1;
			for(int i = 1; i < N; i++) {
				for(int j = 0; j <= i; j++) {
					// nCr에서 r이 0이거나 1이면 값은 1이 나옴
                    if(j == 0 || j == i) {
						C[i][j] = 1;
					} else {
                        // 조합에서 대각선 연산하면 나오는 값
						C[i][j] = C[i-1][j-1] + C[i-1][j];
					}
				}
			}
			System.out.println("#" + a);
			for(int i = 0; i < N; i++) {
				for(int j = 0; j <= i; j++) {
					System.out.print(C[i][j] + " ");
				}
				System.out.println();
			}
		}
        sc.close();
	}

}