package week1.igeom.programmers;

import java.util.Arrays;

public class 추억_점수1 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        name =new String[]{"may", "kein", "kain", "radi"};
        yearning = new int[]{5, 10, 1, 3};
        photo = new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        String[] name =new String[]{"may", "kein", "kain", "radi"};
        int[] yearning = new int[]{5, 10, 1, 3};
       String[][] photo = new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = new int[photo.length];


        for(int i = 0; i <photo.length; i++) {
            for(int j = 0; j<photo[i].length; j++) {
              for(int k = 0; k < name.length; k++) {
                  if(photo[i][j].equals(name[k])) {
                      answer[i] += yearning[k];
                  }
              }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
