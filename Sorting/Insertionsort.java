public class Insertionsort {
    public static void insert(int arr[]){
        int n = arr.length;

        for(int i=1;i<n;i++) {
        int curr = arr[i];
        int prev = i-1;
        while(prev>=0 && arr[prev] > curr){
            arr[prev + 1] = arr[prev];
            prev--;
        }
        arr[prev+1] = curr;

        }
    }
    public static void printarr(int arr[]){
                int n = arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }
        
    public static void main(String[] args) {
        int arr[]  = {3,5,2,7,4};
        insert(arr);
        printarr(arr);


        
    }
    
}
