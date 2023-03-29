import java.util.Scanner;

public class task1 {

//1 Дано натуральное число. Определить:
    //1. Является ли оно чётным.
    //2. Оканчивается лионо цифрой 7 ?

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0) {
            System.out.println("Число чётное.");
            }else{
            System.out.println("Число нечётное.");

        }

        if (number % 10 == 7) {
            System.out.println("Число оканчивается на 7");
        }





    }
}
