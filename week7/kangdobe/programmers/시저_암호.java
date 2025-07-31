package week7.kangdobe.programmers;

// 아스키코드로 변환해서 돌리면 안되나? 대문자 = 65~90 / 소문자 = 97~122
// for문으로 하고 substring으로 잘라서 charat으로 변환하고 n값 더해주고 다시 String 변환? 해서 합치는거는 뭐여 (+)
public class 시저_암호 {
    public static String solution(String s, int n) {
        String result = ""; // 결과를 저장할 변수

        // 문자열 s를 한 글자씩 반복
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // i번째 문자를 가져온다

            // 공백일 경우는 그대로 추가
            if (ch == ' ') {
                result += " ";
            }
            // 대문자 (A=65 ~ Z=90)
            else if (ch >= 'A' && ch <= 'Z') {
                // n만큼 밀기
                char newChar = (char) (ch + n); // 일단 n만큼 밀어본다

                if (newChar > 'Z') {
                    newChar = (char) (newChar - 26); // A부터 다시 시작하게 26만큼 빼준다
                }

                result += newChar;
            }
            // 소문자(a=97 ~ z=122)
            else if (ch >= 'a' && ch <= 'z') {
                // n만큼 밀기
                char newChar = (char) (ch + n); // 일단 n만큼 밀어본다

                if (newChar > 'z') {
                    newChar = (char) (newChar - 26); // a부터 다시 시작하게 26만큼 빼준다
                }

                result += newChar;
            }
        }

        return result;
    }
}

/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
 * 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 * 
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 * 입출력 예
 * s n result
 * "AB" 1 "BC"
 * "z" 1 "a"
 * "a B z" 4 "e F d"
 */