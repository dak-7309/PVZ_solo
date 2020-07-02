package sample;

import javafx.scene.image.ImageView;

public abstract class Zombies extends CharacterGame{
    private int speed;
    private int decrement;
    private ImageView im;
    private Pea P;

    //constructor
    public Zombies()
    {
        super();
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getDecrement() {
        return decrement;
    }

    public void setDecrement(int decrement) {
        this.decrement = decrement;
    }

    public Pea getP() {
        return P;
    }

    public void setP(Pea p) {
        P = p;
    }
    public ImageView getIm()
    {
        return im;
    }

    public void setIm(ImageView im)
    {
        this.im = im;
    }
    public abstract void eat();

}
