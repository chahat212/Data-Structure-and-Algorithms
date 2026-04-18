package oop;

public class copycons {
    public static void main(String[] args) {
        
    
    Student s1 = new Student();
    s1.name = "Chahat";
    s1.age = 10;
    s1.marks[0] = 100;
    s1.marks[90] = 100;
    s1.marks[90] = 100;
    Student s2 = new Student(s1);
    // System.out.println(s2.marks);
    // s1.marks[2] =  80;
    // System.out.println(s2.marks[2]);
    // this is because of shallow copy that any changes in s1 refelects in s2

    System.out.println(s2.name + "and" + s2.age);
    for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }


    }
}
class Student{
    String name;
    int age;

    int marks[];
    Student(){
        System.out.println("Default constructor");
    }
    Student(String name){
        this.name = name;

    }
     Student(int age){
        this.age = age;
        
    }
    //CLASS CODE OF SHALLOW COPY
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     marks = new int[3];
    //     this.marks = s1.marks;


    // }
    // CLASS CODE OF DEEP COPY
    Student (Student s1){
         this.name = s1.name;
     this.age = s1.age;
     for(int i=0;i<marks.length;i++){
    this.marks[i] = s1.marks[i];

     }
    }


}
