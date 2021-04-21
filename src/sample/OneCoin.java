package sample;

import javafx.scene.image.Image;

public class OneCoin extends Coin{
    public OneCoin(int r, int c){
        super(r,c,1,0.88);
        setImage(new Image("/RoboDebt/OneCoin.png"));

    }

}
