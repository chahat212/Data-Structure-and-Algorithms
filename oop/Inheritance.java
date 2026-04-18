package oop;

public class Inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eats();
        shark.names();

    }
}
class Animal {
    String eat;
    String name;
    void eats(){
        System.out.println("animal eats");
    }
    void names(){
        System.out.println("name of animal");
    }

}
class fish extends Animal{
    void fins(){
        System.out.println("have fins");
    }
}
