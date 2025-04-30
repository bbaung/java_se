public class Main{

    public static void main(String [] args){
        System.out.println(">>Data Types");


        boolean flag = true;
        boolean flag_1;
        // defaut value false ; 
        // can have value true and false

        byte range = 124;
        // default value 0
        // values from -128 to 127

        short temperature = -200;
        //  default value 0
        //  values from -32768 and 32767

        int number = -4250000;
        //  default value 0
        //  values from -2^31 to 2^31 - 1

        long number_2 = -4233220;
        //  default value 0
        //  values form -2^63 to 2^63 - 1

        double number_3 = -43.3;
        //for decimal value store
        //should not use for values such as currency

        float number_4 = -42.3f;
        //for decimal value store
        //should use for values such as currency


        char character = '\u0051'
        // utf-character table link - https://www.utf8-chartable.de/unicode-utf8-table.pl?number=128
        //  default \u0000

        String myString = "Java Programming"
        //Java also provides support for character strings via java.lang.String class.

        System.out.println(number_4);
    }
}