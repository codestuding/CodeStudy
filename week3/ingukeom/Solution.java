package week3.ingukeom;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n){
        int answer = 0;
        int sum = n-1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=sum; i++) {
            if (sum % i == 0) {
                list.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int num : list){
            if(num !=1 && num < min ){
                min = num;
            }
            answer = min;
        }
        return answer;
    }
    /*
    *
    *    public int solution(int n){
        int answer = 0;
        int sum = n-1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=sum; i++) {
            if (sum % i == 0) {
                list.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int num : list){
            if(num !=1 && num < min ){
                min = num;
            }
            answer = min;
        }
        return answer;
    }
    * */
}
