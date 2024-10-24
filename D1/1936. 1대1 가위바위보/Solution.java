import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    A와 B가 가위바위보를 하였다.

    가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.

    A와 B중에 누가 이겼는지 판별해보자. 단, 비기는 경우는 없다.

    

    [입력]

    입력으로 A와 B가 무엇을 냈는지 빈 칸을 사이로 주어진다.

    
    

    [출력]

    A가 이기면 A, B가 이기면 B를 출력한다.

    입력
    3 2

    출력
    A    
 */

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // A가 이기는 경우
        if((A == 1 && B == 3) || (A == 2 && B == 1) || (A == 3 && B == 2)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }


    }
}
