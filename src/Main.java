import java.util.Random;
import java.util.stream.IntStream;
import java.util.Arrays;
public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;}
        return arr;
    }
       public static void main(String[] args) {

        int[] month = new int[30];
        int day1 = month[0];
        int arr[] = {3, 5, 7, 12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];}
        System.out.println(sum);



    // generate 100 random number between 0 and 100
    int[]  randomIntsArray = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
    //generate 100 random number between 100 to 200
    int[]  randomIntsArray2 = IntStream.generate(() -> new Random().nextInt(100) + 100).limit(100).toArray();
    }}
