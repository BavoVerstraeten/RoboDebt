package sample;

import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import sample.Models.Lasers;
import sample.Models.Model;
import sample.Objects.Robot;

import java.util.List;
import java.util.Map;

public class Controller {

    public GridPane hoofd;
    public Label score;
    private Model model ;
    private Robot robot=new Robot();
    private Lasers lasers ;
    private int coins=0;

    public void initialize(){
        score.setFont(Font.font ("Verdana", 20));
        lasers=new Lasers(this,hoofd);
        model= new Model(hoofd,robot);
        Polygon poly = new Polygon(0,0,500,0,500,500,0,500);
        poly.setFill(Color.GRAY);
        hoofd.getChildren().add(poly);
        hoofd.getChildren().add(robot);
        poly.setOnKeyPressed(this::move);
        poly.setFocusTraversable(true);
        poly.requestFocus();
    }
    public void move(KeyEvent e){
        Map<KeyCode,Runnable> actions = Map.of(KeyCode.UP,()->robotMove(-1,0,0),KeyCode.DOWN,()->robotMove(1,0,2),
                KeyCode.LEFT,()->robotMove(0,-1,3),KeyCode.RIGHT,()->robotMove(0,1,1),
                KeyCode.SPACE,this::makeLaser);
        if(actions.containsKey(e.getCode())) {
           actions.get(e.getCode()).run();
        }
    }
    public void robotMove(int r, int c,int direction){
        List<Integer> spotsToCheck=robot.move(r,c,direction);
        for(int i =0;i<spotsToCheck.size();i+=2)
            checkCoin(spotsToCheck.get(i),spotsToCheck.get(i+1));
    }

    public void checkCoin(int r, int c){
            coins+= model.checkCoin(r,c);
            score.setText("score : "+coins);
    }
    public void makeLaser(){
        for(int direction : robot.getDirection())
        lasers.addLaser(robot.getR(), robot.getC(), direction);
    }

}
