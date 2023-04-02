package zoo;

public class Animal {

    // Кусаются и Могут болеть

    boolean healthy;
    String name;

    String cage = "В вольере";



    public void bite(Human human) {
        human.hurt = true;
        System.out.println("Животным покусан " + human.profession);


    }

}
