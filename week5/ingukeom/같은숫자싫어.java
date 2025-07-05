package week5.ingukeom;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자싫어 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = {};
        for(int i : arr) {
            if(stack.empty() || stack.peek() != i) {
                stack.push(i);
            }

        }
        Integer[] temp = stack.toArray(new Integer[stack.size()]);
        //stack.toArray(new Integer[stack.size()])로 스택의 값을 Integer[] 배열로 복사한 뒤, 각 요소를 int로 변환하여 int[]에 담습니다
        answer = new int[temp.length];
        for(int i=0;i<temp.length;i++){
            answer[i] = temp[i];
        }

        System.out.println(answer);
    }
}
