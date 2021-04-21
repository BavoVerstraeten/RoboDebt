package sample.Upgrades;

import sample.Models.PowerModel;
import sample.Objects.Robot;

public class MagnetUpgrade extends Upgrade{
    private Robot robot;
    public MagnetUpgrade(PowerModel model, Robot robot){
        super(30,model);
        this.robot=robot;
        robot.magnetUpgrade(1);
    }
    @Override
    public void expired() {
        robot.magnetUpgrade(-1);
        super.expired();
    }
}
