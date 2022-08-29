import java.util.Random;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        java.util.Random random = new Random();
        System.out.println("Hello world!");
        int[] month = new int[30];
        int i;
        for (i= 0; i < month.length; i++) {
            month[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println(month[0] + " сумма в день");
    }}
