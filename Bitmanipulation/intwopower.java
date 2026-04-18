package bitmanipulation;

public class intwopower {
    public static boolean two(int n){
       return (n & (n-1)) == 0;
       

    }
    
    public static void main(String[] args) {
        System.out.println(two(8));
        
    }
    
}
