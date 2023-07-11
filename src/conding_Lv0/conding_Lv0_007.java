package conding_Lv0;

import java.util.Scanner;

/*문제 설명
두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.

제한사항
1 ≤ str1, str2의 길이 ≤ 10
*/
public class conding_Lv0_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        if(a.length() >=1 && a.length() <= 10 && b.length() >=1 && b.length() <= 10) {
        	System.out.println(a+b);
        }
    }

}


/*
 * // trim() 
 * 앞뒤공백제거(중간에 있는 공백은 제거 못함) 
 * // replace() 
 * replce(char, char)
 * replceAll(String, String) 모누 변환
 * replaceFirst(String, String) 처음 한번만 변환 //
 * //정규표현식(Regex) 
 * "\\s" -> 공백
 */