import java.util.Arrays;
import java.util.Random;

public class Tasks {
    public static void main(String[] args) {
        // Exercise 1
        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }

        // Exercise 2
        System.out.println("Exercise 2\nArray of 5 random numbers: " + Arrays.toString(generateRandom(5)));
        System.out.println("Array of 10 random numbers: " + Arrays.toString(generateRandom(10)));

        // Exercise 3
        System.out.println("\nExercise 3\nThe largest number is: " + findNumber(new int[]{10, 15, 3, 66, 4, 9, 1, 100, 2}, true));
        System.out.println("The smallest number is: " + findNumber(new int[]{10, 15, 3, 66, 4, 9, 1, 100, 2}, false));

        // Exercise 4
        System.out.println("\nExercise 4:\nThe sum of 5 random integers: " + sumArr(generateRandom(5)));
        System.out.println("The sum of 10 random integers: " + sumArr(generateRandom(10)));

        // Exercise 5
        System.out.println("\nExercise 5\nThe count of odd and even numbers in the array: " + Arrays.toString(countNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));

        // Exercise 6
        int[] randomNumbers = generateRandom(10);
        System.out.println("\nExercise 6\n" + Arrays.toString(randomNumbers));
        System.out.println("The index of the searched number is: " + findIndex(1, randomNumbers));

        // Bonus Exercise 1
        System.out.println("\nBonus Exercise\n" + Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5})));
    }

    private static int[] generateRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(length);
        }
        return array;
    }

    private static int findNumber(int[] array, boolean largest) {
        int numberToReturn = array[0];

        for (int a : array) {
            if (largest) {
                if (numberToReturn < a) {
                    numberToReturn = a;
                }
            } else {
                if (numberToReturn > a) {
                    numberToReturn = a;
                }
            }
        }
        return numberToReturn;
    }

    private static int sumArr(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        return sum;
    }

    private static int[] countNumbers(int[] array) {
        int even = 0, odd = 0;

        for (int a : array) {
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return new int[]{odd, even};
    }

    private static int findIndex(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int[] rotate(int[] array) {
        int lastNumber = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            int temporary = array[i - 1];
            array[i] = array[i - 1];
            array[i] = temporary;
        }
        array[0] = lastNumber;
        return array;
    }
}