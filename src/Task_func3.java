public class Task_func3 {

    //  Напечатать числа в виде следующей таблицы
    // 5
    // 5 5
    // 5 5 5
    // 5 5 5 5
    // 5 5 5 5 5

    public static void main(String[] args) {
        printToPyramid(5,1);
        System.out.println();
        printToPyramid(5,2);
        System.out.println();
        printToPyramid(5,3);
        System.out.println();
        printToPyramid(5,4);
        System.out.println();
        printToPyramid(5,5);
        System.out.println();

    }
    public static void printToPyramid(int number, int count) {
        if (count > 0) {
            count--;
            System.out.print(number + " ");
            printToPyramid(number, count);

        }


    }

}
