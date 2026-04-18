package Recurssion;

public class last {
    public static int occurences(int arr[] , int key , int i){
         
        if(i==arr.length){ 
            return -1; //only checks for once in all indexies includeing base case if arr size is n then it checks for n+1



        }
        int isfound = occurences(arr, key, i+1);
        if(isfound == -1 && arr[i]==key){ //as there is no loops do checking time is contant o(1) then can be considered as C
            return i;

        }
        return isfound;


    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,2,3,5};
        System.out.println(occurences(arr, 5, 0));
        

        
    }
}
// t(n) = t(n+1) + c
// using subsitution method 
// tc - o(n)
// as it is using recurssion stack then o(n)
