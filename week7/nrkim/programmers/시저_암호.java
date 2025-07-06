package week7.nrkim.programmers;

/**
 * PackageName : week7.nrkim.programmers
 * FileName    : 시저_암호
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-06
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 06.     김누리(NRKim)               Initial creation
 */


/*

s 쪼갬
sArr = {'A','B'}
n만큼 미룸

*/
public class 시저_암호 {
	public String solution(String s, int n) {
		String answer = "";
		char[] sArr = s.toCharArray();

		for(char c : sArr) {
			if(c == ' ') {
				//  공백인 경우
				answer += c;
			} else if (c >= 'a' && c <= 'z') {
				// 소문자인 경우

				if (c + n > 'z') {
					// 옮겼을 때 z를 넘겼을 때
					answer += (char) (c - 26 + n);
				} else {
					answer += (char) (c+n);
				}
			} else if (c >= 'A' && c <= 'Z') {
				//  대문자일 때

				if(c + n > 'Z') {
					//  옮겼을 때 Z를 넘겼을 때
					answer += (char) (c - 26 + n);
				} else {
					answer += (char) (c+n);
				}
			}
		}

		return answer;
	}
}
