package game;

import pieces.Piece;

import java.awt.*;
import java.util.ArrayList;

public class GameInstance {

    private String gameName;
    private Player player1, player2, currentPlayer;
    private BoardPose[][] board = new BoardPose[8][8];

    public GameInstance() {
        this(new Player(true), new Player(false), "");
    }

    public GameInstance(String gameName){
        this(new Player(true), new Player(false), gameName);
    }

    public GameInstance(Player player1, Player player2, String gameName) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameName = gameName;
        currentPlayer = player1;
        for (int r = 0; r <= 7; r++) {
            for (int c = 0; c <= 7; c++) {
                board[r][c] = new BoardPose(r, c);
            }
        }
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void render(Graphics g){

    }

    private class GameState {
        private ArrayList<ArrayList<Piece>> player1Pieces = new ArrayList<>();
        private ArrayList<ArrayList<Piece>> player2Pieces = new ArrayList<>();

        public void addLatestState() {
            player1Pieces.add(player1.getPieces());
            player2Pieces.add(player2.getPieces());
        }

    }

}
