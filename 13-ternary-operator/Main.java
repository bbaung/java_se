
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks : ");
        int marks = input.nextInt();

        input.close();

        //ternary operator is the short term of if-else

        String result = (marks >= 40) ? "pass" : "false";
        System.out.println("Your exam is "+ result);
    }
}