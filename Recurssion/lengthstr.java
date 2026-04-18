package Recurssion;

public class lengthstr {
    public static int cnt(String str , int i){ //, int count)
        if(i == str.length()){
            //System.out.print(count);
            return 0;
        }
     
   

       //cnt(str, i+1,count+1)
         return 1 + cnt(str , i+1);




    }
    public static void main(String[] args) {
        String str = "Chahat";
        System.out.println(cnt(str, 0));

        
    }
    
}
