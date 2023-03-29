package demo;

public class Cat {
    // Поля
    private String name;// = null
    int age;// = 0
    boolean hungry = true;

    static int count = 0;


    // Свойства
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != "") {
            name = newName;
        }
        name = newName;
    }
// Методы

    private void meow() {
        System.out.println("Мяу!");
    }

    public void wantToOut() {
        System.out.println("Скребёт дверь");
        meow();
    }
// Конструкторы

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {

    }


}

