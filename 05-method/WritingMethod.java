public class WritingMethod{

    public static void main(String[] args) {
        // System.out.println("Helo world");

        sayHello();
        showAddResult(4, 5);

        int x = add(9,7) * 100;
        System.out.println("Return value : " + x);

        WritingMethod obj1 = new WritingMethod();
        obj1.sayHelloInstance();
        obj1.showAddResultInstance(9,8);

        int y = obj1.addInstance(2,2) * 100;
        System.out.println("Return value : " + y + " , instance method");
    }


    //static method

    static void sayHello(){
        System.out.println("Hello");
    }

    static void showAddResult(int a , int b){
        int x = a + b;
        System.out.println("Add result : " + x);
    }

    static int add(int a, int b){
        return a + b;
    }

    //instance method / object method

    void sayHelloInstance(){
        System.out.println("Hello instance");
    }

    void showAddResultInstance(int a , int b){
        int x = a + b;
        System.out.println("Add result : " + x + " ,instance method");
    }

    int addInstance(int a, int b){
        return a + b;
    } 
}