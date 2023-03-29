import java.util.Scanner;

public class boxers {

    //Известен вес бексера-любителя, что вес таков , что боксер может быть отнесен к одной из трёх весовых категорий:
    // 1. легкий вес - до 60кг
    // 2. средний вес - до 75кг
    // 3. тяжёлый вес - до 91кг
    // 4. сепертяжёлый вес - свыше 91кг.
    // Определить в каой категироо будет выступать данный боксер.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        sc.close();

        if (weight >= 91) {
            System.out.println("Супертяжёлый вес.");
        }else if (weight >= 75) {
            System.out.println("Тяжелый вес.");
        }else if (weight >= 60) {
            System.out.println("Средний вес.");
        }else {
             System.out.println("Лёгкий вес");
                }
            }

        }




