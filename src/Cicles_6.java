import java.util.Scanner;

public class Cicles_6 {
//    Дана не пустая последовательность целых числе, оканчивающаяся нулём. Найти:
//     - сумму всех чисел последовательности;
//     - количество всех чисел последовательности.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько чисел, при вводе 0 ввод будет окончен.");


        int number = 0;
        int sum = 0;
        int count = 0;
        do {
            number = sc.nextInt();
            sum += number;
            count++;
        } while (number != 0);

        System.out.println("Сумма всех чисел = " + sum);
        System.out.println("Количество всех чисел = " + count);
    }

}
