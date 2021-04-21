package sample.Models;

import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import sample.Sensors.LaserSensor;
import sample.Sensors.MagnetSensor;
import sample.Upgrades.LaserUpgrade;
import sample.Upgrades.MagnetUpgrade;
import sample.Objects.Robot;
import sample.Upgrades.Upgrade;

import java.util.Map;

public class PowerModel {
    private Robot robot;

    private Map<String, ImageView> sensors = Map.of("magnet",new MagnetSensor(),"laser",new LaserSensor());
    private Map<String,Upgrade> upgradeTimers;

    public PowerModel(Robot robot, GridPane pane){
        for(ImageView sensor : sensors.values()){
            pane.getChildren().add(sensor);
        }
        this.robot =robot;
        upgradeTimers=Map.of("magnet",new MagnetUpgrade(this,robot),"laser",new LaserUpgrade(this,robot));
    }

    public void eachTick(){
        for(Upgrade timer : upgradeTimers.values()){
            timer.decrease();
        }
    }
    public void newPower(String name){
        upgradeTimers.get(name).refresh();
        sensors.get(name).setVisible(true);
    }
    public void expired(String name){
        sensors.get(name).setVisible(false);
    }
}
