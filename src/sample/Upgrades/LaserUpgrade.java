package sample.Upgrades;

import sample.Models.PowerModel;
import sample.Objects.Robot;

public class LaserUpgrade extends Upgrade{
    private Robot robot;
    public LaserUpgrade(PowerModel model, Robot robot){
        super(30,model);
        this.robot=robot;
        robot.laserUpgrade(1);
    }

    @Override
    public void expired() {
        robot.laserUpgrade(-1);
        super.expired();
    }
}
