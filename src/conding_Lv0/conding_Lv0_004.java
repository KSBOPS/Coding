package conding_Lv0;

import java.util.Scanner;
import java.util.regex.Pattern;

/*영어 알파벳으로 이루어진 문자열 str이 주어집니다. 
 * 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str의 길이 ≤ 20
str은 알파벳으로 이루어진 문자열입니다.
*/
public class conding_Lv0_004 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String result = "";
        
        if( a.length() >= 1 && a.length() <= 20) {
        	if(Pattern.matches("^[a-zA-Z]*$", a)) {
        		for( char x : a.toCharArray()) {
        			if(Character.isLowerCase(x)) {
        				result += Character.toUpperCase(x);
        			} else {
        				result += Character.toLowerCase(x);
        			}
        		}
        	}
        }
        
        System.out.println(result);
        
    }

}



//toCharArray() 함수 이용

//아스키코드 이용

/*
 * if(x>=97 && x<=122) { // 대문자라면
 * 		answer+=(char)(x-32); 
 * } else if(x>=65 && x<=90) {  //소문자라면
 * 		answer+=(char)(x+32); 
 * }
 */