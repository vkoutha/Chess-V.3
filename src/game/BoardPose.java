package game;

import pieces.Piece;

import java.awt.*;
import java.util.ArrayList;

public class BoardPose extends Pose {

    private static Color LIGHT_TILE_COLOR = new Color(245, 212, 149);
    private static Color DARK_TILE_COLOR = new Color(130, 85, 0);
    private static Color SELECTED_OPTION_TILE_COLOR = new Color(255, 239, 66);
    public static int TILE_WIDTH = 100;
    public static int TILE_HEIGHT = 100;
    private Color color;
    private boolean isSelected, isOption;

    public BoardPose(int r, int c) {
        super(r, c);
        color = row + column % 2 == 0 ? LIGHT_TILE_COLOR : DARK_TILE_COLOR;
    }

    public void render(Graphics g) {
        g.setColor(isSelected || isOption ? SELECTED_OPTION_TILE_COLOR : color);
        g.fillRect(column * TILE_WIDTH, row * TILE_HEIGHT, TILE_WIDTH, TILE_HEIGHT);
    }

    public void reset() {
        isSelected = false;
        isOption = false;
    }

    public Piece getPiece() {
        ArrayList<Piece> pieces = new ArrayList<>(Main.getCurrentGame().getPlayer1().getPieces());
        pieces.addAll(Main.getCurrentGame().getPlayer2().getPieces());
        for (Piece p : pieces) {
            if (this.equals(p.getPose())) return p;
        }
        return null;
    }

    public boolean isOccupied() {
        return getPiece() != null;
    }

}
