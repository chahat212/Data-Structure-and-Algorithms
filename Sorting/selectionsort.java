public class selectionsort {
    public static void insert(int arr[]){
        int n = arr.length;
       
        for(int i=0;i<n-1;i++){
             int minpos = i;
             for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;

                }
               

             }
              int temp = arr[minpos];
                arr[minpos] = arr[i];
                arr[i] = temp;




        }

    }

    
     public static void printarr(int arr[]){
                int n = arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        
    }
    public static void main(String[] args) {
         int arr[] = {4,5,2,3,1};
         insert(arr);
         printarr(arr);
        
    }
}
