import java.util.*;



public class Quicking {
    public static void printarr(int [] arr){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void quick(int arr[],int si , int ei ){
        if(si>=ei){
            return ;

        }
        int parti = partition(arr,si,ei );
        quick(arr,si,parti-1);
        quick(arr,parti+1,ei);

    }
    public static int partition(int[]arr, int si , int ei){
        int pivot = arr[ei];

      

        int i = si-1;
        for(int j=si;j<ei;j++){
            if(arr[j] <=  pivot){
                i++;

                int temp = arr[j];
                arr[j] =  arr[i];
                arr[i] = temp;

            }
        }
        i++;

        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("your sorted array is:");
        quick(arr, 0, arr.length-1);
        printarr(arr);


        sc.close();

    }
}
