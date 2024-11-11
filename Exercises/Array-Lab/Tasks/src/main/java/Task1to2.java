import java.util.Arrays;
import java.util.Random;

public class Task1to2 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        int[] newNumbersArray = {100, 200, 300, 400, 500};

        System.out.println(Arrays.toString(newNumbersArray));

        Arrays.sort(newNumbersArray);

        int[] arr2 = createRandom(10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        createRandom(5);
    }

    private static String findIndex(int[] myArray, int i) {
        return Arrays.toString(myArray);
    }

    public static int[] createRandom(int n) {
        Random rd = new Random();
        int[] array = new int[n];
        int min = 5;
        int max = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(max - min + 1) + min;
            System.out.print(array[i] + " ");
        }
        return array;
    }

}