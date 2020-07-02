package sample;

public class Dancing extends Zombies implements Cloneable {
    public Dancing() {
        super();
        this.setDecrement(-5);
        this.setSpeed(10);
    }

    @Override
    public void eat() {

    }
}


