import java.util.Scanner;

public class Cicles_4_srednee_arifmeti4eskoe {
    // Даны натурально число n и вещественные числа a1, a2,...an
    // Определеить среднее арифметическое вещественных чисел.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n ");
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Введиет число ");
            double number = sc.nextDouble();
            sum += number;
        }
        System.out.println("Среднее арифметическое " + sum / n);

    }
}

