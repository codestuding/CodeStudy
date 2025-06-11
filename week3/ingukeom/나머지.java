package week3.ingukeom;

public class 나머지 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        int sum = n-1;
        for (int i = 1; i <= sum; i++) {
            if(sum % i == 0){
                System.out.println(i);
            }
        }
    }
}
