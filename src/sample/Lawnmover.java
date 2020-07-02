package sample;


import javafx.scene.image.ImageView;

public class Lawnmover
{
    private Boolean used;
    private int x;
    private int y;
    private ImageView lmimage;

    Lawnmover()
    {
        used=false;
        x=0;
        y=0;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
        this.lmimage.setTranslateX(x);
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
        this.lmimage.setTranslateY(y);
    }

    public void setlmimage(ImageView lmimage)
    {
        this.lmimage = lmimage;
    }

    public ImageView getLmimage()
    {
        return lmimage;
    }

}
