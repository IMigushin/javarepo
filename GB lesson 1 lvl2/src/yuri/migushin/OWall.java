package yuri.migushin;

public class OWall extends Obstacle {
    @Override
    public void doIt(Animal a) {
        if(a instanceof Jumpable){
            ((Jumpable)a).jump(size);
        } else{
            a.getOutFromDistance();
        }
    }

    public OWall(float size) {
        this.size = size;
    }
}
