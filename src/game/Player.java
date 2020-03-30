package game;

import pieces.*;

import java.awt.*;
import java.util.ArrayList;

public class Player {

    private ArrayList<Piece> pieces = new ArrayList<>();
    private boolean isPlayer1;
    public Player(boolean isPlayer1){
        this.isPlayer1 = isPlayer1;
    }

    public void initPieces(){
        var poseModifier = isPlayer1 ? 7 : 0;
        pieces.add(new Rook(this, new Pose(poseModifier, 0)));
        pieces.add(new Rook(this, new Pose(poseModifier, 7)));
        pieces.add(new Knight(this, new Pose(poseModifier, 1)));
        pieces.add(new Knight(this, new Pose(poseModifier, 6)));
        pieces.add(new Bishop(this, new Pose(poseModifier, 2)));
        pieces.add(new Bishop(this, new Pose(poseModifier, 5)));
        pieces.add(new Queen(this, new Pose(poseModifier, 3)));
        pieces.add(new King(this, new Pose(poseModifier, 4)));
        for(int i = 0; i <= 7; i++){
            pieces.add(new Pawn(this, new Pose(Math.abs(poseModifier - 1), i)));
        }
    }

    public boolean isPlayer1(){
        return isPlayer1;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void render(Graphics g){
        for(Piece p : pieces){
            p.render(g);
        }
    }

}
