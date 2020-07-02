package sample;

import java.awt.*;
import java.io.File;
import java.lang.String;

import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.util.Duration;
import javafx.scene.shape.Rectangle;
import java.awt.event.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main extends Application
{
    @Override
    public void start(Stage primarystage) throws FileNotFoundException,InterruptedException
    {
        Game g=new Game();
        g.showmainmenu(primarystage);
        Scene ng=g.shownewgameScene();
        g.getNewgame().setOnAction(e->primarystage.setScene(ng));

        Level5_GUI l1gui=new Level5_GUI();
        Level5 l5=new Level5(l1gui);
        l1gui.setL5(l5);
        Scene sc=l5.getGui().getSc();
//        Level4 l4=new Level4(l1gui);
//        l1gui.setL4(l4);
//        Scene sc=l4.getGui().getSc();

        g.getPlaygame().setOnAction(e->primarystage.setScene(sc));
        l1gui.putplants();
        primarystage.show();
//        l1gui.movezombie();

        Timeline move;
        move=new Timeline(new KeyFrame(Duration.millis((double)10), e-> {
            try
            {
                l1gui.collision_detection();
                l1gui.collision_detection2();
                l1gui.collision_wait();

            }
            catch(FileNotFoundException f)
            {

            }
        }));
        move.setCycleCount(Timeline.INDEFINITE);
        move.play();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

class Game
{
    private Button newgame;
    private Button loadgame;
    private Button chooselevel;
    private Button exit;
    private Button playgame;
    private Button Back;
    private ImageView imageview;

    Game() throws FileNotFoundException
    {
        newgame=new Button("New Game");
        loadgame=new Button("Load Game");
        chooselevel=new Button("Choose level");
        exit=new Button("Exit");
        FileInputStream inputstream = new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\PvZStreet_1440x900.jpeg");
        Image image = new Image(inputstream, 1280, 680, false, false);
        this.imageview=new ImageView(image);
    }

    public void showmainmenu(Stage stage)
    {
        StackPane p=new StackPane();
        Scene mainmenuscene=new Scene(p,1280,680);
        VBox layout=new VBox(20);
        layout.getChildren().addAll(newgame,loadgame,chooselevel,exit);
        layout.setAlignment(Pos.CENTER);
        p.getChildren().addAll(imageview,layout);
        stage.setScene(mainmenuscene);
    }

    public Scene shownewgameScene() throws FileNotFoundException
    {
        StackPane newGamePane = new StackPane();
        ImageView bg = new ImageView(new Image(new FileInputStream("C:\\Users\\Garvit\\Desktop\\PlantsVsZombies-master\\resources\\images\\PvZStreet_1440x900.jpeg"),1280,680,false,false));
        Label label =new Label("Enter your Name");
        label.setTextFill(Color.web("#000000", 0.8));
        label.setFont(new Font(20));
        VBox layout =new VBox(20);
        TextField tf=new TextField();
        tf.setMaxWidth(220);

        HBox root =new HBox(10);
        root.setPadding(new Insets(10, 10, 10, 10));

        playgame =new Button("Play Game");
        Back=new Button("Back");

        root.getChildren().addAll(playgame,Back);
        root.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(label,tf,root);
        layout.setAlignment(Pos.CENTER);
        newGamePane.getChildren().addAll(bg,layout);
        Scene newgamescene=new Scene(newGamePane,1280,680);
        return newgamescene;
    }

    public void serialise() throws IOException
    {

    }

    public Button getNewgame()
    {
        return newgame;
    }

    public Button getLoadgame()
    {
        return loadgame;
    }

    public Button getChooselevel()
    {
        return chooselevel;
    }

    public Button getExit()
    {
        return exit;
    }

    public Button getPlaygame()
    {
        return playgame;
    }

    public Button getBack()
    {
        return Back;
    }
}
