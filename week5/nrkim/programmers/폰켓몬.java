package week5.nrkim.programmers;

import java.util.HashSet;
import java.util.Set;

/**
 * PackageName : week5.nrkim.programmers
 * FileName    : 폰켓몬
 * Author      : 김누리(NRKim)
 * Date        : 2025-06-26
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 06. 26.     김누리(NRKim)               Initial creation
 */

/*

접근법은 은근 간단.

파라메터 배열의 사이즈 /2  만큼 반복

해쉬 Set 통해 중복 요소 줄여가며 진행.

hash의 사이즈가 get 초과시 get 반환
아니면 hash 사이즈 반환

*/

public class 폰켓몬 {
	public int solution(int[] nums) {
		int answer = 0;
		int get = nums.length/2;
		Set<Integer> set = new HashSet<>();

		for (int i : nums) {
			set.add(i);
		}

		if (set.size() > get) answer = get;
		if (set.size() <= get) answer = set.size();


		return answer;
	}
}
