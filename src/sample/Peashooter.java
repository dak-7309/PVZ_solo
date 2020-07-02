package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Peashooter extends Shooter
{
    private ImageView card;
    private ImageView plant;
    private Pea P;

    public Peashooter() throws FileNotFoundException
    {
        super();
        this.setDecrement(-20);
        this.setUnlock_timer(10);
        this.setValue(100);
        this.setRate(1);
        card=new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\cards\\card_peashooter.png")));
        plant=new ImageView(new Image(new FileInputStream("C:\\Users\\\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\plants\\peashooter.gif")));
    }

    @Override
    public void generate_Pea()
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

    @Override
    public Pea getP() {
        return P;
    }

    @Override
    public void setP(Pea p) {
        P = p;
    }

}
