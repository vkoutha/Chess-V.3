package pieces;

import game.BoardPose;
import game.Player;
import game.Pose;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public abstract class Piece {

    protected static BufferedImage SPRITE_SHEET;
    public static AudioInputStream SOUND_EFFECT;
    private Player player;
    private Pose pose;
    protected BufferedImage sprite;

    public Piece() {
        this(new Player(false), new Pose(-1, -1));
    }

    public Piece(Player player, Pose pose) {
        this.player = player;
        this.pose = pose;
    }

    public void setPose(Pose p) {
        pose = p;
    }

    public void render(Graphics g) {
        g.drawImage(sprite, pose.getColumn() * BoardPose.TILE_WIDTH,
                pose.getRow() * BoardPose.TILE_HEIGHT,
                BoardPose.TILE_WIDTH, BoardPose.TILE_HEIGHT, null);
    }

    public Player getPlayer() {
        return player;
    }

    public Pose getPose() {
        return pose;
    }

    static {
        try {
            SPRITE_SHEET = ImageIO.read(Piece.class.getResource("/img/chessSpriteSheet.png"));
            SOUND_EFFECT = AudioSystem.getAudioInputStream(Piece.class.getResource("/sound/pieceSoundEffect.wav"));
        } catch (IOException e) {
            System.err.println("Error reading sprite sheet from file");
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            System.err.println("Unsupported audio file type");
            e.printStackTrace();
        }
    }

}
