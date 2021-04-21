package sample.Upgrades;

import sample.Models.PowerModel;

public abstract class Upgrade {
    private int timer=0;
    protected PowerModel model;
    protected String name;
    private int start;
    public Upgrade(int timer,PowerModel model,String name){
        this.model=model;
        this.name=name;
        this.start=timer;
    }
    public void decrease(){
        timer--;
        if(timer==0)
            expired();
    }
    public  void expired(){
        model.expired(name);
    }
    public void refresh(){
        timer=start;
    }
}
