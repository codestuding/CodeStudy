package week6.ingukeom;



//goal 배열을 순서대로 탐색하면서, 각 단어가 cards1의 현재 인덱스에 위치한 단어와 같으면 idx1을 증가, cards2의 현재 인덱스에 위치한 단어와 같으면 idx2를 증가시킵니다.
//
//둘 다 아니라면 만들 수 없는 경우이므로 "No"를 반환합니다.
//
//모든 goal을 순회하면 "Yes"를 반환합니다
public class 카드뭉치 {
    public static void main(String[] args) {
            String[] goal ={"i", "want", "to", "drink", "water"};
            String[] cards1 = {"i", "drink", "water"};
            String[] cards2 = {"want", "to"};
            int idx1 = 0;
            int idx2 = 0;
            for (String word : goal) {
                if (idx1 < cards1.length && word.equals(cards1[idx1])) {
                    idx1++;
                } else if (idx2 < cards2.length && word.equals(cards2[idx2])) {
                    idx2++;
                } else {
                    System.out.println("no");;
                }
            }
        System.out.println("yes");

    }
}
