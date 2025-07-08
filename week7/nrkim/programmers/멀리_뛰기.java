package week7.nrkim.programmers;

/**
 * PackageName : week7.nrkim.programmers
 * FileName    : 멀리_뛰기
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-07
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 07.     김누리(NRKim)               Initial creation
 */

/*
효찬이가 한번에 뛸 수 있는거리 : 1칸 혹은 2칸
n이 1이면 걍 1칸만 뛰면 되니 1을 return
n이 2이면 1,1 / 2 만 뛰면 되니 2를 return
n이 3이면 1,1,1 / 1,2 / 2,1 ==> 3을 return
n이 4이면 1,1,1,1 / 1,1,2 / 1,2,1 / 2,1,1 / 2,2 ==> 5를 리턴
n이 5이면 1,1,1,1,1 / 1,1,1,2 / 1,1,2,1 / 1,2,1,1/ 2,1,1,1/ 1,2,2 / 2,1,2 / 2,2,1 =>8을 리턴

※
n| 1 | 2 | 3 | 4 | 5
r| 1 | 2 | 3 | 5 | 8

즉, n이 커질수록 전번차 r(n-2) + r(n-1) = rn 이되기 때문에, 피보나치 수열로 진행하면 된다.
*/

public class 멀리_뛰기 {
	public long solution(int n) {
		long answer = 0;
		long x = 1234567;
		long a = 1;
		long b = 2;

		if(n == 1) return answer = 1%x; // n = 1인 경우는 r = 1이므로 1을 리턴
		if(n == 2) return answer = 2%x; // n = 2인 경우는 r = 2이므로 2를 리턴

		for(long i = 3; i <= n; i++) {
			answer = (a+b) % x; // r = r(n-2) + r(n-1) % 1234567
			a = b;
			b = answer;
		}

		return answer;
	}
}
