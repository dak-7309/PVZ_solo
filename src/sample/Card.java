package sample;
import javafx.scene.image.ImageView;

public class Card
{
    private ImageView im;
    private int value;

    Card(Plants p)
    {
        im=p.getCard();
        value=p.getValue();
    }

    public ImageView getIm()
    {
        return im;
    }

    public void setIm(ImageView im) {
        this.im = im;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
