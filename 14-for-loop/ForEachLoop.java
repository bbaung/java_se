public class  ForEachLoop{

    public static void main(String[] args) {
        System.out.println(">>>for-each loop");

        String[] array = {"for","each","array","test"};

        for (String elem : array) {
            System.out.println(elem);
        }

        /*
         * >>> for-each loop
         * for (dataType item : array){
         *      ...
         * }
         */
    }


}