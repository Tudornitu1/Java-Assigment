import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
            sum += numbers[i];
        }
        System.out.println("====================================");
        System.out.println("The random generated numbers are: ");
        System.out.println("====================================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("====================================");
        double average = (double) sum / numbers.length;

        int countAboveAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                countAboveAverage++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("");
        System.out.println("There are " + countAboveAverage+" numbers above average");
        System.out.println("====================================");
    }
}
