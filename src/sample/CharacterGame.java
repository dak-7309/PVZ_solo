package sample;

import java.io.Serializable;

public class CharacterGame implements Serializable {

//    public Level L;
    private int x;
    private int y;
    private boolean visible=true;
    private int health=100;
    //constructor
    public CharacterGame(){

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

//    public Level getL() {        return L;    }
}

