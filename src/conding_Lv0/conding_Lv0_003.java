package conding_Lv0;

import java.util.Scanner;

/*
 * 문제 설명
문자열 str과 정수 n이 주어집니다.
str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 10
1 ≤ n ≤ 5
 */
public class conding_Lv0_003 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        if(str.length()>=1 && str.length()<=10 && n>=1 && n<=5) {
        	for (int i = 0; i <= (n-1); i++)  {
        		System.out.println(str);
            }
        }
	}
}

/*
 * repeat 함수 
 * 주어진 문자열 옵션의 count만큼 반복하여 붙인다음 새로운 문자열로 반환 
 * String a= "123";
 * a.repeat(4); "123123123123"
 */