package week3.nrkim.programmers;

import java.util.LinkedList;
import java.util.List;

/**
 * PackageName : week3.nrkim.programmers
 * FileName    : 나머지가_1이_되는_수_찾기
 * Author      : 김누리(NRKim)
 * Date        : 2025-06-12
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 06. 12.     김누리(NRKim)               Initial creation
 */

/*

1.  반복을 돌린다 ==> 일반 for문 (int i = 1; i <= n; i++)
2.  n%i == 1 ==> return

*/

public class 나머지가_1이_되는_수_찾기 {
	public int solution(int n) {
		int answer = 0;

		for(int i = 1; i <= n; i++) {
			if(n%i == 1) {
				answer = i;
				break;
			}
		}

		return answer;
	}
}


/*
JavaScript 버전

function solution(n) {
    var answer = 0;

    for(var i = 1; i <= n; i++) {
        if( n % i == 1) {
            answer = i
            break
        }

    }

    return answer;
}

*/