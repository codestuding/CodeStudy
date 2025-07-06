package week6.nrkim.programmers;

/**
 * PackageName : week6.nrkim.programmers
 * FileName    : 크기가_작은_부분문자열
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-02
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 02.     김누리(NRKim)               Initial creation
 */


/*

t를 p의 길이만큼 쪼갠다
예 :
3 1 4 1 5 9 2 > 314 141 415 159 592

이 중 p이하인 값의 갯수는?
p = 271

141 159

2개

*/

public class 크기가_작은_부분문자열 {
	public int solution(String t, String p) {
		int answer = 0;
		int p_len = p.length(); //  p의 사이즈
		int t_len = t.length(); //  t의 사이즈

		//  t_len와 p_len의 차이만큼 반복
		for(int i = 0; i <= t_len-p_len; i++) {
			String key = t.substring(i,i+p_len);

			if(Long.parseLong(p) >= Long.parseLong(key)) answer++;

		}

		return answer;
	}
}
