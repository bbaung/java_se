public class MethodTest{

    public static void main(String[] args) {
        System.out.println("hello");

        OtherMethod.otherStaticHello();

        OtherMethod obj1 = new OtherMethod();
        obj1.otherInstanceHello();
    }
}