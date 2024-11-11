public class Task3 {
        public static void main(String[] args) {

            //numbers array
            int numbers[] = new int[]{10,15,3,66,4,9,1,100,2};

            //assign first element of an array to largest and smallest
            int smallest = numbers[0];
            int largetst = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largetst)
                    largetst = numbers[i];
                else if (numbers[i] < smallest)
                    smallest = numbers[i];
            }

            System.out.println("Largest Number is : " + largetst);
            System.out.println("Smallest Number is : " + smallest);
        }
    }
