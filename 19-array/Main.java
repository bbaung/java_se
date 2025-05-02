public class Main{

    public static void main(String[] args) {

        //create array

        String[] array_1 = new String[10];

        array_1[0] = "World";
        array_1[1] = "Hello";
        array_1[2] = "Java";
        array_1[3] = "Programming";
        array_1[4] = "Language";
        array_1[5] = "is";
        array_1[6] = "Fun";
        array_1[7] = "to";
        array_1[8] = "Learn";
        array_1[9] = "!";


        //Above was come from

        String[] array_2;           //declaration array
        array_2 = new String[5];    //allocate memory

        array_2[0] = "Hello";
        array_2[1] = "World";
        array_2[2] = "Nice";
        array_2[3] = "To";
        array_2[4] = "meet";


        //Initialize Arrays

        String[] array_3 = {"Helo","this","is","initialize","array"};
 
        //output array_1

        System.out.println("Array 1 : ");
        System.out.println(array_1);
        System.out.print(array_1[0]);
        System.out.print(" ");
        System.out.print(array_1[1]);
        System.out.print(" ");
        System.out.print(array_1[2]);

        //output array_2

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("array 2 : ");

        for (int i = 0; i < array_2.length; i++) {
            System.out.println(array_2[i]);
        }

        //output array_3

        for (String i : array_3) {
            System.out.println(i);
        }
    }
}