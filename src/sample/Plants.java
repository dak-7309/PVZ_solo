package sample;

import javafx.scene.image.ImageView;
import java.io.Serializable;

public abstract class Plants extends CharacterGame implements Serializable
{
    private int decrement;
    private int unlock_timer;
    private int value;
    protected ImageView card;
    protected ImageView plant;

    public Plants()
    {
        super();
    }

    public int getDecrement()
    {
        return decrement;
    }

    public void setDecrement(int decrement)
    {
        this.decrement = decrement;
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

    public int getUnlock_timer() {
        return unlock_timer;
    }

    public void setUnlock_timer(int unlock_timer)
    {
        this.unlock_timer = unlock_timer;
    }

    public void die()
    {
        this.setHealth(this.getHealth()+this.getDecrement());
        if(this.getHealth()<=0)
        {
            this.setVisible(false);
        }
    }
}


