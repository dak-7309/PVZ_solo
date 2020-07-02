package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Wall_nut extends Barrier
{

    private ImageView card;
    private ImageView plant;


    public Wall_nut() throws FileNotFoundException
    {
        super();
        this.setDecrement(-4);
        this.setUnlock_timer(15);
        this.setValue(50);

        card=new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\cards\\card_wallnut.png")));
        plant=new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\plants\\4Wall-nut.gif")));
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

}
