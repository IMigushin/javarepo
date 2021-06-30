package yuri.migushin;

public class Dog extends Animal implements Swimable, Jumpable{

    public Dog(String name) {
        this.name = name;
        this.animalType = "Dog";
        this.onDistance = true;
        this.maxRunDist = 800;
    }

    @Override
    public void voice() {
        System.out.println(name+" gav ");
    }

    public void swim(float dist){
        if(dist < 1000){
            System.out.println(animalType+" water ok");
        } else{
            getOutFromDistance();
        }
    }

    @Override
    public void jump(float height) {
        if(height <= 1.5){
            System.out.println(animalType+" jump ok");
        } else{
            getOutFromDistance();
        }
    }
}

