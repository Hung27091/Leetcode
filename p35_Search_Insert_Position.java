public class p35 {
    public  int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
