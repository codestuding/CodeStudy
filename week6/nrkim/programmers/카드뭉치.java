package week6.nrkim.programmers;

/**
 * PackageName : week6.nrkim.programmers
 * FileName    : 카드뭉치
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-02
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 02.     김누리(NRKim)               Initial creation
 */

/*

카드 뭉치를 뒤지면서 cards1 > cards2 > cards1 >~~~ 순번대로 뭉터기에서 카드 꺼내면서 조합

조합한 내용을 goal과 비교 하며 완성되면 yes 아니면 no 반환


*/

public class 카드뭉치 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {

		int index1 = 0; // cards1의 인덱스
		int index2 = 0; // cards2의 인덱스

		for(String g : goal) {
			if(index1 < cards1.length && cards1[index1].equals(g)) index1++;
			else if (index2 < cards2.length && cards2[index2].equals(g)) index2++;
			else return "No";
		}

		return "Yes";
	}
}
