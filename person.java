import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class person extends JPanel {

    int boardWidth = 800;
    int boardHeight = 500;

    Image backgroundImg;
    Image leftImg;
    Image rightImg;

    // person position
    int personX = boardWidth / 8;
    int personY = boardHeight / 2;
    int personWidth = 300;
    int personHeight = 200;

    class per1 {
        int x = personX;
        int y = personY;
        int width = personWidth;
        int height = personHeight;
        Image img;

        per1(Image img) {
            this.img = img;
        }
    }

    // game logic
    per1 per2;

    person() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        // setBackground(Color.blue);
        backgroundImg = new ImageIcon(getClass().getResource("backgroundImg.png")).getImage();
        leftImg = new ImageIcon(getClass().getResource("leftImg.png")).getImage();
        // rightImg = new ImageIcon(getClass().getResource("rightImg")).getImage();

        // person
        per2 = new per1(leftImg);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // background
        g.drawImage(backgroundImg, 0, 0, boardWidth, boardHeight, null);

        // person
        g.drawImage(per2.img, per2.x, per2.y, per2.width, per2.height, null);
    }
}
// check