import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class task2 {

    // Составить программу, которая уменьшает первое введенное число в два раза, если оно болшьше второго введенного числа по абсолютное величине.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();

        if (a > Math.abs(b)){
            a = a / 2;
        }

        System.out.println("а = " + a);

    }
}
