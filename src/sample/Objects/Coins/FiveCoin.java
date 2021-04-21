package sample.Objects.Coins;

import javafx.scene.image.Image;

public class FiveCoin extends Coin{
    public FiveCoin(int r, int c){
        super(r,c,5,0.1);
        setImage(new Image("/RoboDebt/FiveCoin.png"));

    }

}
