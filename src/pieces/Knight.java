package pieces;

import game.Player;
import game.Pose;

import java.awt.image.BufferedImage;

public class Knight extends Piece {

    protected static BufferedImage[] SPRITE = {
            Piece.SPRITE_SHEET.getSubimage(665, 30, 823 - 665, 188 - 30),
            Piece.SPRITE_SHEET.getSubimage(665, 243, 823 - 665, 401 - 243)
    };

    public Knight(Player player, Pose pose) {
        super(player, pose);
        sprite = SPRITE[player.isPlayer1() ? 0 : 1];
    }
}
