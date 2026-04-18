package arrays;

public class subarr {

    public static void sub(int numbers[])
    {
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;i<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.println(numbers[k]+" ");
                }
                System.out.println();

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        sub(numbers);
        

        

        
    }


    
}
