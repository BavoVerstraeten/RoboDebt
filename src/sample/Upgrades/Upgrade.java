package sample.Upgrades;

import sample.Models.PowerModel;

public abstract class Upgrade {
    private int timer;
    private PowerModel model;
    public Upgrade(int timer,PowerModel model){
        this.timer=timer;
        this.model=model;
    }
    public void decrease(){
        timer--;
        if(timer==0)
            expired();
    }
    public void expired(){
        model.removeTimer(this);
    }
}
