

public class Main{


    public static void main(String[] args) {
        System.out.println("Hello");

        //declare variables

        int start = 1 , end = 5;

        while (start <= end) { 
            System.out.println(start);
            start++;
        }

        int s = 3 , e = 5;
        do { 
            System.out.println("This is do while loop");
            s--;
        } while (s >= e);
    }
}