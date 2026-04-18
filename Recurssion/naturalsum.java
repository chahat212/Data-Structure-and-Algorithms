package Recurssion;

public class naturalsum {

    public static int sum(int n){
        if(n==1){
            return 1;

        }
        int nm = sum(n-1);

       
        return n + nm;


    }

    
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));

        
    }
}
    

