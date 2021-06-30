package yuri.migushin;

public class Duck extends Animal implements Swimable {
    public Duck(String name){
        this.name = name;
        this.onDistance = true;
        this.animalType = "Duck";
        this.maxRunDist = 50;
    }

    @Override
    public void swim(float dist) {
        if(dist < 10000){
            System.out.println(animalType+" water ok");
        } else{
            getOutFromDistance();
        }
    }
}