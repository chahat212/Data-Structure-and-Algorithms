public class Quiicksort {
     public static int partition(int[] nums, int low, int high) {
       
        int pivot = nums[high];
        int i = low - 1;  

        
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        
    
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        
        return i + 1; 
    }

    // Quick Sort function
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            // Find the pivot index
            int pivotIndex = partition(nums, low, high);
            
            // Recursively sort the left and right subarrays
            quickSort(nums, low, pivotIndex - 1);  // Sort left subarray
            quickSort(nums, pivotIndex + 1, high); // Sort right subarray
        }
    }

    // Main function to test the Quick Sort
    public static void main(String[] args) {
        int[] nums = {7, 5, 3, 1, 6, 4, 8, 9, 10};  // Example array
        
        quickSort(nums, 0, nums.length - 1);  // Sort the array
        
        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

    

