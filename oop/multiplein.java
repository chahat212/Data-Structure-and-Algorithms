package oop;

public class multiplein {
    public static void main(String[] args) {
        bear b1 = new bear();
        b1.veg();
        b1.non_veg();
    }
}
interface Herbivore  {
void veg();

}
interface Carnivore  {
void non_veg();

}
class bear implements Herbivore , Carnivore{
    public void veg()
     {
        System.out.println("bear eats veg");
    }
    public void non_veg()
    {
System.out.println("bear eats non-veg");
    }
} 
