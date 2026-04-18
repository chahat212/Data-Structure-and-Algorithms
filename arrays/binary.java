package arrays;

public class binary {
    public static int BS(int numbers[], int key){
        int start = 0;
         int end = numbers.length-1;
         
         while(start<=end){ 
            int mid = (start+end)/2;
            if(key == numbers[mid]){
                return mid;
            
            }
            if(key>numbers[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

            
         }
         return -1;

    }

    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7,8};
        int key = 5;
        System.out.println("key found at index  "+ BS(numbers, key));

        
    }
    
}
