package Recurssion;

public class power {
    public static int xpowern(int a , int n){
        if(n == 0){
            return 1;
        }
        return a * xpowern(a, n-1);

    }
    public static void main(String[] args) {
        System.out.println(xpowern(2, 5));

    }
}
