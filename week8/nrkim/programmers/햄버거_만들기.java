package week8.nrkim.programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * PackageName : week8.nrkim.programmers
 * FileName    : 햄버거_만들기
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-24
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 24.     김누리(NRKim)               Initial creation
 */

/*

stack을 이용해서 풀이하면 될듯
왜냐? 빵(1) > 야채(2) > 고기(3) > 빵(1) 순번이 되면 햄버거 갯수 ++ 하고 pop()

다른 언어에는 Stack이 없고 List<E> 타입으로도 스택의 역할이 가능해서 List 타입으로 진행

*/

public class 햄버거_만들기 {
	public int solution(int[] ingredient) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		for(int i : ingredient) {
			list.add(i);

			if(list.size() >= 4) {
				int a = list.get(list.size()-4);
				int b = list.get(list.size()-3);
				int c = list.get(list.size()-2);
				int d = list.get(list.size()-1);

				if(a == 1 && b == 2 && c == 3 && d == 1) {
					for(int j = 0; j < 4; j++) {
						list.remove(list.size()-1);
					}

					answer++;
				}

			}
		}

		return answer;
	}
}
