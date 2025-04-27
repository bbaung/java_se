public class People {

    public static void main(String[] args) {
        // System.out.println("Nice to meet you!");

        Student aung = new Student();
        aung.name = "Aung Aung";
        aung.age = 20;


        Student nwe = new Student();
        nwe.name = "Nwe Nwe";
        nwe.age = 22;

        nwe.greet();
        aung.greet();
    }
}

class Student{

    //declaration
    String name;
    int age;

    void greet(){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);

    }
}