import java.awt.*;
import javax.swing.*;

public class Mine extends JPanel {
	JButton mineToggle;
	int numberOfNeighboringMines;
	boolean isMine;
	
	public Mine(int x, int y) {
		isMine = false;
		numberOfNeighboringMines = 0;
		mineToggle = new JButton();
		mineToggle.setBounds(5 + x * 35, 5 + y * 35, 30, 30);
	}
	
	public void addMine() {
		isMine = true;
	}
}
