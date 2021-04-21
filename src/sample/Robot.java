package sample;

import javafx.scene.image.Image;

public class Robot extends MoveableMapObject {

    public Robot(){
        super(0,0,0);
        setViewOrder(-1);
        setImage(new Image("/RoboDebt/robot.png"));
    }


    public void move(int dr, int dc,int direction){
        this.direction=direction;
        super.move(dr,dc);
    }

}
