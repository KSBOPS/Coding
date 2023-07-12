package conding_Lv0;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * 문제 설명
문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

제한사항
my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
*/
public class conding_Lv0_016 {
	
	public String solution(String my_string, String overwrite_string, int s) {

        String answer = "";
        if((Pattern.matches("^[a-zA-Z0-9]*$", my_string)) && (Pattern.matches("^[a-zA-Z0-9]*$", overwrite_string))) {
        	
        	if(overwrite_string.length() >= 1 && overwrite_string.length() <= my_string.length() && my_string.length() <= 1000) {
        		
        		if (s >= 0 && s <= my_string.length() - overwrite_string.length()) {
        			System.out.println(my_string.substring(9));
        			System.out.println(overwrite_string);
        			System.out.println(overwrite_string.length());
        			System.out.println(my_string.substring(s + overwrite_string.length()));
        			answer= my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        			
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		conding_Lv0_016 c10 = new conding_Lv0_016();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int c = sc.nextInt();
		
		System.out.println(c10.solution(a, b, c));
	}
}
