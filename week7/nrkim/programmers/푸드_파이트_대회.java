package week7.nrkim.programmers;

/**
 * PackageName : week7.nrkim.programmers
 * FileName    : 푸드_파이트_대회
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-08
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 08.     김누리(NRKim)               Initial creation
 */

/*

음식 개수가 홀수(2n + 1)의 경우 -1 해서 진행

Case 1 :
idx 0 >> 물 중앙값
idx 1 >> 1번 음식 갯수 : 3개 >> 1개는 잉여 2개로 진행
idx 2 >> 2번 음식 갯수 : 4개 >> 4개 그대로 진행
idx 3 >> 3번 음식 갯수 : 6개 >> 6개 그대로 진행


*/

public class 푸드_파이트_대회 {
	public String solution(int[] food) {
		String answer = "";
		StringBuilder left = new StringBuilder();

		// A vs B중 일단 A 부분만 먼저 구성
		for(int i = 0; i < food.length; i++) {

			//  food[0] 일때는 물, 1개만 있을 테니, i!=0일때만 돌린다고 가정
			if(i != 0 ) {
				//  food[i]의 값이 홀수이면 food[i] -1
				if(food[i]%2 == 1) food[i]--;

				for(int j = 0; j < food[i]/2; j++) {
					left.append(i);
				}
			}
		}

		answer = left.toString();

		answer = answer + "0" + left.reverse().toString();

		return answer;
	}
}
