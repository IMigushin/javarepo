package yuri.migushin;

public class OWater extends Obstacle {
    @Override
    public void doIt(Animal a) {
        if(a instanceof Swimable){
            ((Swimable)a).swim(size);
        } else{
            a.getOutFromDistance();
        }
    }

    public OWater(float size) {
        this.size = size;
    }
}

