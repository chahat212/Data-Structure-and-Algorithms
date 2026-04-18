package bitmanipulation;

public class clearlastbit {
    public static int last(int n,int i){
        int bitmask =  (~0)<<i;
        return (bitmask & n);

    }
    public static void main(String[] args) {
        System.out.println(last(10, 2));
        
    }
    
}
