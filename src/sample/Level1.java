package sample;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Level1
{
    private Level1_GUI gui;
    private ProgressBar pb;
    private List<Zombies> lz;

    Level1(Level1_GUI gui) throws FileNotFoundException
    {
        this.gui=gui;
        pb = gui.getPb();
        lz=new ArrayList<Zombies>();
//        movezombie();
    }

    public Level1_GUI getGui()
    {
        return gui;
    }

    public ProgressBar getPb()
    {
        return pb;
    }


    public void setGui(Level1_GUI gui) {
        this.gui = gui;
    }

}
