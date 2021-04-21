package sample.Objects.Coins;

import javafx.scene.image.Image;

public class TwentyCoin extends Coin{
    public TwentyCoin(int r, int c){
        super(r,c,20,0.02);
        setImage(new Image("/RoboDebt/TwentyCoin.png"));

    }

}
