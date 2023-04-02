package zoo;

// может быть голодным и покусаным
// 1 - обходит каждое животное и проверяет его здоровье.
// 2 - помещает в карантин изолируя от других животных.
// 3 - возвращает в  обычный вольер

public class Veterinarian extends Human {
    @Override
    void lunch() {
        if (hungry) {
            System.out.println("Ветеринар пообедал");
            hungry = false;
        } else {
            System.out.println("Ветеринар ещё не голоден");
        }
    }

    @Override
    void makeBandage() {

        if (hurt) {
            System.out.println("Ветеринар покусан и наложил себе повяку !");
            hurt = false;
        } else {
            System.out.println("Ветеринара не кусали.");
        }

    }

    public Veterinarian() {
        profession = "Ветеринар";

    }
}
