package week3.ingukeom;

public class 덧칠하기 {
    public static void main(String[] args) {

        int n = 18;
        int m = 2;
        int[] section = new int[]{12,13,14,15};
        int answer = 0;
        int start = section[0];
        answer ++;
        for(int item : section) {
            if(start + m > item ){
                continue;
            }
            start = item;
            answer++;
        }
        System.out.println(answer);

    }
}
