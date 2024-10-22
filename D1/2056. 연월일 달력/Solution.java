import java.util.Scanner;

/*
    연월일 순으로 구성된 8자리의 날짜가 입력으로 주어진다.

    22220228 -> 2222/02/28

    해당 날짜의 유효성을 판단한 후, 날짜가 유효하다면 ”YYYY/MM/DD”형식으로 출력하고,

    날짜가 유효하지 않을 경우, -1 을 출력하는 프로그램을 작성하라.

    연월일로 구성된 입력에서 월은 1~12 사이 값을 가져야 하며

    일은 아래와 같이, 1일 ~ 각각의 달에 해당하는 날짜까지의 값을 가질 수 있다.

    1월     1일 ~ 31일      2월     1일 ~ 28일
    3월     1일 ~ 31일      4월     1일 ~ 30일
    5월     1일 ~ 31일      6월     1일 ~ 30일
    7월     1일 ~ 31일      8월     1일 ~ 31일
    9월     1일 ~ 30일      10월    1일 ~ 31일
    11월    1일 ~ 30일      12월    1일 ~ 31일

    ※ 2월의 경우, 28일인 경우만 고려한다. (윤년은 고려하지 않는다.)

    [입력]

    입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.

    다음 줄부터 각 테스트 케이스가 주어진다.


    [출력]

    테스트 케이스 t에 대한 결과는 “#t”을 찍고, 한 칸 띄고, 정답을 출력한다.

    (t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)

    입력
    5
    22220228
    20150002
    01010101
    20140230
    11111111

    출력
    #1 2222/02/28
    #2 -1
    #3 0101/01/01
    #4 -1
    #5 1111/11/11

 */

class Soultion {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            String calender = sc.next();
            
            // 년도
            String yyyy = calender.substring(0,4);
            // 월
            String mm = calender.substring(4,6);
            // 일
            String dd = calender.substring(6,8);
            
            //월, 일 검사를 위해 Int형으로 변환
            int MM = Integer.parseInt(mm);
            int DD = Integer.parseInt(dd);
            
            // 월은 1월부터 12월 까지
            if(!(MM > 0 && MM < 13)) {
            	System.out.println("#" + test_case + " " + "-1");
            // 2월은 28일까지
            } else if (MM == 2 && DD > 28) {
            	System.out.println("#" + test_case + " " + "-1");
            } else {
            	System.out.println("#" + test_case + " " + yyyy + "/" + mm + "/" + dd); 
            }
		}
        sc.close();       
    }
}

