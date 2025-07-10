public class p35 {
    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        searchInsert(a,7);
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
