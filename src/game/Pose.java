package game;

public class Pose {

    protected int row, column;
    public Pose(int r, int c){
        row = r;
        column = c;
    }

    public void setRow(int r){
        row = r;
    }

    public void setColumn(int c){
        column = c;
    }

    public int getRow(){
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o){
        Pose pose = (Pose) o;
        return row == pose.getRow() && column == pose.getColumn();
    }
}
