package aniket;
import java.util.Arrays;

public class Longeststreak {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Arrays.sort(nums); // Sort the array

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak = currentStreak + 1;
            } else {
                currentStreak = 1;
            }

            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
            }
        }

        System.out.println("Length of longest consecutive sequence is: " + longestStreak);
    }
}
