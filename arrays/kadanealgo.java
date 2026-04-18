public class kadanealgo {
    public static void kades(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i =0;i<numbers.length;i++){
            cs = numbers[i]+cs;
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);



        }

System.out.println("max sub array sum is:"+ ms);

    }

    public static void main(String[] args) {
        int numbers[]= {-2,-3,-1};
        kades(numbers);

        
    }
    
}
