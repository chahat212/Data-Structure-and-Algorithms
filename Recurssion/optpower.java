package Recurssion;

public class optpower {
    public static int oppower(int a , int n){
        if(n==0){
            return 1;
            
        }
        int halfpower = oppower(a, n/2);
        int halfpowersq = halfpower*halfpower;
        if(n %2 != 0){
            halfpowersq = a * halfpowersq;

        }
        return halfpowersq;

    }
    public static void main(String[] args) {
        System.out.println(oppower(2, 5));
    }
}
