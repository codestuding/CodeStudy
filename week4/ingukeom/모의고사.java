package week4.ingukeom;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] ptn1 = {1, 2, 3, 4, 5};
        int[] ptn2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ptn3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        int[] cnt = {0,0,0,0};

        for(int i=0; i< answers.length; i++){
            if(answers[i] == ptn1[i%5]) cnt[1]++;
            if(answers[i] == ptn2[i%8]) cnt[2]++;
            if(answers[i] == ptn3[i%10]) cnt[3]++;
        }

        int max= Math.max(Math.max(cnt[1], cnt[2]),cnt[3]);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=1; i<4; i++){
            if(max==cnt[i]) result.add(i);
        }


        int[] resultToArr = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            resultToArr[i] = result.get(i);
        }

        return resultToArr;
    }

}
