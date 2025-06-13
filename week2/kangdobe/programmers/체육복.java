class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
    	int[] students = new int[n + 2]; // [0, 1, 2, ..., n, n+1] 인덱스 확보

        // 기본 상태 0 → 도난 -1
        for (int i : lost) {
        	//System.out.println("lost students = " + students[i]);
        	students[i]--;
            
        }

        // 여벌 +1 (도난 + 여벌이면 0이 됨)
        for (int o : reserve) {
        	//System.out.println("reserve students = " + students[o]);
            students[o]++;
        }

        System.out.println(students);
        
        // 앞뒤로 빌려줄 수 있으면 처리
        for (int i = 1; i <= n; i++) {
        	
            if (students[i] == -1) {
            	
                if (students[i - 1] == 1) {
                    students[i]++;		// 도난인 사람 체크
                    students[i - 1]--;
                    
                } else if (students[i + 1] == 1) {
                    students[i]++;
                    students[i + 1]--;
                    
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (students[i] >= 0) answer++;
        }

        return answer;
    }
}