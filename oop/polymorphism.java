package oop;

public class polymorphism {
    public static void main(String[] args) {
       Overload o = new Overload();
      System.out.println( o.sum(2, 4));
      System.out.println(o.sum(1, 4, 0));
      System.out.println(o.sum(2, 3, 4, 6));
    }
 
}
// method overloading
class Overload{
   int sum(int a , int b){
    return a+b;
   }

   int sum(int a , int b,int c)
   {
    return a+b+c;
   }
   int sum(int a , int b,int c,int d)
   {
    return a+b+c+d;
   }





}
