package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Normal extends Zombies
{
    public Normal() throws FileNotFoundException
    {
        super();
        this.setDecrement(-120);
        this.setSpeed(20);
        this.setIm(new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\zombies\\zombie1.png"))));
    }
    @Override
    public void eat()
    {

    }

}
