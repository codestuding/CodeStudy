class Solution {
    public int solution(String word) {

        int answer = 0;
        int[] eong = {781, 156, 31, 6, 1};

        for (int i = 0; i < word.length(); i++) {
            String t = word.substring(i, i + 1); // 글자 추출
            int num = 0;

            switch (t) {
                case "A": num = 0; break;
                case "E": num = 1; break;
                case "I": num = 2; break;
                case "O": num = 3; break;
                case "U": num = 4; break;
            }

            answer += num * eong[i];
        }

        answer += word.length(); // 자기 자신 포함
        return answer;
    }
}