package sample;

import javafx.scene.image.Image;


public class Laser extends MoveableMapObject{
    private final Lasers lasers;
    public Laser(int r, int c, int direction,Lasers lasers){
        super(r,c,direction);
        this.lasers=lasers;
        setImage(new Image("RoboDebt/laser.png"));
    }
    public void move(){
        int dr = Dvalues[direction][0];
        int dc = Dvalues[direction][1];
        if(r+dr<0 ||r+dr>9 || c+dc<0 || c+dc>9)
            lasers.remove(this);
        else
            move(dr,dc);
    }
}
