package Demo_oop;

public class Tools implements  Behavior{


    @Override
    public boolean clean() {
        System.out.println("Вымыт.");
        return true;
    }
}
