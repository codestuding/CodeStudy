package week8.nrkim.programmers;

import java.util.Stack;

/**
 * PackageName : week8.nrkim.programmers
 * FileName    : 짝지어_제거하기
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-24
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 24.     김누리(NRKim)               Initial creation
 */

/*

직전 단어와 현재 단어를 비교하며 동일한 경우 삭제 진행

이 때 남아있는 문자가 있으면 0, 없으면 1

*/

public class 짝지어_제거하기 {
	public int solution(String s)
	{
		int answer = -1;
		char[] cArr = s.toCharArray();
		Stack<Character> stk = new Stack<>();

		for(char c : cArr) {
			if(stk.isEmpty() || stk.peek() != c) {
				stk.push(c);
			} else if (stk.peek() == c){
				stk.pop();
			}
		}

		return answer = stk.isEmpty() ? 1 : 0;
	}
}
