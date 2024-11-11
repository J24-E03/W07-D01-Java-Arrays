import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        int[] fixedArray = {30, 31, 32, 33, 34};

        //Exercise 2
        System.out.println("\n********* Exercise 2 **********");
        System.out.println("Give a number as the length of a random array of numbers: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("My random array of numbers: " + Arrays.toString(createRandomArray(Integer.parseInt(sc.nextLine()))));

        //Exercise 3
        System.out.println("\n********* Exercise 3 **********");
        int[] testArray = {10,15,3,66,4,9,1,100,2};
        int[] minMaxValues = findLargestAndSmallest(testArray);
        System.out.println("The largest number in " + Arrays.toString(testArray) + " is: " + minMaxValues[0] + " and mallest one is: " + minMaxValues[1]);

        //Exercise 4
        System.out.println("\n********* Exercise 4 **********");
        Random random = new Random();
        int[] randomArrayForSum = createRandomArray(random.nextInt(10) + 1);
        System.out.println("Some of the element of " + Arrays.toString(randomArrayForSum) + " is: " + sumArr(randomArrayForSum));

        //Exercise 5
        System.out.println("\n********* Exercise 5 **********");
        int[] randomArrayForCount = createRandomArray(7);
        int[] oddEvenCounts = countOfOddAndEvens(randomArrayForCount);
        System.out.println("In " + Arrays.toString(randomArrayForCount) + " count of odd numbers: " + oddEvenCounts[0] + " and count of even numbers: " + oddEvenCounts[1]);

        //Exercise 6
        System.out.println("\n********* Exercise 6 **********");
        int[] randomArrayForSearch = createRandomArray(random.nextInt(10) + 1);
        System.out.println("Enter an element form " +  Arrays.toString(randomArrayForSearch) + " to return its index: ");
        int foundIndex = findIndex(sc.nextInt(), randomArrayForSearch);
        System.out.println(foundIndex == -1 ? "The number doesn't exist in the array!" : "The first appearance index of the number is :" + foundIndex);

        //Bonus Exercise 1
        System.out.println("\n********* Bonus Exercise 1 **********");
        int[] randomArrayToRotate = createRandomArray(random.nextInt(10) + 1);
        System.out.println("Original Array: " + Arrays.toString(randomArrayToRotate));
        rotateArray(randomArrayToRotate);
        System.out.println("Rotated Array: " + Arrays.toString(randomArrayToRotate));

        //Bonus Exercise 2
        System.out.println("\n********* Bonus Exercise 2 **********");
        int[] sortedArray = {3, 8, 15, 21, 34, 42, 56, 73};
        int target = 21;
        foundIndex = findIndexBinarySearch(target, sortedArray);
        System.out.println("In " + Arrays.toString(sortedArray));
        System.out.println(foundIndex == -1 ? "The number doesn't exist in the array!" : "The first appearance index of the number " + target + " is :" + foundIndex);

        sc.close();

    }

    public static int[] createRandomArray(int length) {
        int[] randomArray = new int[length];
        Random random = new Random();
        for (int index = 0; index < length; index++) {
            randomArray[index] = random.nextInt(100);
        }
        return randomArray;
    }

    public static int[] findLargestAndSmallest(int[] numbers) {
        int maxVal = numbers[0];
        int minVal = numbers[0];
        for (int num : numbers){
            if (num < minVal) {
                minVal = num;
            }
            else if (num > maxVal){
                maxVal = num;
            }
        }
        return (new int[]{maxVal, minVal});
    }

    public static int sumArr(int[] numbers){
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        return sum;
    }

    public static int[] countOfOddAndEvens(int[] numbers) {
        int oddNumberCount = 0;
        int evenNumberCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumberCount++;
            }
            else {
                oddNumberCount++;
            }
        }
        return (new int[]{oddNumberCount, evenNumberCount});
    }

    public static int findIndex(int number, int[] numbers) {
        for (int index = 0; index < numbers.length; index ++) {
            if (number == numbers[index]) {
                return index;
            }
        }
        return -1;
    }

    public static void rotateArray(int[] numbers) {
        int lastElement = numbers[numbers.length - 1];
        for (int index = numbers.length - 1; index >= 1; index--) {
            numbers[index] = numbers[index-1];
        }
        numbers[0] = lastElement;
    }

    public static int findIndexBinarySearch(int target, int[] sortedNumbers) {
        return Arrays.binarySearch(sortedNumbers, target);
    }
}
