package sample;

import javafx.scene.image.ImageView;

public class MapObject extends ImageView {

    protected int c;
    protected int r;

    public MapObject(int r, int c){
        this.r=r;
        this.c=c;
        move(0,0);
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }
    public void move(int dr, int dc){
        if(r+dr >=0 && r+dr <=9 && c+dc<=9 && c+dc>=0) {
            r += dr;
            c += dc;
            setTranslateX(50 * c);
            setTranslateY(50 * r - 225);
        }
    }
}
