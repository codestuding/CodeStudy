package week3.ingukeom;

public class 부족한 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count =4;
        long sum = 0;
        long answer  = -1;
        // sum 이랑 answer은 타입 맞춰주세요
        for(int i = 1 ; i <= count ; i++){
            sum = sum+(price * i);
        }
        if(sum <= money){
            answer = 0;
        }else if(sum > money){
            answer = sum - money;
        }
        System.out.println(answer);

    }
}
