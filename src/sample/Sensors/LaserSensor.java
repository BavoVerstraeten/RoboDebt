package sample.Sensors;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LaserSensor extends ImageView {
    public LaserSensor(){
        setImage(new Image("/RoboDebt/LaserSensor.png"));
        setTranslateX(-100);
        setTranslateY(-100);
        setVisible(false);
    }
}
