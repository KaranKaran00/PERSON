import java.awt.*;
import javax.swing.*;

public class person extends JPanel {

    int boardWidth = 500;
    int boardHeight = 500;

    Image backgroundImg;

    person() {
        backgroundImg = new ImageIcon(getClass().getResource("backgroundImg.png")).getImage();
        setPreferredSize(new Dimension(boardWidth, boardHeight));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // important!
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);
    }
}