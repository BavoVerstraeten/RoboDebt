package sample.Objects.Coins;

import javafx.scene.image.Image;
import sample.Models.PowerModel;

public class MagnetCoin extends SpecialCoin{
    private PowerModel model;
    public MagnetCoin(int r, int c, PowerModel model){
        super(r,c);
        setImage(new Image("/RoboDebt/MagnetCoin.png"));
        this.model=model;
    }
    @Override
    public int getValue() {
        model.newPower("magnet");
        return super.getValue();
    }
}
