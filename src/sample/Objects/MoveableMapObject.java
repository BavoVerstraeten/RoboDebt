package sample.Objects;

import sample.Objects.MapObject;

public class MoveableMapObject extends MapObject {



    protected int direction;
    int[][] Dvalues = new int[][]{new int[]{-1,0},new int[]{0,1},new int[]{1,0},new int[]{0,-1}};

    public MoveableMapObject(int r, int c,int direction){
        super(r, c);
        this.direction=direction;
        move(0,0);
    }
    public int[] getDirection() {
        return new int[]{direction};
    }

    @Override
    public void move(int dr, int dc) {
        setRotate(90*direction);

        super.move(dr, dc);
    }
}
