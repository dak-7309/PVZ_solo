package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sun_prod extends Plants
{
    private int n_tokens;
    private ImageView card;
    private ImageView plant;
    private Suntokens sn;

    public Sun_prod() throws FileNotFoundException
    {
        super();
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

    public int getN_tokens() {
        return n_tokens;
    }
    public void setN_tokens(int n_tokens) {
        this.n_tokens = n_tokens;
    }
    public Suntokens getSn() {
        return sn;
    }

    public void setSn(Suntokens sn) {
        this.sn = sn;
    }

}
