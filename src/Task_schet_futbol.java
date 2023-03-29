import java.util.Scanner;
//В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0,за ничью — 1.
// Известно количество очков, полученных командой за игру.
// Определить словесный результат игры (выигрыш, проигрыш или ничья).

public class Task_schet_futbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько получила очков команда - 0, 1 или 3?");
        int number = sc.nextInt();
        sc.close();

        if (number == 0) {
            System.out.println("К сожалению команда проиграла...");
        } else if (number == 1) {
            System.out.println("Игра завершилась в ничью.");
        } else if (number == 3) {
            System.out.println("Поздравляем с победой!");
        } else if (number > 3) {
            System.out.println("Где то закралась ошибка...Запустите программу заново и повторите ввод.");

        }
    }
}
