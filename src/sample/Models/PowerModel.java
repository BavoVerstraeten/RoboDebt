package sample.Models;

import sample.Upgrades.LaserUpgrade;
import sample.Upgrades.MagnetUpgrade;
import sample.Objects.Robot;
import sample.Upgrades.Upgrade;

import java.util.ArrayList;

public class PowerModel {
    private Robot robot;
    private ArrayList<Upgrade> timers = new ArrayList<>();
    private ArrayList<Upgrade> activated = new ArrayList<>();
    private ArrayList<Upgrade> expired = new ArrayList<>();

    public PowerModel(Robot robot){
        this.robot =robot;
    }
    public void laserPower(){
        activated.add(new LaserUpgrade(this,robot));
    }
    public void MagnetPower(){
        activated.add(new MagnetUpgrade(this,robot));
    }
    public void eachTick(){
        for(Upgrade timer : timers){
            timer.decrease();
        }
        timers.addAll(activated);
        activated.clear();
        timers.removeAll(expired);
        expired.clear();
    }
    public void removeTimer(Upgrade timer){
        expired.add(timer);
    }
}
