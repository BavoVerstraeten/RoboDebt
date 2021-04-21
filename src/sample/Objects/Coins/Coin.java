package sample.Objects.Coins;

import sample.Objects.MapObject;

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
    public boolean isSpecial(){return false;}
}
