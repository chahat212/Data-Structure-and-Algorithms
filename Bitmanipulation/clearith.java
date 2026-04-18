package bitmanipulation;

public class clearith {
    public static int clear(int n,int i){
        int bitmask = 1<<i;
        int not = ~(bitmask);
        return not & n;

    }
    public static int update(int n , int i , int newbit){
        clear(n, i);
        int m = newbit<<i;
        return m | n;



    }
    public static void main(String[] args) {
        System.out.println(clear(10, 1));
        System.out.println(update(10, 2, 1));
        
    }
    
}
