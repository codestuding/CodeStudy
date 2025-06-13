package week3.nrkim.programmers;

import java.util.LinkedList;
import java.util.List;

/**
 * PackageName : week3.nrkim.programmers
 * FileName    : 부족한_금액_계산하기
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
2.  인상 금액 계산
3.  인상 금액 - 현재 수중에 있는 돈 == 0 ? 0 : up - money;

*/

public class 부족한_금액_계산하기 {
	public long solution(int price, int money, int count) {
		long answer = 0;
		long up = 0; //  인상요금 저장용 배열

		//  반복하면서 인상 요금 완성
		for(int i = 0 ; i < count; i++) {
			up += (price * (i+1));
		}

		//  인상요금 - 현재 요금 했을 때, 음수가 나올경우 0으로 고정
		answer = up - money < 0 ? 0 : up - money;

		return answer;
	}
}


/*
JavaScript 버전

function solution(price, money, count) {
    var answer = -1;
    var up = 0

    for(var i = 1; i <= count; i++) {
        up += price * i
    }

    answer = up - money < 0 ? 0 : up - money

    return answer;
}

*/