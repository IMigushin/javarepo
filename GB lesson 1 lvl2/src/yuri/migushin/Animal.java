package yuri.migushin;

public class Animal {
    protected String name;
    protected String animalType;
    protected boolean onDistance;
    protected float maxRunDist;

    public void getOutFromDistance(){
        onDistance = false;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    public String getName() {
        return name;
    }

    //    public Animal(String name, String color, int age) {
//        this.name = name;
//        this.color = color;
//        this.age = age;
//    }
//
//    public Animal() {
//        this.name = "unknown";
//        this.color = "unknown";
//        this.age = 0;
//    }

    public void run(float dist){
        if(dist < maxRunDist){
            System.out.println(animalType+" run ok");
        } else{
            getOutFromDistance();
        }
    }

    public  void voice(){
        System.out.println(name+" voice ");
    }
}