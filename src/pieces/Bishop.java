package pieces;

import game.Player;
import game.Pose;

import java.awt.image.BufferedImage;

public class Bishop extends Piece {

    protected static BufferedImage[] SPRITE = {
            Piece.SPRITE_SHEET.getSubimage(452, 23, 614 - 452, 187 - 23),
            Piece.SPRITE_SHEET.getSubimage(452, 236, 614 - 452, 400 - 236)
    };

    public Bishop(Player player, Pose pose) {
        super(player, pose);
        sprite = SPRITE[player.isPlayer1() ? 0 : 1];
    }
}
