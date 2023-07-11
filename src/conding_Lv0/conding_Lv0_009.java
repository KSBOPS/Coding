package conding_Lv0;

import java.util.Scanner;

/*문제 설명
자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ n ≤ 1,000*/
public class conding_Lv0_009 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n >= 1 && n <= 1000) {
        	/*if(n % 2 == 0) {
        		System.out.println(n + " is even");
        	} else {
        		System.out.println(n + " is odd");
        	}*/
        	System.out.println(n + ((n % 2 == 0) ? " is even" : " is odd"));
        }
    }
}


//삼항연산자
/* System.out.println(n + ((n % 2 == 0) ? " is even" : " is odd")); */