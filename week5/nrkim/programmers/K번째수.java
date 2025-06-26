package week5.nrkim.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * PackageName : week5.nrkim.programmers
 * FileName    : K번째수
 * Author      : 김누리(NRKim)
 * Date        : 2025-06-26
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 06. 26.     김누리(NRKim)               Initial creation
 */

/*

i j k 위치 잡고 그대로 반복하며 배열 만들고 정렬 하면됨

*/

public class K번째수 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int idx = 0;

		for(int[] command : commands) {
			List<Integer> tmp = new ArrayList<>();  // i 번에서 j 번 까지 채집한 값들을 넣을 임시 list, array로 해도 되지만, 길이가 유동적일테니 array보다 list 채용
			int i = command[0]-1;  // i(시작점)에 해당 하는 값 [2,5,3] 중 2번째 수는 idx 상으로는 1이여야 함
			int j = command[1]-1;  // j(끝점)에 해당 하는 값 [2,5,3] 중 5번째 수는 idx 상으로는 4이여야 함
			int k = command[2]-1;  // k(타겟 번호)에 해당 하는 값 [2,5,3] 중 3번째 수는 idx 상으로는 2이여야 함

			//  i부터 j 까지 배열 생성
			for(int a = i; a <= j; a++) {
				tmp.add(array[a]);
			}

			//  i부터 j 까지 추출 한 값 정렬
			Collections.sort(tmp);

			//  answer에 k번째 값 적재
			answer[idx++] = tmp.get(k);

		}

		return answer;
	}
}
