package bitmanipulation;



public class swaptwonumber {
    public static void swap (int a , int b){
        System.out.println("before swap" + a +" "+b);
        a = a^b;
        b = a^b;
        a = a^b;

 System.out.println("after swap"+a+" "+b);
    
    }
   
    
    public static void main(String[] args) {
        swap(3, 4);
        
    }
    
}
