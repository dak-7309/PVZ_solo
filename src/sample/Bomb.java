package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Bomb extends Plants
{

    private Zombies Z;
    private ImageView card;
    private ImageView plant;

    public Bomb() throws FileNotFoundException
    {
        super();
    }

    public void bomb(Zombies z)
    {
        this.setVisible(false);
        Z.setVisible(false);

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
    public Zombies getZ() {
        return Z;
    }

    public void setZ(Zombies z) {
        Z = z;
    }


}
