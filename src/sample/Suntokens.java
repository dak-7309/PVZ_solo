package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Suntokens
{
    private ImageView im;

    Suntokens() throws FileNotFoundException
    {
        im=new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\sun.png")));
    }
    public void fall()
    {

    }
    public void spawn()
    {

    }
    public ImageView getIm()
    {
        return im;
    }
}
