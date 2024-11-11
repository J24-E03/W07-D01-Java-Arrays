import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
//        Ex1
        int[] array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;

//        Ex2
        Random random = new Random();
        int length = 5;
        for (int u = 0; u < randArr(length, random).length ; u++) {
            System.out.println(randArr(length, random)[u]);
        }

//       Ex3
            int[] array3 = {10,15,3,66,4,9,1,100,2};
            System.out.println(largest(array3));

//            Ex4
        int[] array4 = randArr(length, random);
        for (int e : array4){
            System.out.println(e);
        }
        System.out.println(sumArr(array4));

//        Ex5
        for (int x = 0; x < evenOdd(array4).length; x++){
            System.out.println(evenOdd(array4)[x]);
        }

//        Ex6
        int number = 3;
        System.out.println((number + " is at position " + position(array4, number)));
    }
    public static int[] randArr(int length, Random random){
        int[] array2 = new int[length];
        for (int i = length-1; i >= 0; i--) {
            array2[i] = random.nextInt(5);
        }
        return array2;
    }
    public static int largest(int[] array3){
        int big = array3[0];
        for (int o : array3) {
            if (big < o) {
                big = o;
            }
        }
        return big;
    }
    public static int sumArr(int[] array4){
        int sum = 0;
        for (int a : array4) {
            sum = sum + a;
        }
        return sum;
    }
    public static int[] evenOdd(int[] array4){
        int[] evensOdd = {0, 0};
        for (int z : array4) {
            if (z % 2 == 0){
                evensOdd[0]++;
            } else {
                evensOdd[1]++;
            }
        }
        return evensOdd;
    }
    public static int position(int[] array4, int y){
        int d = 0;
        for (int c = 0; c < array4.length; c++) {
            if (y == array4[c]) {
                d = c;
                break;
            }else {
              d = -1;
            }
        }
        return d;
    }
}
