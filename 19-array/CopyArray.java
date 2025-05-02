public class CopyArray {
    public static void main(String[] args) {
      
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays
      
        // change value of first array
        numbers[0] = -1;

        // printing the second array
        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
    }

    /* 
        Here, we can see that we have changed one value of the numbers array. When we print the positiveNumbers array, we can see that the same value is also changed.

        It's because both arrays refer to the same array object. This is because of the shallow copy. To learn more about shallow copy, visit shallow copy.

        Now, to make new array objects while copying the arrays, we need deep copy rather than a shallow copy.
    */
}