import java.util.Scanner;
//
//Дано двузначное число. Определить: остаток от деления десятков на единицы,результат деления единиц на десятки
public class Tas_des_edinic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двухзначное число");
        int number = sc.nextInt();//тут были сложности, когда я указывал вместо int - double. И итоговое деление было корявым. Почему так получалось ?
        sc.close();

        int units = number % 10; //единицы
        int decimals = (number / 10); //десятки

        System.out.println("Остаток от деления десятков на единицы: " + decimals % units);
        System.out.println("Результат деления единиц на десятки: " + (double) units / decimals);
        // System.out.println("Результат деления единиц на десятки: " + units / decimals);





    }
}
