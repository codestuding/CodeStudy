package week6.ingukeom;
import java.util.*;

public class 가까운 {
    public static void main(String[] args) {
        String s = "banana";
        int[] answer = new int[s.length()];
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lastIndex.containsKey(c)) {
                answer[i] = i - lastIndex.get(c);
                System.out.println(i);
                System.out.println();
                System.out.println("lastindex : "+lastIndex.get(c));
            } else {
                answer[i] = -1;
            }
            lastIndex.put(c, i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
