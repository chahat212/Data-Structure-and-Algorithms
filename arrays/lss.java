package arrays;

public class lss {
    public static int large(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];


            }
        
        }
        return largest;

    }
    public static void main(String[] args) {
        int numbers[] = {2,3,5,6,7,8};
        
        System.out.println("largest is:"+large(numbers));
        
    }
    
}
