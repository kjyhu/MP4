import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game1 implements ActionListener {
    JFrame frame = new JFrame("Game1");
    JLabel table = new JLabel();
    JPanel background = new JPanel();
    JLabel circus = new JLabel();
    Game1() {
        ImageIcon image = new ImageIcon("Background.png");
        Image resize = image.getImage();
        Image finalImage = resize.getScaledInstance(800,600,java.awt.Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(finalImage);
        ImageIcon image2 = new ImageIcon("Table.png");
        Image resize2 = image2.getImage();
        Image finalImage2 = resize2.getScaledInstance(300,300,java.awt.Image.SCALE_SMOOTH);
        ImageIcon im2 = new ImageIcon(finalImage2);
        circus.setIcon(im);
        table.setIcon(im2);
        background.add(circus);
        background.add(table);
        frame.add(background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setBackground(Color.BLUE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
