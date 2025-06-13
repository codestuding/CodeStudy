package week3.kangdobe.programmers;
/*
solution1 =
총 지불 금액 = 음...3 일때 3,6,9,12 이러면 팩토리얼 사용
팩토리얼은 for문 혹은 재귀함수[^*1] 사용
팩토리얼이 아니라 등차수열의 합이었네요

solution2 =
수식으로 해결할 수 있어보이는데 수식정리해보기
총 지불 금액 계산할때 int*int*int 계산 중간에 int 범위를 넘어갈 수 있기때문에
맨 처음에 long 으로 형변환을 해주고 갑시다
*/
public class 부족한_금액_계산하기 {

    public static void main(String[] args) {
        부족한_금액_계산하기 sol = new 부족한_금액_계산하기();
        sol.solution2(3, 20, 4); // 여기에서 실제로 호출해야 println이 작동!
    }

    public long solution1(int price, int money, int count) {
        long answer = -1;

        long totalCost = 0;

        //총 지불 금액 계산
        for(int i = 1; i <= count ;i++) {
            totalCost += price * i;
        }

        // 총 지불 금액 계산 이후 정산
        answer =  totalCost - money;

        // 정산 이후 -가 아닐때 0 처리
        if (answer < 0) {
            answer = 0;
        }
        return answer;
    }

    // 수식으로 해보기
    public long solution2(int price, int money, int count) {
        long totalCost = 0;
        // 총 지불 금액 계산
        totalCost = (long)price * count * (count +1) / 2; // 등차수열의 합, 계산중 int 범위 넘어갈 수 있으니 형변환

        long answer = totalCost - money;
        System.out.println("totalCost = " + totalCost + " / answer = " + answer);

        // 정산 이후 -가 아닐때 0 처리
        if (answer < 0) {
            answer = 0;
        }
        System.out.println();
        return answer;
    }
}


/*
새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
단, 금액이 부족하지 않으면 0을 return 하세요.

제한사항
놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
 */