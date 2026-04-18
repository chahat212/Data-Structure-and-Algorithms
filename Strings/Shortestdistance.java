package Strings;

// import java.security.PublicKey;

public class Shortestdistance {
    public static float distance(String path){
        int x=0;
        int y =0;
        for(int i=0;i<path.length();i++){
            char z = path.charAt(i);
            if(z == 'S'){
                y--;
            }
            else if(z == 'N'){
                y++;

            }
            else if( z == 'W'){
                x--;

            }
            else {
                x++;

            }
           

        }
         int X2 = x*x;
        int Y2 = y*y;

            return (float)Math.sqrt(X2 + Y2);



    } 
    public static void main(String[] args) {
        String path = "NS";
        System.out.print(distance(path));


    }
    
}
