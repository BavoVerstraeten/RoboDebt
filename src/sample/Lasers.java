package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

import java.util.ArrayList;

public class Lasers {
    private ArrayList<Laser> lasers = new ArrayList<>();
    private ArrayList<Laser> gone = new ArrayList<>();
    private ArrayList<Laser> shot = new ArrayList<>();
    private Timeline timeline = new Timeline();
    private Controller controller;
    private GridPane pane;

    public Lasers(Controller controller,GridPane pane){
        this.pane=pane;
        this.controller=controller;
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.millis(250),
                        this::eachTick));
        timeline.play();
    }
    public void eachTick(ActionEvent a){
        for(Laser laser : lasers){
            laser.move();
            controller.checkCoin(laser.getR(),laser.getC());
        }
        lasers.removeAll(gone);
        gone.clear();
        lasers.addAll(shot);
        shot.clear();
    }
    public void addLaser(int r, int c, int direction){
        Laser laser = new Laser(r,c,direction,this);
        pane.getChildren().add(laser);
        shot.add(laser);
    }
    public void remove(Laser laser){
        gone.add(laser);
        pane.getChildren().remove(laser);
    }
}
