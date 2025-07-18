public class p4_Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums2.length + nums1.length];
        boolean b = false;
        for (int i = 0, j = 0; i < arr.length; ) {
            if (b) {
                arr[i] = nums2[j - nums1.length];
                j++;
                i++;
            } else {
                if (j == nums1.length) {
                    b = true;
                    continue;
                }
                arr[i] = nums1[j];
                j++;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;

        }


    }
}
