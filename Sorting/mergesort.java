public class mergesort {
    public static void merge(int nums[], int start, int end, int mid) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= end) {
            temp[k++] = nums[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            nums[start + l] = temp[l];
        }
    }

    public static void merging(int nums[], int start, int end) {
        if (start < end) {  // Corrected base case
            int mid = start + (end - start) / 2;
            merging(nums, start, mid);
            merging(nums, mid + 1, end);
            merge(nums, start, end, mid);
        }
    }

    public static void main(String[] args) {
        int nums[] = {7, 5, 3, 1, 6, 4, 8, 9, 10};
        merging(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");  // Changed to print inline
        }
    }
}
