package week8.nrkim.programmers;

/**
 * PackageName : week8.nrkim.programmers
 * FileName    : 신규_아이디_추천
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-24
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 24.     김누리(NRKim)               Initial creation
 */

/*

정규식 연습 문제

*/

public class 신규_아이디_추천 {
	public String solution(String new_id) {
		String answer = "";

		//  1단계 : 대문자 >> 소문자로
		answer = new_id.toLowerCase();

		//  2단계 : 알파벳, 숫자, '-','_','.' 이외는 전부 ""로 치환
		answer = answer.replaceAll("[^a-z0-9-_.]","");

		//  3단계 : .가 2번 이상 연속 되면 .로 치환
		answer = answer.replaceAll("\\.+",".");

		//  4단계 : .가 맨 처음 혹은 맨 마지막에 위치하면 제거
		if(answer.startsWith(".")) {
			answer = answer.substring(1);
		}

		if(answer.endsWith(".") ) {
			answer = answer.substring(0, answer.length()-1);
		}

		//  5단계 : 빈 문자열이면 a 대입
		if(answer.length() == 0) {
			answer += "a";
		}

		//  6단계 : (1) 길이가 16자 이상이면 마지막 1개는 제거
		if(answer.length() > 15) {
			answer = answer.substring(0,15);
		}

		//  6단계 : (2) 이후 마지막 글자가 . 면 제거
		if (answer.endsWith(".")) {
			answer = answer.substring(0,answer.length()-1);
		}

		//  7단계 : 글자 길이가 2 이하면 3이 될 때 까지 마지막 문자 추가
		while (answer.length() < 3) {
			char tmp = answer.charAt(answer.length()-1);
			answer += tmp + "";
		}

		return answer;
	}
}
