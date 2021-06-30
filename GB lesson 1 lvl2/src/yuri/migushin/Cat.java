package yuri.migushin;

public class Cat  extends Animal implements Jumpable{

    public Cat(String name) {
        this.name = name;
        this.animalType = "Cat";
        this.onDistance = true;
        this.maxRunDist = 500;
    }

    @Override
    public void voice() {
        System.out.println(name+" meow ");
    }

    @Override
    public void jump(float height) {
        if(height <= 2){
            System.out.println(animalType+" jump ok");
        } else{
            getOutFromDistance();
        }
    }
}
