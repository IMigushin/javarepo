package yuri.migushin;

public class OCross extends Obstacle {
    @Override
    public void doIt(Animal a) {
        a.run(size);
    }

    public OCross(float size) {
        this.size = size;
    }
}
