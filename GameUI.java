import Object.*;
import javax.swing.*;

public class GameUI extends JFrame {
    private GameObject[] components;
    private GameLogic game;

    public GameUI(){
        game = new GameLogic();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
    }
}
