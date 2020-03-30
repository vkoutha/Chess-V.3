package pieces;

import game.Player;
import game.Pose;

import java.awt.image.BufferedImage;

public class Queen extends Piece {

    protected static BufferedImage[] SPRITE = {
            Piece.SPRITE_SHEET.getSubimage(229, 23, 410 - 229, 189 - 23),
            Piece.SPRITE_SHEET.getSubimage(229, 238, 410 - 229, 408 - 238)
    };

    public Queen(Player player, Pose pose) {
        super(player, pose);
    }
}
