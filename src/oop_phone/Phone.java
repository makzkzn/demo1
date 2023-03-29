package oop_phone;
//        Создайте класс Phone, который содержит переменные number, model и weight.
// ● Создайте три экземпляра этого класса.
// ● Выведите на консоль значения их переменных.
// ● Добавьте в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение “Звонит {name}”.
//        Метод getNumber – возвращает номер телефона.
// ● Вызовите эти методы для каждого из объектов.
//todo: проба первая
public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит - " + name);
    }

    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+79111234567", "Nokia", 150);
        Phone phone2 = new Phone("+79231234567", "Samsung", 160);
        Phone phone3 = new Phone("+79351234567", "iPhone", 200);

        System.out.println("Первый телефон: номер " + phone1.getNumber() + ", модель " + phone1.model + ", вес " + phone1.weight +"гр.");
        System.out.println("Второй телефон: номер " + phone2.getNumber() + ", модель " + phone2.model + ", вес " + phone2.weight +"гр.");
        System.out.println("Третий телефон: номер " + phone3.getNumber() + ", модель " + phone3.model + ", вес " + phone3.weight +"гр.");

        phone1.receiveCall("Мама");
        phone2.receiveCall("Друг");
        phone3.receiveCall("Коллега");
    }
}
