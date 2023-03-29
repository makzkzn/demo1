import java.util.Scanner;

public class task_chisla {

   // Дано трехзначное число. Найти:
   // - число единиц в нём.
   // - число десятков в нём.
   // - сумму его цифр.
   // - произведение его цифр.
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите трёхзначное число");
       int number = sc.nextInt();


       //123 % 10 = 3
       int units = number % 10;
       //double a = 123 / 12 = 12.3
       //int a = 123 / 10 =12
       int decimals = (number / 10) % 10;
       int hundrers = (number / 10) / 10;

       System.out.println("Сумма цифр = " + (units + decimals + hundrers));
       System.out.println("Произведение цифр = " + (units * decimals * hundrers));

   }
}

