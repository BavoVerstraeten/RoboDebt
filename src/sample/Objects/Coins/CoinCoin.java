package sample.Objects.Coins;

import javafx.scene.image.Image;
import sample.Models.Model;

public class CoinCoin extends SpecialCoin{
    private Model model;
    public CoinCoin (int r, int c,Model model){
        super(r,c);
        setImage(new Image("/RoboDebt/CoinCoin.png"));
        this.model=model;
    }

    @Override
    public int getValue() {
        for(int i=0;i<10;i++)
            model.spawnCoin();
        return super.getValue();
    }
}
