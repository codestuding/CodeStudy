package week3.nrkim.programmers;

import java.util.LinkedList;
import java.util.List;

/**
 * PackageName : week3.nrkim.programmers
 * FileName    : 덧칠하기
 * Author      : 김누리(NRKim)
 * Date        : 2025-06-12
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 06. 12.     김누리(NRKim)               Initial creation
 */

/*

n = 페인트가 칠해진 벽의 길이
m = 롤러의 길이
section[] = 페인트 발라야 되는 구간

칠해야 되는 곳이, 마지막으로 칠해진 위치 내에 있으면 계속 칠해 나가야 되기 때문에 마지막 칠해진 위치를 저장하는 변수필요
*/

public class 덧칠하기 {
	public int solution(int n, int m, int[] section) {
		int answer = 0;
		int last = 0; // 마지막으로 칠해진 곳 위치


		for(int i = 0; i < section.length; i++) {
			if(section[i] <= last) continue; // 현재 위치가 마지막으로 칠해진 위치 이전인지 판독

			last = section[i] + m - 1; // section[i] 에서 m칸 칠함
			answer++;
		}


		return answer;
	}
}


/*
JavaScript 버전

function solution(n, m, section) {
    var answer = 0;
    var last = 0;

    for(var i = 0; i < section.length; i++) {
        if(section[i] <= last) continue

        last = section[i] + m -1
        answer++
    }

    return answer;
}

*/