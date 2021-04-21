package sample.Objects;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Robot extends MoveableMapObject {

    private boolean laserUpgrade;
    private boolean magnetUpgrade;

    public void setLaserUpgrade(boolean laserUpgrade) {
        this.laserUpgrade = laserUpgrade;
    }

    public void setMagnetUpgrade(boolean magnetUpgrade) {
        this.magnetUpgrade = magnetUpgrade;
    }

    public Robot(){
        super(0,0,0);
        setViewOrder(-1);
        setImage(new Image("/RoboDebt/robot.png"));
    }


    public List<Integer> move(int dr, int dc, int direction){
        this.direction=direction;
        super.move(dr,dc);
        if(!magnetUpgrade)
        return  Arrays.asList(r,c);
        ArrayList<Integer> spotsToCheck = new ArrayList<>();
        for(int i =-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if(r+i>=0&&r+i<=9&&j+c>=0&&j+c<=9)
                    spotsToCheck.addAll(Arrays.asList(r+i,c+j));
            }
        }
        return spotsToCheck;
    }

    @Override
    public int[] getDirection() {
        if(!laserUpgrade)
        return super.getDirection();
        return new int[]{0,1,2,3};
    }
}
