package oop;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Chahat");
        System.out.println(s1.name);
        
    }

    
}
class Student{
String name ;
int age;
Student(String name){
    System.out.println("constructor is called");
    this.name = name;
    System.out.println(name);

}
}
