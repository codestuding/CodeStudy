package week5.ingukeom;

import java.util.HashMap;

public class 완주 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();

        for(String name : participant) {
            map.put(name, map.getOrDefault(name,0)+1);
        }
        for(String name : completion) {
            map.put(name, map.get(name)-1);
        }
        for(String key : map.keySet()) {
            if(map.get(key)>0){
                answer = key;
                System.out.println(answer);
            }
        }
    }
}
