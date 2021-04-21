package sample.Objects.Coins;

import javafx.scene.image.Image;
import sample.Models.Model;

public class UpgradeCoin extends SpecialCoin {
    private Model model;
    public UpgradeCoin (int r, int c,Model model){
        super(r,c);
        setImage(new Image("/RoboDebt/UpgradeCoin.png"));
        this.model=model;
    }

    @Override
    public int collected() {
        for(int i=0;i<20;i++)
            model.upgradeCoin();
        return super.getValue();
    }
}

