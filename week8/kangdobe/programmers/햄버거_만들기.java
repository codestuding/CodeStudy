package week8.kangdobe.programmers;

// 순서는 1231 이 되면 answer +1
// 그냥 배열에서 1이 있으면 다음 2를 찾고 그렇게 1,2,3,1 을 반복해서 다 찾으면 지우고 이런식으로?
// 음 아니면 인풋 값을 하나씩 잘라서  문자 배열로 넣고(split("")) 1이 for 문 돌리고 1이 나올때 뒤에 231 이 나오는 값을 확인하고 맞으면 배열에서 뺴고
// indexOf 랑 delete 라는걸 배웠어요, deleteCharAt도 있는데 나중에 쓰자
// 시간 무지막지하구마 스택 사용했어야하나

/*
class Solution {
    public int solution(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i; // 아하 4 이상일때 해서 역으로 1321이 있으면 지워버리고 답 +1
            if (sp >= 4 && stack[sp - 1] == 1
                && stack[sp - 2] == 3
                && stack[sp - 3] == 2
                && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }
}
 */

public class 햄버거_만들기 {
    public int solution(int[] ingredient) {
        int answer = 0;

        // 배열 잘라다 문자로 변환
        StringBuilder burger = new StringBuilder();
        for (int i = 0; i < ingredient.length; i++) {
            burger.append(ingredient[i]);
        }

        // 아 for 문은 못쓰고 1231이 안나올때까지 계속 돌리기 while 사용
        while (true) {
            int chk = burger.indexOf("1231"); // 1231 찾고 위치 알려주는거, 없을땐 -1 반환

            if (chk == -1)
                break; // 햄버거 없음 아니 이거 왜 자동으로 내려오지

            // 햄버거 만들면 삭제하고 카운트 +1
            burger.delete(chk, chk + 4);
            answer++;

        }

        return answer;
    }
}

/*
 * 햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다. 함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면 조리된
 * 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고, 상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다. 상수가
 * 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다. 상수는 손이 굉장히 빠르기 때문에
 * 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며, 재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는
 * 없습니다.
 * 
 * 예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때, 상수는 여섯 번째 재료가
 * 쌓였을 때, 세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고, 아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째
 * 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다. 즉, 2개의 햄버거를 포장하게 됩니다.
 * 
 * 상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때, 상수가 포장하는 햄버거의 개수를 return 하도록
 * solution 함수를 완성하시오.
 * 
 * 제한사항
 * 1 ≤ ingredient의 길이 ≤ 1,000,000
 * ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.
 * 입출력 예
 * ingredient result
 * [2, 1, 1, 2, 3, 1, 2, 3, 1] 2
 * [1, 3, 2, 1, 2, 1, 3, 1, 2] 0
 */