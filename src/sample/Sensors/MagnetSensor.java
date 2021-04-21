package sample.Sensors;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MagnetSensor extends ImageView {
    public MagnetSensor(){
        setImage(new Image("/RoboDebt/MagnetSensor.png"));
        setTranslateX(-100);
        setTranslateY(100);
        setVisible(false);
    }
}
