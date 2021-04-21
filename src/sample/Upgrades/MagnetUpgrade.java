package sample.Upgrades;

import sample.Models.PowerModel;
import sample.Objects.Robot;

public class MagnetUpgrade extends Upgrade{
    private Robot robot;
    public MagnetUpgrade(PowerModel model,Robot robot){
        super(30,model,"magnet");
        this.robot=robot;
    }

    @Override
    public void expired() {
        robot.setMagnetUpgrade(false);
        super.expired();
    }

    @Override
    public void refresh() {
        robot.setMagnetUpgrade(true);
        super.refresh();
    }
}
