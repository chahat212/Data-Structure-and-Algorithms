package oop;

public class Multilevel {
    public static void main(String[] args) {
        Dog d1 = new Dog()  ;
        d1.eats();
        d1.names();
    }

}
class Animal{
    void eats(){
        System.out.println("animal eats");
    }
    void names(){
        System.out.println("name of animal");
    }
}
class Mammal extends Animal{

}
class Dog extends Animal{

}
