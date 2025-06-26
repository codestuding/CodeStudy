package week4.kangdobe.programmers;

import java.util.Arrays;

/*
        // max 안쓰고 해보려고 했던 조건문 너무 길어서 뺐다 아래는 원래 있던거

        // MAX 쓰는방법밖에 없나? 안쓰고 해보기
        // int[] answer = {}; <- 길이떄문에 런타임난다 3으로 선언하고 index 로 짜르는거로 변경
        if (cnt1 > cnt2) {
            if (cnt1 > cnt3) {
                answer[0] = 1;

                index = 1;
            } else if (cnt1 == cnt3) {
                answer[0] = 1;
                answer[1] = 3;

                index = 2;
            } else {
                answer[0] = 3;

                index = 1;
            }
        } else if (cnt1 == cnt2) {
            if (cnt1 > cnt3) {
                answer[0] = 1;
                answer[1] = 2;

                index = 2;
            } else if (cnt1 == cnt3) {
                answer[0] = 1;
                answer[1] = 2;
                answer[2] = 3;

                index = 3;
            } else if (cnt1 < cnt3) {
                answer[0] = 3;

                index = 1;
            }
        } else if (cnt1 < cnt2) {
            if (cnt2 > cnt3) {
                answer[0] = 2;

                index = 1;
            } else if (cnt2 == cnt3) {
                answer[0] = 2;
                answer[1] = 3;

                index = 2;
            } else {
                answer[0] = 3;

                index = 1;
            }
        } else {
            answer[0] = 3;

            index = 1;
        }
 */
public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = new int[3]; // 최대 3명까지 정답일수 있으니 3으로 선언
        int index = 0;

        int[] math1 = { 1, 2, 3, 4, 5 }; // 수포자1
        int[] math2 = { 2, 1, 2, 3, 2, 4, 2, 5 }; // 수포자2
        int[] math3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }; // 수포자3

        // 수포자들이 맞춘 정답 수
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        // 수포자들의 패턴대로 돌려서 정답 카운트하기
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == math1[i % 5])
                cnt1++;
            if (answers[i] == math2[i % 8])
                cnt2++;
            if (answers[i] == math3[i % 10])
                cnt3++;
        }

        // 최고점수값이 몇인지(max) 수포자1 정답 수 부터 확인하기
        int max = cnt1;
        if (cnt2 > max)
            max = cnt2;
        if (cnt3 > max)
            max = cnt3;

        // max 값과 같은 점수를 가진 수포자만 answer 배열에 넣고 index++로 넓히기
        // else if 로 하면 복잡해지니까 그냥 따로따로 if로 걸어둠
        if (cnt1 == max) {
            answer[index] = 1;
            index++;
        }

        if (cnt2 == max) {
            answer[index] = 2;
            index++;
        }

        if (cnt3 == max) {
            answer[index] = 3;
            index++;
        }

        // 실제 정답자 수만큼만(index 로 짤라서) 새로운 배열에 복사해 리턴
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = answer[i];
        }

        return result;
    }
}
/*
 * 문제 설명
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
 * ...
 * 
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
 * 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한 조건
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 * 입출력 예
 * answers return
 * [1,2,3,4,5] [1]
 * [1,3,2,4,2] [1,2,3]
 * 입출력 예 설명
 * 입출력 예 #1
 * 
 * 수포자 1은 모든 문제를 맞혔습니다.
 * 수포자 2는 모든 문제를 틀렸습니다.
 * 수포자 3은 모든 문제를 틀렸습니다.
 * 따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
 * 
 * 입출력 예 #2
 * 
 * 모든 사람이 2문제씩을 맞췄습니다.
 */