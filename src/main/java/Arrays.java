import java.util.Random;
public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;

        for (int element : arr) {
            System.out.println(element);
        }
        int[] randomArray1 = randomArray(10);
        for (int num : randomArray1) {
            System.out.print(num + " ");

        }

        // Excercise-3
        int[] numbers = {10, 15, 3, 66, 4, 9, 1, 100, 2};


        int[] result = arrayLargeSmall(numbers);


        System.out.println("Largest number: " + result[0]);
        System.out.println("Smallest number: " + result[1]);

        // Exercise -4
        int[] randomArr = randomArray(10);
        for (int value : randomArr) {
            System.out.println(value + " ");
        }
        int sum = sumArr(randomArr);
        System.out.println("Sum of Array: " + sum);

        // Exercise-5
        int[] array5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result5 = countOddEven(array5);
        System.out.println("Odd numbers: " + result5[0]);
        System.out.println("Even numbers: " + result5[1]);

        //Exercise-6

        int[] array6 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 50;

        // Find the index of the target number
        int index = findIndex(target, array6);

        System.out.println("Index of " + target + ": " + index);

        //Bonus-6
        int[] array06 = {10, 20, 30, 40, 50, 60, 70, 50, 90};
        int target06 = 70;

        // Find the index of the target number
        int index6 = findIndex(target06, array06);

        System.out.println("Index of " + target06 + ": " + index6);
    }

        // Exercise 2
        public static int[] randomArray ( int length){
            Random random = new Random();
            int[] arr1 = new int[length];
            for (int i = 0; i < length; i++) {
                arr1[i] = random.nextInt(100);
            }
            return arr1;
        }

        //Excercise 3
        public static int[] arrayLargeSmall ( int[] arr2){
            int large = arr2[0];
            int small = arr2[0];

            for (int element : arr2) {
                if (element > large) {
                    large = element;
                }
                if (element < small) {
                    small = element;
                }
            }
            return new int[]{large, small};


        }

        // Exercise 4
        public static int sumArr ( int[] arr3){
            int sum = 0;
            for (int num : arr3) {
                sum += num;
            }
            return sum;
        }

        //Exercise-5
        public static int[] countOddEven ( int[] arr5){
            int odd = 0;
            int even = 0;
            for (int num : arr5) {
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

            }
            return new int[]{odd, even};


        }

        //Exercise 6
        public static int findIndex ( int target, int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i; // Return the index if the target is found
                }
            }
            return -1;

        }

    }















