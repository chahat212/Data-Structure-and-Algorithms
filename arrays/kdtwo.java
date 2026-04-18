public class kdtwo {
    public static void kd(int numbers[]){
       int cs = numbers[0];
        int ms = numbers[0];
        for(int i=1;i<numbers.length;i++){
            cs = Math.max(numbers[i], cs+numbers[i]);
            ms = Math.max(ms, cs);

        }
        System.out.println("max is"+ms);


    }
    public static void main(String[] args) {
        int numbers[] = {-1,-2,-3};
        kd(numbers);
        
    }
}
