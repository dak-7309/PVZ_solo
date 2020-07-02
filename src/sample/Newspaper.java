package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Newspaper extends Zombies
{
    public Newspaper() throws FileNotFoundException
    {
        super();
        this.setDecrement(-120);
        this.setSpeed(20);
        this.setIm(new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\zombies\\newspaperzombie.png"))));
    }
    @Override
    public void eat()
    {

    }

}
