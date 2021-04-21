package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Coin extends MapObject {
    private int value;
    private double weight;
    public Coin(int r, int c,int value,double weight){
        super(r,c);
        this.value=value;
        this.weight=weight;
    }
    public int getValue(){
        return value;
    }

    public double getWeight() {
        return weight;
    }
}
