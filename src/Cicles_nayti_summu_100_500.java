import java.util.Scanner;

public class Cicles_nayti_summu_100_500 {
//    Найти:
//    Сумму всех целых числе от 100 до 500;


    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 500; i++)
        {
           sum += i; //sum = sum + i
        }
        System.out.println(sum);

//    Сумму всех целых числе от а до b (значения a и b вводчтся с клавиатурыж b >= a)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа a, b, где b >=a");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b >= a)
        {
            int sum1 = 0;
            for (int i = a; i < b; i++)
            sum1 += i;
            {
                System.out.println(sum1);
            }
        } else
        {
            System.out.println("b < a, введите другие числа.");
        }

    }

}
