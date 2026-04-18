package Patterns;

import java.util.Scanner;

public class hollowsquare {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows");
        int n = sc.nextInt();
         System.out.println("enter number of colns");
        int m = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.println("*");

                }
                else{
                    System.out.println(" ");
                }
            }
            System.out.println();

        }
        sc.close();

        
        
    }

    
}
