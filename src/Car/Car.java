package Car;

public class Car {

    //- Создайте атрибуты класса Car - color(цвет), type(тип), year(год).
    String color;
    private String type;
    private int year;


//1 - запуск автомобиля, при его вызове выводится сообщение "Автомобиль заведён".

    public void start() {
        System.out.println("Автомобиль заведён");
    }

//2 - отключение автомобиля - выводит сообщение "Автомобиль заглушен".
    public void stop() {
        System.out.println("Автомобиль заглушен.");
    }

//3 - присвоение автомобилю года выпуска.
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

//4 - присвоеие автомобилю типа.
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;

    }
//5 - присвоение автомобилю цвета.
    public void setColor(String carColor){
        color = carColor;
    }
    public String getColor(){
        return color;
    }
    public Car(){

    }
    public Car(String color, String type, int year){
        this.color = color;
        this.type = type;
        this.year = year;


    }
}


