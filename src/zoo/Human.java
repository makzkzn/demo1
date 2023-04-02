package zoo;

// может быть покусан.
// 4 - обедает.
// 5 - следят за белками которые могут сбежать
// 6 - должен наложить себе повязку.

public abstract class Human {

    boolean hungry; //false по умолчанию

    boolean hurt; //false по умолчанию

    String profession;


    abstract void lunch();

    void watch(Squirrels squirrels) {
        if (squirrels.cage == "вне вольера") {
            System.out.println("Белка поймана");
            squirrels.cage = "в вольере";
        } else {
            System.out.println("Белка на месте");

        }
    }

    abstract void makeBandage();

}

