package week5.ingukeom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 포켓몬 {
    public static void main(String[] args) {
        int[] nums ={3,2,1,2};
        int answer = 0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int max = nums.length/2;
        answer = Math.min(map.size(),max);
    }
}
