public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

    //run the program with: java Hello
    //run the program with: java Hello hi nice to meet you
    //run the program with: java Hello "hi nice to meet you"

        for (String s : args) {
            System.out.println(s);
        }

    }
}