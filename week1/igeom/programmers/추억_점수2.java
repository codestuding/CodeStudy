package week1.igeom.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억_점수2 {
    public static void main(String[] args) {
        String[] name =new String[]{"may", "kein", "kain", "radi"};
        int[] yearning = new int[]{5, 10, 1, 3};
        String[][] photo = new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = new int[photo.length];

        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i<name.length; i++){
            map.put(name[i],yearning[i]);
        }

        for(int i = 0; i<photo.length; i++){
            for(int j = 0; j<photo[i].length; j++){
                System.out.println(photo[i][j]);
                System.out.println();
                answer[i] += map.getOrDefault(photo[i][j],0);
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
