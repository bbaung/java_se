public class Main{

    public static void main(String[] args) {

    //java if-statement
    int number = 20;

    if (number > 0) {
        System.out.println("The number is greater than 0.");
    }

    String language = "Java";

    if (language == "Java") {
        System.out.println("Now using Java programming");
    }

    //java if-else statement

    int number_2 = 10;

    if (number_2 > 20) {
        System.out.println("The number_2 is greater than 20.");
    } else {
        System.out.println("The number_2 is not greater than 20.");
    }


    //  java if-else-if statement

    int number_3 = 100;

    if (number_3 < 20) {
        System.out.println("Fail the exam.");
    }
    else if ( number_3 >= 30 && number_3 < 40) {
        System.out.println("Pass the exam with D.");    
    }
    else if (number_3 >= 40 && number_3 < 60) {
        System.out.println("Pass the exam with C.");
        
    }
    else if (number_3 >= 60 && number_3 < 80) {
        System.out.println("Pass the exam with B.");
    }
    else if (number_3 >=80 && number_3 <= 100) {
        System.out.println("Pass the exam with A.");
    }
    else if (number_3 > 100) {
        System.out.println("OutStanding.");
    } else {
        System.out.println("Unexpeted case.");
    }

    }
}