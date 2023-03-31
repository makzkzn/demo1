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

    abstract void watch();

    abstract void makeBandage();




}
