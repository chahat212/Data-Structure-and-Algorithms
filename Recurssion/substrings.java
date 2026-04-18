package Recurssion;

import java.util.Scanner;

public class substrings {
    public static int countmatchesstring(String s , char c , int j){
        if(j == s.length()){
            return 0;

        }
        if(s.charAt(j) == c){
            return 1+countmatchesstring(s, c, j+1);

        }
        return countmatchesstring(s, c, j+1);

    }
    public static int countsubstrings(String s , int i){
        if(i == s.length()){
            return 0;

        }
        char c = s.charAt(i);
        int k = countmatchesstring(s , c , i);
        int res = countsubstrings(s, i+1);
        return k+res;


    }
    public static int substring(String s){
        return countsubstrings(s , 0);

    }



    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string");
        String s = sc.nextLine();
        int result = substring(s);
        System.out.println(result);
        sc.close();





    }
    
}

