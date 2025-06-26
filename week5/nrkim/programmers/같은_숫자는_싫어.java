package week5.nrkim.programmers;

import java.util.Stack;

/**
 * PackageName : week5.nrkim.programmers
 * FileName    : 같은_숫자는_싫어
 * Author      : 김누리(NRKim)
 * Date        : 2025-06-26
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 06. 26.     김누리(NRKim)               Initial creation
 */

/*

단순 Stack 문제

*/

public class 같은_숫자는_싫어 {
	public int[] solution(int []arr) {
		Stack<Integer> stk = new Stack<>();

		for(int i : arr) {
			if ( stk.isEmpty() || stk.peek() != i ) stk.push(i);
		}

		int[] answer = new int[stk.size()];

		for(int i = 0; i < stk.size(); i++) {
			answer[i] = stk.pop();
		}

		return answer;
	}
}
