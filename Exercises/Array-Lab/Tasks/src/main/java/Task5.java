import java.util.*;

public class Task5 {
    public static void main (String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int countEven = 0, countOdd = 0;

        for(int i=0; i<n; i++){
            if((arr[i] % 2 )== 0)
                countEven += 1;

            else
                countOdd += 1;
        }
        System.out.println("Even Elements count : "+ countEven);
        System.out.println("Odd Elements count : "+ countOdd);
    }
}