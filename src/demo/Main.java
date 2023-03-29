package demo;

import static demo.Cat.count;

public class Main {


    public static void main(String[] args) {
        Cat cat1 = new Cat();
        count++;
        cat1.age = 2;
        cat1.hungry = false;
        cat1.setName("MurkaL");
        cat1.setName("");


        System.out.println("Голодная ? " + cat1.hungry);
        System.out.println("Имя кошки: " + cat1.getName());
        System.out.println("Возраст кошки: " + cat1.age);

        cat1.wantToOut();
        System.out.println();

        Cat cat2 = new Cat("Музрик", 3 );
        count++;
        System.out.println("Голодная ? " + cat2.hungry);
        System.out.println("Имя кошки: " + cat2.getName());
        System.out.println("Возраст кошки: " + cat2.age);

        System.out.println("\nЧисло кошек: " + count);


    }
}
