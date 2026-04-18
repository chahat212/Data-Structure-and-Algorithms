package bitmanipulation;

public class clearithbit {
    public static int ith (int n,int i,int j){
        int a = ((~0)<<j+1);
        int b = ((i<<1)-1);
        int bitmask = a|b;
        return (bitmask & n);


    }

    public static void main(String[] args) {
        System.out.println(ith(10, 2, 4));
        
    }
}
