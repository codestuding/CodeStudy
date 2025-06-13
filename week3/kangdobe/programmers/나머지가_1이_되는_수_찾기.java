package week3.kangdobe.programmers;

public class 나머지가_1이_되는_수_찾기 {
    public int solution(int n) {
        int answer = 0;
        // 나머지 연산자  % 사용하기
        // i가 0 일때 예외 발생해서 1로 교체
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                // 1이 남을때 answer에 담기
                answer = i;
                break;
            }
        }
        return answer;
    }
}
/*
자연수 n이 매개변수로 주어집니다.
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.
 */