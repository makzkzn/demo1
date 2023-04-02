package zoo;

import demo.Cat;

public class Main {
    public static void main(String[] args){
        Veterinarian veterinarian = new Veterinarian();
        ZooKeeper zooKeeper = new ZooKeeper();


//        veterinarian.lunch();
//        zooKeeper.lunch();
//
//        veterinarian.hungry = true;
//        veterinarian.lunch();
//
//        zooKeeper.hurt = true;
//        zooKeeper.makeBandage();

        Cats lion = new Cats();
        Cats tiger = new Cats();
        Hypopotamus hypo = new Hypopotamus();
        Squirrels squirrelsS = new Squirrels();
        Squirrels squirrelsL = new Squirrels();

//        System.out.println(zooKeeper.hurt);
//        lion.bite(zooKeeper);
//        System.out.println(zooKeeper.hurt);

       squirrelsL.goOut();
        veterinarian.watch(squirrelsL);

    }
}
