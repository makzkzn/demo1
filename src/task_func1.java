public class task_func1 {

    //Напечатать числа в виде следующей таблицы:
    //5 5 5 5 5 5
    //5 5 5 5 5 5
    //5 5 5 5 5 5
    //5 5 5 5 5 5
    public static void main(String[] args) {
        printNumberToLine(2);
        printNumberToLine(3);
        printNumberToLine(4);
        printNumberToLine(5);
        printNumberToLine(6);

    }

    public static void printNumberToLine(int a) {
        System.out.printf("%d %d %d %d %d %d\n", a, a, a, a, a, a);
    }
}
