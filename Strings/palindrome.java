package Strings;

import java.util.Scanner;

public class palindrome {
    public static boolean palin(String str){
        for(int i=0;i<=str.length()/2;i++){
            int n = str.length();

            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;



            }



           
        }
        return true;
       



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();

       System.out.print(palin(str));
        
        
    }
    
}
