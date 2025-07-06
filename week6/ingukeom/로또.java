package week6.ingukeom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 로또 {
    public static void main(String[] args) {
        int[] win_nums = {0, 0, 0, 0, 0, 0};
        int[] lottos = {38, 19, 20, 40, 15, 25};

        System.out.println(Arrays.toString(getRanks(lottos, win_nums)));

    }
    public static int[] getRanks(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int matchCount = 0;
        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) winSet.add(num);

        for (int num : lottos) {
            if (num == 0) zeroCount++;
            else if (winSet.contains(num)) matchCount++;
        }

        int maxRank = getRank(matchCount + zeroCount);
        int minRank = getRank(matchCount);

        return new int[] {maxRank, minRank};
    }

    private static int getRank(int count) {
        return count >= 2 ? 7 - count : 6;
    }
}
