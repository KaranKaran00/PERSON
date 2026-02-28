<<<<<<< HEAD
import javax.swing.*;

public class app {
    public static void main(String[] args) {
        int boardWidth = 500;
        int boardHeight = 500;

        JFrame frame = new JFrame("PERSON");

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        person Person = new person();
        frame.add(Person);
        frame.pack();
        frame.requestFocus();

        frame.setVisible(true);
    }
=======
import javax.swing.*;

public class app {
    public static void main(String[] args) {
        int boardWidth = 500;
        int boardHeight = 500;

        JFrame frame = new JFrame("PERSON");

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
>>>>>>> 3dde41b9378a022b0a9262c392da3a28f58f9760
}