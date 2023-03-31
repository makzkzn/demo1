package zoo;

public class Animal {

    // Кусаются и Могут болеть

    boolean healthy;

    public void bite(Human human) {
        human.hurt = true;
        System.out.println("Животное покусало" + human.profession);


    }

}
