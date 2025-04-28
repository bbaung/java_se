public class LocalVariableTest{

    
    static String message = "Global variable message";

    public static void main(String[] args) {
        System.out.println(message);

        doSomething();

        doSomethingGlobal();

        LocalVariableTest obj1 = new LocalVariableTest(); //instance variable / object variable can only be accessed through an object
        obj1.hello();
        obj1.helloGlobal();
    }

    public static void doSomething(){
        String message = "Do Something"; //variable hiding

        System.out.println(message);
    }

    public static void doSomethingGlobal(){
        String message = "Local variable";

        System.out.println(LocalVariableTest.message);
    }

    public void hello(){
        String message = "hello";   //overwrite

        message = "hello2 , hi";

        System.out.println(message);
    }

    public void helloGlobal(){
        String message = "Local variable hello";

        System.out.println(this.message); //most prefer

        System.out.println(LocalVariableTest.message);
    }
}

