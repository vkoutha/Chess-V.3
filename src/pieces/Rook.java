package pieces;

import game.Player;
import game.Pose;

import java.awt.image.BufferedImage;

public class Rook extends Piece {

    protected static BufferedImage[] SPRITE = {
            Piece.SPRITE_SHEET.getSubimage(892, 39, 1027 - 892, 188 - 39),
            Piece.SPRITE_SHEET.getSubimage(892, 253, 1027 - 892, 401 - 253)
    };

    public Rook(Player player, Pose pose){
        super(player, pose);
        sprite = SPRITE[player.isPlayer1() ? 0 : 1];
    }

}
