package bitmanipulation;

public class oddeven {
    public static void odev(int n){
        int bitmask = 1;
        if((bitmask & n)== 0){
            System.out.println("even");

        }
        else{
            System.out.println(
                "odd"
            );
        }
    }
    public static void main(String[] args) {
        odev(3);
        odev(4);
        odev(0);

        
    }
    
}
