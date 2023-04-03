package Massives;

// Заполнить массив из десяти элементов значениями, вводимыми с клавиатыр в ходе выполнения программы.
// Дан массив. Составить программу:
// 1 - рассчёта квадратного корня из любого элемента массива.
// 2 - рассчёта среднего арифметического двух любых элементов массива.

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.deepToString;

public class Task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Введиет 10 чисел - ");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("Введите номер элемента массива для писка квдратного корня.");
        System.out.println("Квадратный корень = " + sqrt(array[sc.nextInt()]));

        System.out.println("Введите два номера элементов массива для поиска средн.арифметического");
        System.out.println("Сред.арифметическое = " + avg(array[sc.nextInt()], array[sc.nextInt()]));
        System.out.println(deepToString(array));


    }

    public static double sqrt(int element) {
        return Math.sqrt(element);

    }

    public static double avg(int element1, int element2) {
        return (element1 + element2) / 2.0;

    }
}


