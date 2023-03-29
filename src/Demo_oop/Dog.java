package Demo_oop;

public class Dog extends Animal implements Behavior{

    public void bark(){
        System.out.println("Гав гав");

    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");

    }

    @Override
    public void sleep() {
        System.out.println("Собака спит.");

    }
    public void bite(){
        System.out.println("Кусать");
    }

    @Override
    public boolean clean() {
        System.out.println("Собака вымыта.");
        return true;
    }
}
