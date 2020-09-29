import java.util.Scanner;

public class SumDiagonal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[16];
        double sum = 0, average = 0;
        System.out.printf("Oppgi en 4x4 matrise rad for rad:\n");

        for (int i = 0; i < 16; i++) {
            numbers[i] = input.nextDouble();
            sum = (numbers[0] + numbers[5] + numbers[10] + numbers[15]);
            average = sum/4;
        }
        System.out.printf("Summen av tall i diagonalen er: %.2f", sum);
        System.out.printf("\nGjennomsnitt av tall i diagonalen er: %.2f", average);
    }

}




