import java.util.Random;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        java.util.Random random = new Random();
        System.out.println("Hello world!");
        int[] month = new int[30];
        int i;
        for (i = 0; i < month.length; i++)
        {month[i] = random.nextInt(100_000) + 100_000;}
        System.out.println(month[0] + " сумма в день");

        // Задача 1

        float sum = 0;
        for (i = 0; i < month.length; i++)
        {sum = sum + month[i];}
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2

        int minMonth = 200_000;
        for (final int current : month) {
            if (current < minMonth)
            {minMonth = current;}}
        {System.out.println("Минимальная сумма трат за день составила " + minMonth + " рублей");}

        int maxMonth = 100_000;
        for (final int current : month) {
            if (current > maxMonth)
            {maxMonth = current;}}
        {System.out.println("Максимальная сумма трат за день составила " + maxMonth + " рублей");}

        // Задача 3

        float sumAverage;
        sumAverage = sum / month.length;
        System.out.println("Средняя сумма трат за месяц составила " + sumAverage + " рублей");

        // Задача 4


    }}
