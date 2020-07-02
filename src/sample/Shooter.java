package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public abstract class Shooter extends Plants
{
    private Pea P;
    protected ImageView card;
    protected ImageView plant;

    private int rate;  // at which it will fire pea

    public Shooter() throws FileNotFoundException
    {
        super();
    }

    public ImageView getCard()
    {
        return card;
    }

    public void setCard(ImageView card)
    {
        this.card = card;
    }

    public ImageView getPlant()
    {
        return plant;
    }

    public void setPlant(ImageView plant)
    {
        this.plant = plant;
    }


    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public Pea getP() {
        return P;
    }
    public void setP(Pea p) {
        P = p;
    }
    public abstract void generate_Pea();




}
