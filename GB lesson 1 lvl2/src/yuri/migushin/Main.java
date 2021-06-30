package yuri.migushin;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik");
        Dog d1 = new Dog("Bobik");
        Duck duck = new Duck("Donald");

        Animal[] animals = new Animal[3];
        animals[0] = c1;
        animals[1] = d1;
        animals[2] = duck;

        Obstacle[] obs = new Obstacle[4];
        obs[0] = new OCross(45);
        obs[1] = new OWater(50);
        obs[2] = new OWall(1.5f);
        obs[3] = new OCross(500);

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < obs.length; j++) {
                obs[j].doIt(animals[i]);
                if(!animals[i].isOnDistance()) break;
            }
        }

        for (int i = 0; i < animals.length; i++) {
            if(animals[i].isOnDistance()){
                System.out.println(animals[i].getName()+" WON");
            }
        }






    }
}