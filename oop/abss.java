package oop;
public class abss{
     public static void main(String[] args){
        horse h = new horse();
        h.walk();

     }

}
abstract class Animal(){
    abstract void walk();

}
class horse extends Animal{
    void walk(){
        System.out.println("he walks");
    }
}