package zoo;

// может быть покусан.
// 1 - кормит всех животных
// 2 - вычёсывает кошачьих.
// 3 - меняет бегемотк воду.


public class ZooKeeper extends Human {
    @Override
    void lunch() {
        if (hungry) {
            System.out.println("Смотритель пообедал");
            hungry = false;
        } else {
            System.out.println("Смотритель ещё не голоден");
        }
    }

    @Override
    void watch(Squirrels squirrels) {
        if (squirrels.cage == "вне вольера") {
            System.out.println("Белка поймана");
            squirrels.cage = "в вольере";
        } else {
            System.out.println("Белка на месте");

        }


    }

    @Override
    void makeBandage() {
        if (hurt) {
            System.out.println("Смотритель покусан и наложил себе повязку");
            hurt = false;
        } else {
            System.out.println("Смотрителя не кусали.");


        }
    }

    public ZooKeeper() {
        profession = "Смотритель";

    }
}
