package Recurssion;

public class first {
    public static int occurence(int arr[],int key, int i){
        if(i == arr.length){
            return -1;

        }
        if(arr[i] == key){
            return i;
        }

        return occurence(arr, key, i+1);

       

    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,6,4,3,7,9,2,5};

        System.out.println(occurence(arr, 2, 0));

    }
}
