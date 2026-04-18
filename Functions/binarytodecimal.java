public class binarytodecimal {
    public static void bintodec(int n){
        int dec = 0;
        int pow = 0;
        while(n>0){
            int ld = n%10;
            dec = dec+(ld * (int)Math.pow(2, pow));
            pow++;
            n=n/10;

            
        }
        System.out.println("the convertion from bin to dec is:"+dec);
    }
        public static void dectobin(int n){
        int bin = 0;
        int p = 0;
        int s=0;

        while(n>0){
           int rem = n%2;
           s = s+(rem*(int)Math.pow(10, p) );
           p++;
           n=n/2;


        }
        System.out.println("dec to bin is:"+s);
        


    }

    public static void main(String[] args) {
        dectobin(7);
        bintodec(101);
    }
}
 
    

