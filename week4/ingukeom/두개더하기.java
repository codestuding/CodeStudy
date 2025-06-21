package week4.ingukeom;

import java.util.*;

public class 두개더하기 {
    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
        Set<Integer> set = new HashSet<>();
        List<Integer> a = new ArrayList<>();


        for(int i = 0; i<=numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                set.add((numbers[i]+numbers[j]));
            }
        }
        int index = 0;
        int[] answer =new int[set.size()];
        for(Integer s :  set){
            answer[index++] = s;
        }
        System.out.println(Arrays.toString(answer));
    }
}
