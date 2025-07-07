package week7.nrkim.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * PackageName : week7.nrkim.programmers
 * FileName    : 신고_결과_받기
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-07
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 07.     김누리(NRKim)               Initial creation
 */

/*
신고자 / 신고 받은 자

       muzi    frodo    apeach    neo
muzi    -        V        X        V

frodo   X        -        X        V

apeach  V        V        -        X

neo     X        X        X        -


신고 한 내용
muzi   > frodo neo  > frodo, neo
frodo  > neo        > neo
apeach > muzi frodo > frodo
neo > X


신고 당한 이력
muzi   1 >> 경고
frodo  2 >> 정지
apeach 0
neo    2 >> 정지


신고 처리 결과

muzi   > muzi frodo, muzi neo      >> 2건의 신고가 정지됨
frodo  > frodo neo                 >> 1건의 신고가 정지됨
apeach > apeach frodo, apeach muzi >> 1건(apeach frodo)의 신고가 정지됨
neo    >                           >> 신고건수 0건, 정지 건수도 0건

*/

public class 신고_결과_받기 {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String, Integer> map = new HashMap<>(); //  유저 별 신고 건수 정리용 map
		Set<String> set = new HashSet<>(); //  신고 내용 중복 제거용 set

		//  id별 신고 건수 초기화
		for(String id : id_list) {
			map.put(id,0);
		}

		//  중복 신고 내용 제거 : 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
		//  예 : case2의 ["ryan con", "ryan con", "ryan con", "ryan con"] 경우 ryan con 1번만 측정
		for(String r : report) {
			set.add(r);
		}

		List<String> list = new ArrayList<>(set);

		//  중복 제거 처리 된 신고 내용 처리
		for(String r : list) {
			String[] tmp = r.split(" ");
			String from = tmp[0]; //  신고자
			String to = tmp[1];   //  피신고자

			//  to 기준으로 map 카운팅 로직
			map.put(to, map.getOrDefault(to,0)+1);
		}

		//  map에 카운팅 된 건수를 기준으로 from > to 처리 결과 정리
		for(String r : list) {
			//  코드 작성
			String[] tmp = r.split(" ");
			String from = tmp[0];
			String to = tmp[1];

			for(int i = 0; i < id_list.length; i++) {
				if(from.equals(id_list[i])) {
					//  피신고자의 신고 당한 횟수가 k건 이상이면 answer ++
					if(map.get(to) >= k) {
						answer[i]++;
					}
				}
			}
		}

		return answer;
	}
}
