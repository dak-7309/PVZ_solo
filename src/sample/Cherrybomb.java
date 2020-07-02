package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Cherrybomb extends Bomb
{

    private ImageView card;
    private ImageView plant;
    private int value;
    private int damage_rows;
    private int damage_columns;

    public Cherrybomb() throws FileNotFoundException
    {
        super();
        card=new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\cards\\card_cherrybomb.png")));
        plant=new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\plants\\cherrybomb.gif")));
        this.value=150;
    }

    public void bomb(Zombies z)
    {

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

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
}
