package week6.kangdobe.programmers;

// 최초 풀이
// goal 에서 들어온 값을 분해해서 cards1[i]번째랑 cards2[i]번쨰를 for문으로 돌려서 가능한지 체크하고 리턴하면 되지않을까?

public class 카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0; // cards1의 현재 위치
        int i2 = 0; // cards2의 현재 위치

        // goal의 각 단어를 순서대로 확인
        for (int i = 0; i < goal.length; i++) {
            String word = goal[i];

            // cards1의 현재 카드가 goal과 일치하면 cards1에서 사용
            if (i1 < cards1.length && word.equals(cards1[i1])) {
                i1++; // cards1의 다음 카드로 이동
            }
            // cards2의 현재 카드가 goal과 일치하면 cards2에서 사용
            else if (i2 < cards2.length && word.equals(cards2[i2])) {
                i2++; // cards2의 다음 카드로 이동
            }
            // 둘 다 일치하지 않으면 규칙상 goal을 만들 수 없음
            else {
                return "No";
            }
        }

        // 모든 goal 단어를 cards1, cards2에서 순서 맞춰 사용했다면 Yes
        return "Yes";
    }
}

/*
 * 코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다.
 * 코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.
 * 
 * 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
 * 한 번 사용한 카드는 다시 사용할 수 없습니다.
 * 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
 * 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
 * 예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"],
 * 두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"]
 * 순서의 단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서
 * "want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수
 * 있습니다.
 * 
 * 문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때,
 * cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution
 * 함수를 완성해주세요.
 * 
 * 제한사항
 * 1 ≤ cards1의 길이, cards2의 길이 ≤ 10
 * 1 ≤ cards1[i]의 길이, cards2[i]의 길이 ≤ 10
 * cards1과 cards2에는 서로 다른 단어만 존재합니다.
 * 2 ≤ goal의 길이 ≤ cards1의 길이 + cards2의 길이
 * 1 ≤ goal[i]의 길이 ≤ 10
 * goal의 원소는 cards1과 cards2의 원소들로만 이루어져 있습니다.
 * cards1, cards2, goal의 문자열들은 모두 알파벳 소문자로만 이루어져 있습니다.
 * 입출력 예
 * cards1 cards2 goal result
 * ["i", "drink", "water"] ["want", "to"] ["i", "want", "to", "drink", "water"]
 * "Yes"
 * ["i", "water", "drink"] ["want", "to"] ["i", "want", "to", "drink", "water"]
 * "No"
 * 입출력 예 설명
 * 입출력 예 #1
 * 
 * 본문과 같습니다.
 * 
 * 입출력 예 #2
 * 
 * cards1에서 "i"를 사용하고 cards2에서 "want"와 "to"를 사용하여 "i want to"까지는 만들 수 있지만
 * "water"가 "drink"보다 먼저 사용되어야 하기 때문에 해당 문장을 완성시킬 수 없습니다. 따라서 "No"를 반환합니다.
 */