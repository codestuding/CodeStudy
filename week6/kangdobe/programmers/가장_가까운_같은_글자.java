package week6.kangdobe.programmers;

//최초 풀이
// 음음...문자열 잘라다 배열에 넣기 String str = "hello"; String[] arr = str.split("");
// 처음이면 -1 그 이후에 다시 나오면 이전 같은 글자와 거리 차이만큼 입력
// 일단 단순하게 하면 이중 for 문으로 answer[i] 마다 j = i-1, i-2, i-3.. 이런식으로 돌려서 없으면 -1 있으면 i-j로 배열에 넣기?
// 시간복잡도? 그거 최악인거같아서 다른 문제풀이 확인

// 다른사람 풀이
/*
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();   // HashMap 사용으로 단어를 값으로 위치를 밸류로?
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);                          // s 단어 쪼개기
            answer[i] = i-map.getOrDefault(ch,i+1);
            // i번째에서 map에서 같은 단어 있는지 찾아서 answer에다가 없으면 i-(i+1)=-1 있으면 map 에서 ch 에 대응되는 값을 i에서 뺸다
            map.put(ch,i);                                  //그리고 map 에다가 단어랑 위치값을 넣는다~ < 중복 단어 거리 체크용
        }
        return answer;
    }
}
 */

public class 가장_가까운_같은_글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()]; // 결과 배열은 문자열 길이만큼 준비

        // 문자열을 문자 배열로 변환 (문자 하나씩 접근하기 쉽게)
        String[] arr = s.split(""); // 이거 왜나오는겨

        // 각 위치 i에 대해
        for (int i = 0; i < arr.length; i++) {
            int dist = -1; // 기본값 -1로 초기화 (처음 나온 글자일 가능성)

            // 현재 i에서 왼쪽으로 한 칸씩 가며 같은 글자가 있었는지 확인
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i].equals(arr[j])) {
                    dist = i - j; // 같은 글자를 찾으면 거리 계산
                    break; // 가까운 글자를 찾았으니 멈춤
                }
            }

            answer[i] = dist; // 찾은 거리(혹은 -1)를 결과에 기록
        }

        return answer;
    }
}
/*
 * 문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고
 * 싶습니다.
 * 예를 들어, s="banana"라고 할 때, 각 글자들을 왼쪽부터 오른쪽으로 읽어 나가면서 다음과 같이 진행할 수 있습니다.
 * 
 * b는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
 * a는 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
 * n은 처음 나왔기 때문에 자신의 앞에 같은 글자가 없습니다. 이는 -1로 표현합니다.
 * a는 자신보다 두 칸 앞에 a가 있습니다. 이는 2로 표현합니다.
 * n도 자신보다 두 칸 앞에 n이 있습니다. 이는 2로 표현합니다.
 * a는 자신보다 두 칸, 네 칸 앞에 a가 있습니다. 이 중 가까운 것은 두 칸 앞이고, 이는 2로 표현합니다.
 * 따라서 최종 결과물은 [-1, -1, -1, 2, 2, 2]가 됩니다.
 * 
 * 문자열 s이 주어질 때, 위와 같이 정의된 연산을 수행하는 함수 solution을 완성해주세요.
 * 
 * 제한사항
 * 1 ≤ s의 길이 ≤ 10,000
 * s은 영어 소문자로만 이루어져 있습니다.
 * 입출력 예
 * s result
 * "banana" [-1, -1, -1, 2, 2, 2]
 * "foobar" [-1, -1, 1, -1, -1, -1]
 * 입출력 예 설명
 * 입출력 예 #1
 * 지문과 같습니다.
 * 
 * 입출력 예 #2
 * 설명 생략
 */