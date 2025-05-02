public class MultiDimensionalArray{

    public static void main(String[] args) {
        System.out.println(">>Multi Dimensional Array");
        System.out.println(">>2d Array");

        int [] [] a = {
            {1,2,3},
            {4,5,6},
            {3}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }          
        }

        System.out.println(">>3d array");

        // create a 3d array
        int[][][] test = {
            {
              {1, -2, 3}, 
              {2, 3, 4}
            }, 
            { 
              {-4, -5, 6, 9}, 
              {1}, 
              {2, 3}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}