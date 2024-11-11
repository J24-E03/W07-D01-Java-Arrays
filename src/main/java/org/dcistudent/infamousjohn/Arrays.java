package org.dcistudent.infamousjohn;

import java.util.Random;

public class Arrays {
    private static final String PRINTF_STRINGS_2 = "%s%n%s%n%n";
    private static final String PRINTF_STRINGS_3 = "%s%n%s%n%s%n%n";

    private final Random random = new Random();

    public static void main(String[] args) {
        new Arrays();
    }

    public Arrays() {
        // Exercise 1: Create and Initialize an Array
        int[] simpleArray = new int[5];
        simpleArray[0] = 1;
        simpleArray[1] = 2;
        simpleArray[2] = 3;
        simpleArray[3] = 4;
        simpleArray[4] = 5;
        System.out.printf(PRINTF_STRINGS_2,
            "Exercise 1:",
            java.util.Arrays.toString(simpleArray)
        );

        // Exercise 2: Create a Randomized Array
        System.out.printf(PRINTF_STRINGS_2,
            "Exercise 2:",
            java.util.Arrays.toString(this.createRandomArray(5))
        );

        // Exercise 3: Find Largest and Smallest Numbers in an Array
        simpleArray = new int[] {10, 15, 3, 66, 4, 9, 1, 100, 2};
        System.out.printf(PRINTF_STRINGS_2,
            "Exercise 3:",
            java.util.Arrays.toString(this.findLargestNumber(simpleArray))
        );

        // Exercise 4: Sum of Array Elements
        simpleArray = this.createRandomArray(10);
        System.out.printf(PRINTF_STRINGS_3,
            "Exercise 4:",
            java.util.Arrays.toString(simpleArray),
            this.sumArrayElements(simpleArray)
        );

        // Exercise 5: Count Odd and Even Numbers in an Array
        simpleArray = this.createRandomArray(10);
        System.out.printf(PRINTF_STRINGS_3,
            "Exercise 5:",
            java.util.Arrays.toString(simpleArray),
            java.util.Arrays.toString(this.countOddEvenNumbers(simpleArray))
        );

        // Exercise 6: Find Index of a Number in an Array
        simpleArray = this.createRandomArray(10);
        System.out.printf(PRINTF_STRINGS_3,
            "Exercise 6:",
            java.util.Arrays.toString(simpleArray),
            this.findNumberIndex(simpleArray, simpleArray[5])
        );

        // Exercise 7 - Bonus: Rotate Array Elements
        simpleArray = this.createRandomArray(10);
        System.out.printf(PRINTF_STRINGS_3,
            "Exercise 7:",
            java.util.Arrays.toString(simpleArray),
            java.util.Arrays.toString(this.rotateArrayElements(simpleArray))
        );

        // Exercise 8 - Bonus: Binary Search
        byte[] byteArray = {9, 55, 13, 89, 42, 103, 1, 77, 2};
        byte byteKey = 42;
        java.util.Arrays.sort(simpleArray);
        System.out.printf(PRINTF_STRINGS_3,
            "Exercise 8:",
            java.util.Arrays.toString(simpleArray),
            java.util.Arrays.binarySearch(byteArray, byteKey)
        );
    }

    /**
     * Create a random array of integers.
     *
     * @param size the size of the array
     * @return int[]
     */
    public int[] createRandomArray(int size) {
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) {
            randomArray[i] = this.random.nextInt(1000);
        }

        return randomArray;
    }

    /**
     * Find the largest and smallest numbers in an array.
     *
     * @param array the array of integers
     * @return int[]
     */
    public int[] findLargestNumber(int[] array) {
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }

            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return new int[]{smallest, largest};
    }

    /**
     * Sum the elements of an array.
     *
     * @param array the array of integers
     * @return int
     */
    public int sumArrayElements(int[] array) {
        int sum = 0;

        for (int j : array) {
            sum += j;
        }

        return sum;
    }

    /**
     * Count the number of odd and even numbers in an array.
     *
     * @param array the array of integers
     * @return int[]
     */
    public int[] countOddEvenNumbers(int[] array) {
        int odd = 0;
        int even = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                even++;
                continue;
            }

            odd++;
        }

        return new int[]{odd, even};
    }

    /**
     * Find the index of a number in an array.
     *
     * @param array the array of integers
     * @param number the number to find
     * @return int
     */
    public int findNumberIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Rotate the elements of an array.
     *
     * @param array the array of integers
     * @return int[]
     */
    public int[] rotateArrayElements(int[] array) {
        int[] rotatedArray = new int[array.length];
        int index = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            rotatedArray[i] = array[index];
            index--;
        }

        return rotatedArray;
    }
}