//Дано натуральное число.
// - определить его максимальную цифру.
// - определить его минимальную цифру.

import java.util.Scanner;

public class Cicles7_naturalnoe_chislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int naturalNumber = sc.nextInt();

        int min = 9;
        int max = 0;
        while (naturalNumber / 10 != 0) {
            int digit = naturalNumber % 10;
            naturalNumber = naturalNumber / 10;
            if (digit > max){
                max = digit;
            }
            if (digit < min){
                min = digit;

            }


        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

}
