package sample.Objects.Coins;

import javafx.scene.image.Image;
import sample.Models.PowerModel;

public class LaserCoin extends SpecialCoin{

    private PowerModel model;

    public LaserCoin(int r, int c,PowerModel model){
        super(r,c);
        setImage(new Image("/RoboDebt/LaserCoin.png"));
        this.model=model;
    }

    @Override
    public int collected() {
        model.newPower("laser");
        return super.getValue();
    }
}
