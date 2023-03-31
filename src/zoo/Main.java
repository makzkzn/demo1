package zoo;

public class Main {
    public static void main(String[] args){
        Veterinarian veterinarian = new Veterinarian();
        ZooKeeper zooKeeper = new ZooKeeper();


        veterinarian.lunch();
        zooKeeper.lunch();

        veterinarian.hungry = true;
        veterinarian.lunch();

        //zooKeeper.hurt = true;
        zooKeeper.makeBandage();
    }
}
