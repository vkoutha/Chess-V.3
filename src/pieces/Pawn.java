package pieces;

import game.Player;
import game.Pose;

import java.awt.image.BufferedImage;

public class Pawn extends Piece {

    protected static BufferedImage[] SPRITE = {
            Piece.SPRITE_SHEET.getSubimage(1113, 39, 1228 - 1113, 190 - 39),
            Piece.SPRITE_SHEET.getSubimage(1113, 253, 1228 - 1113, 403 - 253)
    };

    public Pawn(Player player, Pose pose) {
        super(player, pose);
        sprite = SPRITE[player.isPlayer1() ? 0 : 1];
    }

}
