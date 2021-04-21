package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

import java.util.*;

public class Model {

    private Random rg = new Random();
    private int timer = rg.nextInt(2);

    private Coin[][] map = new Coin[10][10];

    private Timeline timeline = new Timeline();
    private GridPane pane;
    private Robot robot;
    public Model(GridPane pane,Robot robot){
        this.robot=robot;
        this.pane=pane;
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.millis(250),
                        this::eachTick));
        timeline.play();
    }
    public void eachTick(ActionEvent a){
        timer--;
        if(timer==-1){
            timer=rg.nextInt(2);
            int r = rg.nextInt(10);
            int c = rg.nextInt(10);
            if(map[r][c]==null && (r!=robot.getR() || c!=robot.getC())) {
                TreeMap<Double,Coin> tree=new TreeMap<>();
                ArrayList<Coin> coins = new ArrayList<>(Arrays.asList(new OneCoin(r, c), new FiveCoin(r, c), new TwentyCoin(r, c)));
                double count = 0.0;
                for(Coin entry : coins){
                    tree.put(count,entry);
                    count+=entry.getWeight();
                }
                double num = rg.nextDouble() * count;
                Coin coin = tree.get(tree.floorKey(num));
                map[r][c]=coin;
                pane.getChildren().add(coin);
            }
        }
    }
    public int checkCoin(int r, int c){
        if(map[r][c]!=null){
            Coin coin = map[r][c];
            pane.getChildren().remove(coin);
            map[r][c]=null;
            return coin.getValue();
        }
        return 0;
    }

}
