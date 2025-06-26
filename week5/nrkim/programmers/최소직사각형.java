package week5.nrkim.programmers;

/**
 * PackageName : week5.nrkim.programmers
 * FileName    : 최소직사각형
 * Author      : 김누리(NRKim)
 * Date        : 2025-06-26
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 06. 26.     김누리(NRKim)               Initial creation
 */

/*

Math.max나 Math.min을 이용해 명함의 가로 세로의 최대 최소값을 구하며 진행

*/

public class 최소직사각형 {
	public int solution(int[][] sizes) {
		int answer = 0;
		int w = 0;
		int h = 0;

		for(int[] size : sizes) {
			w = Math.max(w,Math.max(size[0],size[1]));
			h = Math.max(h,Math.min(size[0],size[1]));
		}

		answer = w*h;

		return answer;
	}
}
