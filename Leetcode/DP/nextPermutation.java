import java.util.*;

public class nextPermutation {
    public static void permutation(int[] nums) {
        int n = nums.length;
        if (n < 2) return;
        boolean checkpoint = false;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                checkpoint = true;
                int traverse = nums[i], compare = nums[i - 1], recordIdx = i;
                for (int j = i; j < n; j++) {
                    if (nums[j] > compare && nums[j] <= traverse) {
                        traverse = nums[j];
                        recordIdx = j;
                    }
                }
                int cur = nums[i - 1];
                nums[i - 1] = nums[recordIdx];
                nums[recordIdx] = cur;
                reverseArray (nums, i, n - 1);
            }
            if (checkpoint) return;
        }
        Arrays.sort(nums);
    }

    public static void reverseArray (int[] nums, int startIdx, int endIdx) {
        while (startIdx <= endIdx) {
            int cur = nums[startIdx];
            nums[startIdx] = nums[endIdx];
            nums[endIdx] = cur;
            startIdx ++;
            endIdx --;
        }
    }
}