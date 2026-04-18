package Recurssion;



public class numbertostring {
    public static void str(String [] st , int number ){
        if(number == 0){
            return;

        }
        int num = number%10;
        
        str(st, number/10); // decrease the number everytime
        System.out.print(st[num] +" ");



    }

    public static void main(String[] args) {
        int number = 1978;
        String [] st = {"zero","one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine "};
        str(st, number);

        
    }
}
