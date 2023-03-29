import java.util.Scanner;

public class Task_krug_kvadrat {
    //Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double radius_kruga, storona_rvadrata;
        System.out.println("Введите радиус круга:");
        radius_kruga = num.nextDouble();
        System.out.println("Введите длинну стороны квадрата:");
        storona_rvadrata = num.nextDouble();

        double s_kvadrata = storona_rvadrata * 2;
        double s_kruga = Math.PI * (radius_kruga * radius_kruga);

        if (s_kvadrata > s_kruga) {
            System.out.println("Площадь образовавшегося квадрата получилась больше.");
        } else
            System.out.println("Площадь получившегося круга оказалась больше.");

    }
}
