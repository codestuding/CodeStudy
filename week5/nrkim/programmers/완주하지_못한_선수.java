package week5.nrkim.programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * PackageName : week5.nrkim.programmers
 * FileName    : 완주하지_못한_선수
 * Author      : 김누리(NRKim)
 * Date        : 2025-06-26
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 06. 26.     김누리(NRKim)               Initial creation
 */

//  해쉬맵 써도 되고 안써도 됨

public class 완주하지_못한_선수 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String,Integer> map = new HashMap<>();

		//  map에 참여자 정보 ++
		for (String participants : participant) {
			map.put(participants,map.getOrDefault(participants,0)+1);
		}

		//  map에서 완주자 정보 --
		for (String completions : completion) {
			map.put(completions,map.getOrDefault(completions,0)-1);
		}

		//  map에 0이 아닌 값을 answer로 제출
		for (String participants : participant) {
			if (map.get(participants) != 0) answer = participants;
		}



		return answer;
	}

	//  HashMap 이용하지 않은 버전
	// 	public String solution(String[] participant, String[] completion) {
	//         Arrays.sort(participant);
	//         Arrays.sort(completion);

	//         for(int i = 0; i < completion.length; i++) {
	//             if(!participant[i].equals(completion[i])){
	//                 return participant[i]; // 동명 이인의 경우
	//             }
	//         }

	// 		return participant[participant.length-1];
	// 	}
}
