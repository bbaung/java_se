
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.print("Hello, What's your name : ");

        Scanner input = new Scanner(System.in);
        String textInput = input.nextLine();

        System.out.println("Nice to meet you "+ textInput);

    }
}