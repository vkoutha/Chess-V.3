package pieces;

import game.Player;
import game.Pose;

import java.awt.image.BufferedImage;

public class King extends Piece {

    protected static BufferedImage[] SPRITE = {
            Piece.SPRITE_SHEET.getSubimage(24, 25, 188 - 24, 191 - 25),
            Piece.SPRITE_SHEET.getSubimage(24, 238, 188 - 24, 404 - 238)
    };

    public King(Player player, Pose pose) {
        super(player, pose);
        sprite = SPRITE[player.isPlayer1() ? 0 : 1];
    }
}
