import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class person extends JPanel {

    int boardWidth = 500;
    int boardHeight = 500;

    Image backgroundImg;
    Image leftImg;
    Image rightImg;

    person() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        //setBackground(Color.blue);
        backgroundImg = new ImageIcon(getClass().getResource("backgroundImg.png")).getImage();
        // leftImg = new ImageIcon(getClass().getResource("leftImg")).getImage();
        // rightImg = new ImageIcon(getClass().getResource("rightImg")).getImage();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);
    }
}