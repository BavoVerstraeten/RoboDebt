package sample.Objects.Coins;

public abstract class SpecialCoin extends Coin{

    public SpecialCoin(int r, int c){
        super(r,c,1,0.01);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
