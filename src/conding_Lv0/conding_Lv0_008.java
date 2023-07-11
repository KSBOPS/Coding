package conding_Lv0;

import java.util.Scanner;

/*문제 설명
문자열 str이 주어집니다.
문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 10*/
public class conding_Lv0_008 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if(a.length() >= 1 && a.length() <= 10) {
			
			 for(int i = 0; i < a.length(); i++) { 
				 System.out.println(a.charAt(i)); 
			 } 
    	}
    }
}



// split() 함수 사용
/*
 * String b [] = a.split(""); 
 * for(String c : b) 
 * { System.out.println(c); }
 */

// toCharArray()
/*
 * for (char ch : a.toCharArray()) 
 * { System.out.println(ch); }
 */