package oop;

public class classobj {
    public static void main(String[] args) {
        Pen p = new Pen(); //created a object for class pen named p
        p.setColor("blue");
        p.settip(5);
        System.out.println("colour is : " + p.color + " of tip size : " + p.tip );
        p.color = "Yellow";


    }

    
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;

    }
    void settip(int newtip){
        tip = newtip;

    }

}
class student{
    String name;
    int age;
    
   void calcpercentage(int maths,int phy,int che){
    float percentage;
    percentage = (maths+phy+che)/3;
    System.out.println("your % is" + percentage);
   }

}
