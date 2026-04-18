package bitmanipulation;

public class getith {
     public static int get(int n , int i){
            int bitmask = 1<<i;
            if((bitmask & n) == 0){
                return 0;


            }
            else{
                return 1;

            }

        }
    public static void main(String[] args) {
       System.out.println (get(1, 2));
       
        
    }


    
}
