package week8.kangdobe.programmers;

// 일단 mm:ss 를 : 기준으로 split 하고 따로 배열에 저장하고 ss가 60 이상일때 mm ++, ss - 60 하기
// 아니다 그냥 다 초로 바꿔버리고 마지막에 변환 하는게 어떤가?
// 왜 안다ㅣㅁㄴ구ㅗ라ㅓㄴ우ㅠ라ㅣㅓㅗㅇ류휘ㅏㅓㅗㄴ우ㅠㄹ so 내 몬한다

public class 동영상_재생기 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 문자열 전부 초로 변환
        String[] max = video_len.split(":");
        String[] now = pos.split(":");
        String[] st = op_start.split(":");
        String[] ed = op_end.split(":");

        // 형변환을 다 해야 하네요 형변 하고 초로 변환
        int maxsec = Integer.parseInt(max[0]) * 60 + Integer.parseInt(max[1]);
        int current = Integer.parseInt(now[0]) * 60 + Integer.parseInt(now[1]);
        int opStart = Integer.parseInt(st[0]) * 60 + Integer.parseInt(st[1]);
        int opEnd = Integer.parseInt(ed[0]) * 60 + Integer.parseInt(ed[1]);

        // 명령어 처리
        for (int i = 0; i < commands.length; i++) {
            // 명령어 확인
            String cmd = commands[i];

            // 하기 전에 오프닝 구간이면 스킵
            if (current >= opStart && current <= opEnd) {
                current = opEnd;
            }

            // 명령어 prev 실행
            if (cmd.equals("prev")) {
                current = current - 10;
                // 0 이하일때는 0으로 고정
                if (current < 0) {
                    current = 0;
                }
            }
            // 명령어 next 실행
            else if (cmd.equals("next")) {
                current = current + 10;
                // maxsec일때는 maxsec로 고정
                if (current > maxsec) {
                    current = maxsec;
                }
            }
        }

        // 하고 나서 오프닝 구간이면 스킵
        if (current >= opStart && current <= opEnd) {
            current = opEnd;
        }

        // 다 했으면 mm:ss 형식으로 바꾸기
        int mm = current / 60;
        int ss = current % 60;

        // 바꾸고 형변환도 필요하고 나서 10 이하일때 0 붙여주고 :도 붙이기
        String mmStr = "";
        if (mm < 10) {
            mmStr = "0" + mm;
        } else {
            mmStr = String.valueOf(mm);
        }

        String ssStr = "";
        if (ss < 10) {
            ssStr = "0" + ss;
        } else {
            ssStr = String.valueOf(ss);
        }

        return mmStr + ":" + ssStr;
    }

}

/*
 * 당신은 동영상 재생기를 만들고 있습니다. 당신의 동영상 재생기는 10초 전으로 이동, 10초 후로 이동, 오프닝 건너뛰기 3가지 기능을
 * 지원합니다. 각 기능이 수행하는 작업은 다음과 같습니다.
 * 
 * 10초 전으로 이동: 사용자가 "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동합니다. 현재 위치가
 * 10초 미만인 경우 영상의 처음 위치로 이동합니다. 영상의 처음 위치는 0분 0초입니다.
 * 10초 후로 이동: 사용자가 "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동합니다. 동영상의 남은
 * 시간이 10초 미만일 경우 영상의 마지막 위치로 이동합니다. 영상의 마지막 위치는 동영상의 길이와 같습니다.
 * 오프닝 건너뛰기: 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는
 * 위치로 이동합니다.
 * 동영상의 길이를 나타내는 문자열 video_len, 기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos, 오프닝 시작 시각을 나타내는
 * 문자열 op_start, 오프닝이 끝나는 시각을 나타내는 문자열 op_end, 사용자의 입력을 나타내는 1차원 문자열 배열
 * commands가 매개변수로 주어집니다. 이때 사용자의 입력이 모두 끝난 후 동영상의 위치를 "mm:ss" 형식으로 return 하도록
 * solution 함수를 완성해 주세요.
 * 
 * 제한사항
 * video_len의 길이 = pos의 길이 = op_start의 길이 = op_end의 길이 = 5
 * video_len, pos, op_start, op_end는 "mm:ss" 형식으로 mm분 ss초를 나타냅니다.
 * 0 ≤ mm ≤ 59
 * 0 ≤ ss ≤ 59
 * 분, 초가 한 자리일 경우 0을 붙여 두 자리로 나타냅니다.
 * 비디오의 현재 위치 혹은 오프닝이 끝나는 시각이 동영상의 범위 밖인 경우는 주어지지 않습니다.
 * 오프닝이 시작하는 시각은 항상 오프닝이 끝나는 시각보다 전입니다.
 * 1 ≤ commands의 길이 ≤ 100
 * commands의 원소는 "prev" 혹은 "next"입니다.
 * "prev"는 10초 전으로 이동하는 명령입니다.
 * "next"는 10초 후로 이동하는 명령입니다.
 * 입출력 예
 * video_len pos op_start op_end commands result
 * "34:33" "13:00" "00:55" "02:55" ["next", "prev"] "13:00"
 * "10:55" "00:05" "00:15" "06:55" ["prev", "next", "next"] "06:55"
 * "07:22" "04:05" "00:15" "04:07" ["next"] "04:17"
 * 입출력 예 설명
 * 입출력 예 #1
 * 
 * 시작 위치 13분 0초에서 10초 후로 이동하면 13분 10초입니다.
 * 13분 10초에서 10초 전으로 이동하면 13분 0초입니다.
 * 따라서 "13:00"을 return 하면 됩니다.
 * 입출력 예 #2
 * 
 * 시작 위치 0분 5초에서 10초 전으로 이동합니다. 현재 위치가 10초 미만이기 때문에 0분 0초로 이동합니다.
 * 0분 0초에서 10초 후로 이동하면 0분 10초입니다.
 * 0분 10초에서 10초 후로 이동하면 0분 20초입니다. 0분 20초는 오프닝 구간이기 때문에 오프닝이 끝나는 위치인 6분 55초로
 * 이동합니다. 따라서 "06:55"를 return 하면 됩니다.
 * 입출력 예 #3
 * 
 * 시작 위치 4분 5초는 오프닝 구간이기 때문에 오프닝이 끝나는 위치인 4분 7초로 이동합니다. 4분 7초에서 10초 후로 이동하면 4분
 * 17초입니다. 따라서 "04:17"을 return 하면 됩니다.
 */