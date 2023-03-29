package Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Красный", "Седан", 2010);

        car1.setColor("Жёлтый");
        car1.setType("Грузовик");
        car1.setYear(2000);

        System.out.println("Машина номер 1");
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Тип: " + car1.getType());
        System.out.println("Год выпуска: " + car1.getYear());



        System.out.println("Машина номер 2");
        System.out.println("Цвет: " + car2.getColor());
        System.out.println("Тип: " + car2.getType());
        System.out.println("Год выпуска: " + car2.getYear());


        car2.start();
        car2.stop();



    }

}
