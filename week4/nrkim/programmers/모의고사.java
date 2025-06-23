package week4.nrkim.programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * PackageName : week4.nrkim.programmers
 * FileName    : 모의고사
 * Author      : 김누리(NRKim)
 * Date        : 2025-06-17
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 06. 17.     김누리(NRKim)               Initial creation
 */

/*
1.  각 수포자들이 답을 찍는 것을 패턴화.
1번 학생 : 1 2 3 4 5 / 1 2 3 4 5 / 1 2 3 4 5
2번 학생 : 2 1 2 3 2 4 2 5 / 2 1 2 3 2 4 2 5
3번 학생 : 3 3 1 1 2 2 4 4 5 5 3 3 1 1 2 2 4 4 5 5
2.  이후 파라미터로 주어지는 정답지를 보고 누가 제일 많이 맞추었나 비교.
*/

public class 모의고사 {
	public int[] solution(int[] answers) {
		//  각 수포자들 정답 선택 배열
		int[] one = {1,2,3,4,5};
		int[] two = {2,1,2,3,2,4,2,5};
		int[] three = {3,3,1,1,2,2,4,4,5,5};

		//  각 수포자들 정답 수
		int oneCnt = 0;
		int twoCnt = 0;
		int threeCnt = 0;

		//  임시 리스트
		List<Integer> tmp = new ArrayList<>();


		//  정답 수 카운팅
		for (int i = 0; i < answers.length; i++) {
			if(answers[i] == one[i%one.length]) {
				oneCnt++;
			}

			if(answers[i] == two[i%two.length]) {
				twoCnt++;
			}

			if(answers[i] == three[i%three.length]) {
				threeCnt++;
			}
		}

		//  최대값 취득
		int maxV = Math.max(oneCnt,Math.max(twoCnt,threeCnt));

		//  각 수포자들의 정답 갯수 == 최대값 여부 확인
		if (maxV == oneCnt) tmp.add(1);
		if (maxV == twoCnt) tmp.add(2);
		if (maxV == threeCnt) tmp.add(3);


		int[] answer = new int[tmp.size()];

		int idx = 0;
		for(int i : tmp) {
			answer[idx++] = i;
		}


		return answer;
	}
}
