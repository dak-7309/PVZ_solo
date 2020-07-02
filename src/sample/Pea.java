package sample;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Pea
{   private double translatex;
    private double translatey;
    private double dropx;
    private double dropy;
    private Zombies Z;
    private ArrayList<Pea> p;
    private int x;
    private int y;
    private int speed;
    private ImageView im;
    private Boolean visible;
    private int lane;

    public Pea()
    {
        try
        {
            p=new ArrayList<Pea>();
            im = new javafx.scene.image.ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\src\\images\\pea.png")));
            speed = 1;
        }
        catch(FileNotFoundException f)
        {
            System.out.println("file not found");
        }
    }

    public Zombies getZ()
    {
        return Z;
    }

    public void setZ(Zombies z)
    {
        Z = z;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        im.setTranslateX(x);
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        im.setTranslateY(y);
        this.y = y;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public Pea produce_pea()
    {
        Pea P=new Pea();
        //
        return P;
    }

    public void move()
    {
//        for(int i=0;i<100;i++){
//            p.add(new Pea());
//        }
//        ArrayList<Timeline> t1=new ArrayList<Timeline>();
//        for(int i=0;i<100;i++){
//
//            Pea temp=p.get(i);
//            temp.getIm().setX(this.translatex+(-400*i));
//            temp.getIm().setY(this.translatey);
//            t1.add(new Timeline(new KeyFrame(Duration.millis((double)10), e-> peastep())));
//            t1.get(i).setCycleCount(Timeline.INDEFINITE);
//            t1.get(i).play();
//        }
        Timeline move;
        move=new Timeline(new KeyFrame(Duration.millis((double)10), e->
        {
            peastep();

        }));
        move.setCycleCount(Timeline.INDEFINITE);
        move.play();
    }

    public void peastep()
    {
        this.setX(this.getX()+speed);
        this.setTranslatex(this.getTranslatex()+speed);
    }

    public ImageView getIm()
    {
        return this.im;
    }

    public void attack_zom(Zombies Z) throws FileNotFoundException
    {
            Zombies Z1 = new Normal();
            Zombies Z2 = new Bucket();
            Zombies Z3 = new Newspaper();
            Zombies Z4 = new Dancing();
//
            if (Z.getClass() == Z1.getClass())
//            {   System.out.println(Z.getHealth()+" mm");
            {Z.setHealth(Z.getHealth()+Z1.getDecrement());
//                   System.out.println(Z.getHealth()+" nn");

                }
            else if (Z.getClass() == Z2.getClass())
            {
                Z.setHealth(Z.getHealth() + Z2.getDecrement());
            }
            else if (Z.getClass() == Z3.getClass())
            {
                Z.setHealth(Z.getHealth() + Z3.getDecrement());
            }
            else
            {
                Z.setHealth(Z.getHealth() + Z4.getDecrement());
            }
//
        if (Z.getHealth() <= 0) {

            Z.getIm().setVisible(false);
//            Z.setVisible(false);
        }
    }

    public double getTranslatex()
    {
        return translatex;
    }

    public void setTranslatex(double translatex)
    {
        this.translatex = translatex;
    }

    public double getTranslatey()
    {
        return translatey;
    }

    public void setTranslatey(double translatey)
    {
        this.translatey = translatey;
    }

    public double getDropx()
    {
        return dropx;
    }

    public void setDropx(double dropx)
    {
        this.dropx = dropx;
    }

    public double getDropy()
    {
        return dropy;
    }

    public void setDropy(double dropy)
    {
        this.dropy = dropy;
    }
}

