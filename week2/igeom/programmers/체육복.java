package week2.igeom.programmers;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {

        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSets = new HashSet<>();
        int answer = 0;
        for (int l : lost) lostSet.add(l);
        for (int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r); // 자기가 입음
            } else {
                reserveSets.add(r); // 진짜 여벌 가진 사람만 남김
            }
        }
        for(int r : reserveSets){
            if(lostSet.contains(r-1)){
                lostSet.remove(r-1);
            }else if(lostSet.contains(r+1)){
                lostSet.remove(r+1);
            }
        }
        answer = n-lostSet.size();
        return answer;
    }
}

