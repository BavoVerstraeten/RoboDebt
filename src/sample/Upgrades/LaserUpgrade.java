package sample.Upgrades;

import sample.Models.PowerModel;
import sample.Objects.Robot;

public class LaserUpgrade extends Upgrade{
    private Robot robot;
    public LaserUpgrade(PowerModel model,Robot robot){
        super(30,model,"laser");
        this.robot=robot;
    }

    @Override
    public void expired() {
        robot.setLaserUpgrade(false);
        super.expired();
    }

    @Override
    public void refresh() {
        robot.setLaserUpgrade(true);
        super.refresh();
    }
}
