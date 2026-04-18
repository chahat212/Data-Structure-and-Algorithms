package arrays;

public class linear {
    public static int linearsearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++){
            if(i==key){
                return i;

            }

        }
        return -1;



    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7};

        int key = 5;
        int index = linearsearch(numbers, key);
        
            System.out.println("found key as " + index);
        
        System.out.println();




    }
    
}
