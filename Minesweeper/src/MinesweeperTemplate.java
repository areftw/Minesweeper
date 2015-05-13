import java.awt.*;
import java.lang.reflect.Array;
import javax.swing.*;

public class MinesweeperTemplate extends JPanel {
	private static final int WIDTH = 1055;
	private static final int LENGTH = 585;
	public MinesweeperTemplate()                       // set up graphics window
    {
        super();
        setBackground(Color.WHITE);
        this.setLayout(null);
    }
	
    public static void main(String[] args)
    {
    	MinesweeperTemplate panel = new MinesweeperTemplate();                            // window for drawing
        JFrame application = new JFrame();                            // the program itself
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // set frame to exit
                                                                      // when it is closed
        application.add(panel);           

        application.setSize(WIDTH, LENGTH);
        
        Mine[][] mineHolder = new Mine[30][16];
        for (int i = 0; i < 30; i++) {
        	for (int j = 0; j < 16; j++) {
        		Mine mine = new Mine(i , j);
        		mineHolder[i][j] = mine;
                panel.add(mine.mineToggle);
        	}
        }

        application.setVisible(true);
    }
}
