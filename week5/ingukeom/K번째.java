package week5.ingukeom;

import java.util.Arrays;

public class K번째 {
    public static void main(String[] args) {

       int[] array =  {1, 5, 2, 6, 3, 7, 4};
       int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 1-based → 0-based
            int end = commands[i][1];       // copyOfRange는 end 미포함
            int k = commands[i][2] - 1;     // 1-based → 0-based

            int[] temp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(temp);
            answer[i] = temp[k];
            System.out.println(answer[i]);
        }
    }
}
