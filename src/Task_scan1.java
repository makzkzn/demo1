import java.util.Scanner;

public class Task_scan1 {

    //Найти длину окружности радиуса 4. L = 2Pi*r
    public static void main(String[] args) {
        //short r = 4;

        System.out.println("Введите радиус");
        Scanner sc = new Scanner(System.in);
        short r = sc.nextShort();
        double l = 2 * r * Math.PI;

        System.out.println("Длина окружности = " + l);


    }
}
