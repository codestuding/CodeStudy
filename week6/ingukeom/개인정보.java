package week6.ingukeom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class 개인정보 {
    public static void main(String[] args) throws ParseException {
        String[] terms = {};
        String[] privacies = {"2022.02.20"};
        System.out.println(solution("2022.05.19", terms, privacies));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};

//        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String a= privacies[0].trim();
//        LocalDate localDate = LocalDate.parse(a, date);
//        localDate = localDate.plusMonths(3);
//        System.out.println(localDate);
//
//        DateTimeFormatter todayFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
//        LocalDate localDate2 = LocalDate.parse(today.replace('-', '.'), todayFormatter);
//        int answers = localDate.compareTo(localDate2);
//        System.out.println(answers);
        return answer;

    }
}
