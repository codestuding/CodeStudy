package week2.igeom.programmers;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

//        Set<Integer> lostSet = new HashSet<>();
//        Set<Integer> reserveSets = new HashSet<>();
//        int answer = 0;
//        for(int l : lost) {
//            lostSet.add(l);
//        }
        //중복체크 없이 했을때는 83점으로 오류가 나왔습니다.
//        for(int r : reserve) { //<- 여기서 add 하기 전에 remove를 해야됨, 즉 중복체크를 해야된다.
//            reserveSets.add(r);
//        }
//        for(int r : reserveSets){
//            if(lostSet.contains(r-1)){
//                lostSet.remove(r-1);
//            }else if(lostSet.contains(r+1)){
//                lostSet.remove(r+1);
//            }
//        }
//        answer = n-lostSet.size();
//        return answer;
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
