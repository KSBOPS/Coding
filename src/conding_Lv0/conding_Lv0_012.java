package conding_Lv0;
/*
 * 
문제 설명
문자들이 담겨있는 배열 arr가 주어집니다. 
arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 200
arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.

*/
public class conding_Lv0_012 {
	
	public String solution(String[] arr) {
        /*String answer = "";
        	for(int i=0; i <arr.length; i++) {
        		answer += arr[i];
        	}*/
        return String.join("", arr);
    }
	
	public static void main(String []args) {
		conding_Lv0_012 cl12 = new conding_Lv0_012();
		String ar[] = {"a", "b", "c"};
		System.out.println(cl12.solution(ar));
	}	
}


/* String.join("", arr); */
/* 각 멤버 사이에 지정된 구분 기호를 사용하여 문자열의 배열을 연결합니다. */