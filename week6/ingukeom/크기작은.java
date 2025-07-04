package week6.ingukeom;

public class 크기작은 {
    public static void main(String[] args) {
        String t = "3141592";
        String p ="271";
        int answer = 0;
        int len = p.length();
        long pNum = Long.parseLong(p); //   p가 더 클수있으니 long으로

        for (int i = 0; i <= t.length() - len; i++) {
            String sub = t.substring(i, i + len);
            System.out.println(sub);
            long subNum = Long.parseLong(sub);
            if (subNum <= pNum) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
