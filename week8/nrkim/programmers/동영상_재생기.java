package week8.nrkim.programmers;

/**
 * PackageName : week8.nrkim.programmers
 * FileName    : 동영상_재생기
 * Author      : 김누리(NRKim)
 * Date        : 2025-07-24
 * Description :
 * =====================================================================================================================
 * DATE          AUTHOR               NOTE
 * ---------------------------------------------------------------------------------------------------------------------
 * 2025. 07. 24.     김누리(NRKim)               Initial creation
 */

/*
pos : 기준이 되는 재생 위치
op_start : 오프닝 시작 시각
op_end : 오프닝 종료 시각

명령어 리스트
prev : 10초 전
next : 10초 후

되감기 했을 때 현재위치가 0 미만이 된다? >> 0으로
빨리감기 했을 때 현재 위치가 총 길이 넘어간다? >> 총 길이로
오프닝 구간에 걸친다? >> 오프닝 구간 밖으로

*/

public class 동영상_재생기 {
	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		String answer = "";

		//  총 비디오 길이
		int total = toSecond(video_len);

		//  현재 위치 (분:초) 초로 변환
		int current = toSecond(pos);

		//  오프닝 시작 위치 (분:초) >> 초로 변환
		int start = toSecond(op_start);

		//  오프닝 종료 위치 (분:초) >> 초로 변환
		int end = toSecond(op_end);

		//  현재 위치가 오프닝 구간에 걸치는 경우
		if (current >= start && current <= end) {
			current = end;
		}

		//  명령어의 수 만큼 위치 이동
		for(String c : commands) {
			int tmp = current;

			switch(c) {
				case "prev" :
					//  현재 위치가 10 미만이면 0으로 이동
					tmp = Math.max(0, current - 10);
					break;

				case "next" :
					tmp = Math.min(total,current + 10);
					break;
			}

			//  이동 후 현재 위치가 오프닝 구간인 경우
			if(tmp >= start && tmp <= end) {
				tmp = end;
			}

			current = tmp;
		}

		//  변환작업 완료 후 초 > 분으로 다시 변환
		answer = toMinute(current);

		return answer;
	}

	public int toSecond(String time) {
		String[] times = time.split(":"); // 배열에 분 : 초로 분리해서 저장

		return Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]); // 분:초 >> 초로 변환
	}

	public String toMinute(int time) {
		int m = time / 60;
		int s = time % 60;

		return String.format("%02d:%02d",m,s);
	}
}
