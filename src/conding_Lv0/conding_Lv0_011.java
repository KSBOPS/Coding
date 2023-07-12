package conding_Lv0;
/*
 * 문제 설명
길이가 같은 두 문자열 str1과 str2가 주어집니다.

두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

제한사항
1 ≤ str1의 길이 = str2의 길이 ≤ 10
str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
*/

import java.util.regex.Pattern;

public class conding_Lv0_011 {
	
	public String solution(String str1, String str2) {
        String answer = "";
        if(str1.length() >=1 && str1.length() == str2.length() && str1.length() <= 10) {
        	if((Pattern.matches("^[a-z]*$", str1)) && (Pattern.matches("^[a-z]*$", str2))) {
        		for(int i = 0; i < str1.length(); ++i){
        	        answer += str1.substring(i,i+1); 
        	        answer += str2.substring(i,i+1);
        	    }
        	}
        }
        return answer;
    }
	
	public static void main(String []args) {
		conding_Lv0_011 cl12 = new conding_Lv0_011();
		System.out.println("test");
		System.out.println(cl12.solution("aaaaa", "bbbbb"));
	}
	
}
