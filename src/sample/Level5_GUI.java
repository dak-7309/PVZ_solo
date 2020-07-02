package sample;

import java.util.*;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.util.Duration;
//import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Level5_GUI
{
    private List<Shooter> p;
    private List<Bomb> bomber;
    private List<Barrier> barrier;

    private List<Zombies> z;



    private List<Lawnmover> l;
    private ImageView bg;
    private ProgressBar pb;
    private Scene sc;
    private List<Card> c;
    private ImageView lm;
    private Button pause_btn;
    private StackPane pa;
    private TextField tf;
    private Pane zombiePane;
    private Suntokens sn;
    private Pane pane;

    private Level5 l5;
//    private Zombies z;

    Level5_GUI()throws FileNotFoundException
    {
        bg = new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\mainBG.png"), 1200, 650, false, false));
        pa = new StackPane();
        this.l5=l5;
        tf=new TextField();
        p=new ArrayList<Shooter>();
        bomber=new ArrayList<Bomb>();
        barrier=new ArrayList<Barrier>();
        l = new ArrayList<Lawnmover>();

        for (int i = 0; i < 5; i++)
        {
            lm = new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\lawnmower1.png")));
            l.add(new Lawnmover());
            l.get(i).setlmimage(lm);
        }

        sn=new Suntokens();
        z=new ArrayList<Zombies>();

        c=new ArrayList<Card>();
        c.add(new Card(new Peashooter()));
        c.add(new Card(new Wall_nut()));
        c.add(new Card(new Sunflower()));
        c.add(new Card(new Cherrybomb()));
        tf.setText("100");

        c.get(0).getIm().setId("pea_card");
        c.get(1).getIm().setId("wallnut_card");
        c.get(2).getIm().setId("sunflower_card");
        c.get(3).getIm().setId("cherrybomb_card");

        HBox temp=setcardlayout();
        VBox vb=setlawnmoverlayout();
//        pb= setprogressbarlayout();
        pause_btn=setbuttonlayout();
//        setZombielayout();
        setsuntokenslayput();
        zombiePane = new Pane();
        pane=new Pane();
        pa.getChildren().addAll(bg,zombiePane,temp,pause_btn,vb);
        sc = new Scene(pa, 1280, 680);
    }

    public VBox setlawnmoverlayout()
    {
        VBox vb=new VBox(22);
//        vb.setTranslateX();
        vb.setTranslateY(100);
//        l.get(0).setX(0);
//        l.get(0).setY(0);
//
//        l.get(1).setX(0);
//        l.get(1).setY(0);

//        l.get(2).setX(-290);
//        l.get(2).setY(300);
//
//        l.get(3).setX(-290);
//        l.get(3).setY(400);
//
//        l.get(4).setX(-290);
//        l.get(4).setY(500);

        vb.getChildren().addAll(l.get(0).getLmimage(),l.get(1).getLmimage(),l.get(2).getLmimage(),l.get(3).getLmimage(),l.get(4).getLmimage());
        return vb;
    }

//    public ProgressBar setprogressbarlayout()
//    {
//        ProgressBar pb=new ProgressBar();
//        pb.setMaxWidth(200);
//        pb.setTranslateX(270);
//        pb.setTranslateY(-320);
//       return pb;
//    }

    public HBox setcardlayout()
    {
        HBox card=new HBox(5);
        card.setTranslateX(160);
        card.setTranslateY(12);
//        c.get(0).getIm().setTranslateX(160);
//        c.get(0).getIm().setTranslateY(12);
//
//        c.get(1).getIm().setTranslateX(170);
//        c.get(1).getIm().setTranslateY(12);
//
//        c.get(2).getIm().setTranslateX(180);
//        c.get(2).getIm().setTranslateY(12);
//
//        c.get(3).getIm().setTranslateX(190);
//        c.get(3).getIm().setTranslateY(12);
        card.getChildren().addAll(c.get(0).getIm(),c.get(1).getIm(),c.get(2).getIm(),c.get(3).getIm());
        return card;
    }

    public Button setbuttonlayout()
    {
        Button temp_btn=new Button("Pause");
        temp_btn.setTranslateX(505);
        temp_btn.setTranslateY(-320);
        temp_btn.setMaxSize(210,20);
        return temp_btn;
    }
    public TextField tf_edit(TextField t)
    {
        t.setText(Integer.toString (Integer.parseInt(t.getText())+100));
        return t;
    }

    public void setsuntokenslayput( ) throws FileNotFoundException
    {
        List<Timeline> t1=new ArrayList<Timeline>();
        List<Suntokens> s=new ArrayList<Suntokens>();

        for(int i=0;i<100;i++)
        {
            s.add(new Suntokens());
        }
        Random random=new Random();
        for(int i=0;i<100;i++)
        {
            int num1=random.nextInt(400)+700;
            int num2=random.nextInt(450)+100;

            Timeline move;
            Suntokens temp=s.get(i);
            int o=i;
            move=new Timeline(new KeyFrame(Duration.millis((double)100), e->
            {
                StackPane pane=new StackPane();
                pane.setAlignment(Pos.TOP_LEFT);
                pane.setTranslateY(-200*(o+1));
                pane.setTranslateX(num1);
                pane.getChildren().add(temp.getIm());
                sunstep(temp);
                pa.getChildren().add(pane);
            } ));

            move.setCycleCount(Timeline.INDEFINITE);
            t1.add(move);
            move.play();
            StackPane tt=((StackPane)(s.get(i).getIm().getParent()));

            s.get(i).getIm().setOnMouseClicked(e->
            {
                StackPane sunpane=new StackPane();
                sunpane.setAlignment(Pos.TOP_LEFT);
                sunpane.setTranslateY(80);
                sunpane.setTranslateX(85);
                TextField TF=tf_edit(tf);
                TF.setMaxWidth(40);
                sunpane.getChildren().add(TF);
                pa.getChildren().add(sunpane);
                temp.getIm().setVisible(false);
//                tt.getChildren().remove(temp.getIm());
            });
        }
    }

    public void sunstep(Suntokens temp)
    {
        temp.getIm().setTranslateY(temp.getIm().getTranslateY()+2);
    }
//    public void setZombielayout()throws FileNotFoundException
//    {
//        for(int i=0;i<1;i++)
//        {
//            this.z.add(new Normal());
//        }
//    }

//    public void pb_start()
//    {
//        pb.setStyle("-fx-accent: green;");
//        IntegerProperty seconds = new SimpleIntegerProperty();
//        pb.progressProperty().bind(seconds.divide(60.0));
//        Timeline timeline = new Timeline(
//                new KeyFrame(Duration.ZERO, new KeyValue(seconds, 0)),
//                new KeyFrame(Duration.minutes(1), e-> {
//                    // do anything you need here on completion...
//                }, new KeyValue(seconds, 60))
//        );
//        timeline.setCycleCount(0);
//        timeline.play();
//    }

    public Zombies produce_zombie() throws FileNotFoundException
    {
        Zombies new_z=new Normal();
        zombiePane.getChildren().add(new_z.getIm());
        return new_z;
    }
    public Zombies produce_zombie2() throws FileNotFoundException
    {
        Zombies new_z=new Newspaper();
        zombiePane.getChildren().add(new_z.getIm());
        return new_z;
    }
    public void onestep(Zombies new_z, double i) {
        new_z.getIm().setX(new_z.getIm().getX()-i);


//    {   try{
//        Zombies Z1=new Normal();
//        Zombies Z2=new Newspaper();
//        if(new_z.getClass()==Z1.getClass()){
//            new_z.getIm().setX(new_z.getIm().getX()-0.1);
//
//        }
//        else{
//            new_z.getIm().setX(new_z.getIm().getX()-0.2);
//
//        }
//
//    }catch (FileNotFoundException e){}
//    }

    }
    public void movezombie() throws FileNotFoundException
    {
        Zombies new_z1=produce_zombie();
        Zombies new_z2=produce_zombie2();
        Zombies new_z3=produce_zombie();
        Zombies new_z4=produce_zombie2();
        Zombies new_z5=produce_zombie();
        z.add(new_z1);
        z.add(new_z2);
        z.add(new_z3);
        z.add(new_z4);
        z.add(new_z5);

        ArrayList<Timeline> t1=new ArrayList<Timeline>();
        ArrayList<Integer> posy=new ArrayList<>();
        posy.add(100);
        posy.add(200);
        posy.add(300);
        posy.add(400);
        posy.add(500);

        Random rand=new Random();
        for(int i=0;i< 5;i++){
            int x=rand.nextInt(500);
            int y=rand.nextInt(posy.size());
            Zombies temp=z.get(i);
            temp.getIm().setX(1200+x);
            temp.getIm().setY(posy.get(y));
            posy.remove(y);

            t1.add(new Timeline(new KeyFrame(Duration.millis((double)10), e-> onestep(temp,0.2))));
            t1.get(i).setCycleCount(Timeline.INDEFINITE);
            t1.get(i).play();
        }
    }
    public void collision_wait() throws FileNotFoundException{
        for(int i=0;i<barrier.size();i++)
        {
            StackPane temppane=(StackPane) barrier.get(i).getPlant().getParent();
            double x=temppane.getTranslateX();
            double y=temppane.getTranslateY();

            for(int j=0;j<z.size();j++)
            {
                double x1=z.get(j).getIm().getX();
                double y1=z.get(j).getIm().getY();
                System.out.println(x+" "+x1+" "+y+" "+y1);


                if( (x >= (x1-20) && x <= (x1+20))&&(y >= (y1-83) && y <= (y1+83)))
                {   System.out.println("balle");

//                    ArrayList<Timeline> t1=new ArrayList<Timeline>();
//                    Zombies temp=z.get(j);
//                    t1.add(new Timeline(new KeyFrame(Duration.millis((double)10), e-> onestep(temp,-2))));
//                    t1.get(0).setCycleCount(500);
//                    t1.get(0).play();


                    int counter=0;
                    for(long  m=0;m<100000000;m++){
                        counter+=counter*counter*counter;
//                        z.get(j).getIm().setX(z.get(j).getIm().getX()+100);
                    }
//                    z.get(j).getIm().setVisible(false);
                    barrier.get(i).getPlant().setVisible(false);
                    temppane.getChildren().remove(barrier.get(i).getCard());
//                    zombiePane.getChildren().remove(z.get(j));
//                    z.remove(z.get(j));

//                    StackPane pea_pane=(StackPane)peas.getIm().getParent();
//                    pea_pane.getChildren().remove(peas.getIm());
                }
            }
        }
    }

    public void collision_detection2() throws FileNotFoundException
    {

        for(int i=0;i<bomber.size();i++)
        {
            StackPane temppane=(StackPane) bomber.get(i).getPlant().getParent();
            double x=temppane.getTranslateX();
            double y=temppane.getTranslateY();

            for(int j=0;j<z.size();j++)
            {
                double x1=z.get(j).getIm().getX();
                double y1=z.get(j).getIm().getY();
//                System.out.println(x+" "+x1+" "+y+" "+y1);


                if( (x >= (x1-20) && x <= (x1+20))&&(y >= (y1-83) && y <= (y1+83)))
//                {   System.out.println("balle");
                {
                    z.get(j).getIm().setVisible(false);
                    bomber.get(i).getPlant().setVisible(false);
                    temppane.getChildren().remove(bomber.get(i).getCard());
                    zombiePane.getChildren().remove(z.get(j));
                    z.remove(z.get(j));

//                    StackPane pea_pane=(StackPane)peas.getIm().getParent();
//                    pea_pane.getChildren().remove(peas.getIm());
                }
            }
        }
    }



    public void collision_detection() throws FileNotFoundException
    {

        for(int i=0;i<p.size();i++)
        {
            Pea peas=p.get(i).getP();
            double x=peas.getTranslatex();
            double y=peas.getTranslatey();

            for(int j=0;j<z.size();j++)
            {
                double x1=z.get(j).getIm().getX();
                double y1=z.get(j).getIm().getY();
//                System.out.println(x+" "+x1+" "+y+" "+y1);

                if( (x >= (x1-2) && x <= (x1+2))&&(y >= (y1-83) && y <= (y1+83)))
                {
                    peas.attack_zom(z.get(j));
//                    System.out.println(x+" "+x1+" "+y+" "+y1+" ballee");
                    zombiePane.getChildren().remove(z.get(j));
                    z.remove(z.get(j));

//                    peas.getIm().setVisible(false);
                    StackPane pea_pane=(StackPane)peas.getIm().getParent();
                    pea_pane.getChildren().remove(peas.getIm());
//                    System.out.println(peas.getIm().getTranslateX()+" debug"+peas.getIm().getTranslateY());

//                    peas.setTranslatex(0.0);
//                    peas.setTranslatey(0.0);
//                    peas.getIm().setTranslateX(0.0);
//                    peas.getIm().setTranslateY(0.0);
//                    peas.setX(0);
//                    peas.attack_zom(z.get(j));
                }
                //peas.peastep();
            }
        }
    }

    public void Dragboard() throws FileNotFoundException
    {
        this.c.get(0).getIm().setOnDragDetected(new DraggingPlant(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\cards\\card_peashooter.png")), this.c.get(0).getIm(), bg, sc));
        this.c.get(1).getIm().setOnDragDetected(new DraggingPlant(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\cards\\card_wallnut.png")), this.c.get(1).getIm(), bg, sc));
        this.c.get(2).getIm().setOnDragDetected(new DraggingPlant(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\cards\\card_sunflower.png")), this.c.get(2).getIm(), bg, sc));
        this.c.get(3).getIm().setOnDragDetected(new DraggingPlant(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\cards\\card_cherrybomb.png")), this.c.get(3).getIm(), bg, sc));
    }

    public void putplants() throws FileNotFoundException
    {
        Dragboard();
        StackPane playGamePane= this.pa;
        playGamePane.setOnDragOver(dragEvent -> {

            dragEvent.acceptTransferModes(TransferMode.COPY_OR_MOVE);
            dragEvent.consume();

        });

        playGamePane.setOnDragDropped(dragEvent ->
        {
            String pt = dragEvent.getDragboard().getString();
            double dropX = dragEvent.getX();
            double dropY = dragEvent.getY();

            if(pt == "pea_card")
            {

                if(Integer.parseInt(tf.getText())<100 )
                {

                }
                else{
                    StackPane plant = new StackPane();
                    StackPane pp=new StackPane();
                    Shooter p=null;
                    ImageView pstp =null;
                    Pea pea=null;
                    ImageView pea_im=null;
                    try
                    {
                        p=new Peashooter();
                        pea=new Pea();
                        p.setP(pea);
                        pstp=p.getPlant();
                        pea_im=pea.getIm();
                    }
                    catch(IOException e)
                    {
                        System.out.println("peashooter");
                    }
                    plant.getChildren().add(pstp);
                    pp.getChildren().add(pea_im);

                    playGamePane.getChildren().addAll(plant,pp);
                    plant.setAlignment(Pos.TOP_LEFT);
                    plant.setTranslateX(dropX);
                    plant.setTranslateY(dropY);

                    pp.setAlignment(Pos.TOP_LEFT);
                    pp.setTranslateX(dropX);
                    pp.setTranslateY(dropY);

                    pea.setTranslatex(dropX);
                    pea.setTranslatey(dropY);

                    pea.setDropx(dropX);
                    pea.setDropy(dropY);
                    this.p.add(p);
                    pea.move();
                    tf.setText(Integer.toString   (Integer.parseInt(tf.getText())-100)  );
                }
            }

            else if(pt=="sunflower_card")
            {   if(Integer.parseInt(tf.getText())<50 )
            {

            }
            else{
                StackPane plant = new StackPane();
                StackPane ss=new StackPane();
                Plants p=null;
                ImageView pstp = null;
                Sun_prod sun=null;
                ImageView sun_im=null;

                try
                {
                    p=new Sunflower();
                    pstp=p.getPlant();
                    sun=new Sunflower();
                    sun_im=sun.getSn().getIm();
                }

                catch(IOException e)
                {
                    System.out.println("sunflower");
                }

                plant.getChildren().add(pstp);
                ss.getChildren().add(sun_im);
                playGamePane.getChildren().addAll(plant,ss);
                plant.setAlignment(Pos.TOP_LEFT);
                plant.setTranslateX(dropX);
                plant.setTranslateY(dropY);

                ss.setAlignment(Pos.TOP_LEFT);
                ss.setTranslateX(dropX);
                ss.setTranslateY(dropY);
                ImageView temp=sun_im;
                sun_im.setOnMouseClicked(e->
                {
                    temp.setVisible(false);
                    tf.setText(Integer.toString   (Integer.parseInt(tf.getText())+100)  );
                });
            }

            }

            else if(pt=="wallnut_card")
            {     if(Integer.parseInt(tf.getText())<50 )
            {

            }else{
                StackPane stackPane = new StackPane();
                Barrier p=null;
                ImageView pstp = null;
                try
                {
                    p=new Wall_nut();
                    pstp=p.getPlant();
                    pstp.setFitHeight(80);
                    pstp.setFitWidth(80);
                }
                catch(IOException e)
                {
                    System.out.println("wallnut");
                }
                stackPane.getChildren().add(pstp);
                playGamePane.getChildren().add(stackPane);
                stackPane.setAlignment(Pos.TOP_LEFT);
                stackPane.setTranslateX(dropX);
                stackPane.setTranslateY(dropY);
                this.barrier.add(p);
            }
//                pstp.setX(dropX);
//                pstp.setY(dropY);
            }

            else if(pt=="cherrybomb_card")
            {    if(Integer.parseInt(tf.getText())<150 )
            {

            }
            else{
                StackPane stackPane = new StackPane();
                Bomb p=null;
                ImageView pstp = null;
                try
                {
                    p=new Cherrybomb();
                    pstp=p.getPlant();
                }
                catch(IOException e)
                {
                    System.out.println("cherrybomb");
                }
                stackPane.getChildren().add(pstp);
                playGamePane.getChildren().add(stackPane);
                stackPane.setAlignment(Pos.TOP_LEFT);
                stackPane.setTranslateX(dropX);
                stackPane.setTranslateY(dropY);
                this.bomber.add(p);

//                pstp.setOnMouseClicked(e->
////                {   p.destroy();
//                    temp.setVisible(false);
//                });

            }

            }
        });
    }

//    public Pea produce_pea(StackPane pane)
//    {
//        Pea P=new Pea();
//        pane.getChildren().add(P.getIm());
//        return P;
//    }
//
//    public void peamove(double dropX,double dropY,StackPane pane)
//    {
//        List<Pea> peas=new ArrayList<Pea>();
//        for(int i=0;i<100;i++)
//        {
//            peas.add(produce_pea(pane));
//        }
//
//        ArrayList<Timeline> t1=new ArrayList<Timeline>();
//
//        for(int i=0;i<1;i++)
//        {
//            Pea temp=peas.get(i);
//            temp.getIm().setX(dropX-(400*i));
//            temp.getIm().setY(dropY);
//            t1.add(new Timeline(new KeyFrame(Duration.millis((double)10), e-> peastep(temp))));
//            t1.get(i).setCycleCount(Timeline.INDEFINITE);
//            t1.get(i).play();
//        }
//    }
//
//    public void peastep(Pea p)
//    {
//        p.getIm().setTranslateX(p.getIm().getTranslateX()+3);
//    }

    public Scene getSc()throws FileNotFoundException
    {
        movezombie();
        return sc;
    }

    public ProgressBar getPb()
    {
        return pb;
    }

    public List<Card> getC()
    {
        return c;
    }

    public ImageView getBg()
    {
        return bg;
    }

    public StackPane getPa()
    {
        return pa;
    }

    public void setL5(Level5 l5)
    {
        this.l5 = l5;
    }
}


