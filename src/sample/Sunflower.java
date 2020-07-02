package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sunflower extends Sun_prod
{
    private ImageView card;
    private ImageView plant;
    private Suntokens sn;

    public Sunflower() throws FileNotFoundException
    {
        super();
        this.setDecrement(-15);
        this.setUnlock_timer(8);
        this.setValue(40);
        card=new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\cards\\card_sunflower.png")));
        plant=new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\plants\\sunflower.gif")));
        sn=new Suntokens();
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
    public Suntokens getSn() {
        return sn;
    }

    public void setSn(Suntokens sn) {
        this.sn = sn;
    }

}
