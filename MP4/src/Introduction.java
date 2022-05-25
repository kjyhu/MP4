import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Introduction implements ActionListener {
    JFrame frame = new JFrame("Instructions");
    JLabel label = new JLabel("Instructions");
    JLabel descriptions = new JLabel("<html>Welcome to Mini Arcade. Here, you'll play a series of mini games. Although there is no prize<br/> for winning the game, I can guarantee that you'll experience a lot of fun here. The arcade <br/> consists of five games, you can select each by clicking on the game that you want to play <br/> when you are ready click the continue button to move on.</html>");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel(new BorderLayout());
    JButton proceed = new JButton();
    Introduction()  {
        panel3.setBounds(800, 400, 200, 200);
        label.setFont(new Font("MV Boli", Font.PLAIN, 48));
        label.setPreferredSize(new Dimension(600, 200));
        descriptions.setFont(new Font("Verdana", Font.PLAIN, 16));
        ImageIcon image = new ImageIcon("Continue.png");
        Image resize = image.getImage();
        Image finalImage = resize.getScaledInstance(400,200,java.awt.Image.SCALE_SMOOTH);
        ImageIcon im = new ImageIcon(finalImage);
        proceed.setIcon(im);
        proceed.addActionListener(this);
        label.setForeground(Color.GREEN);
        frame.getContentPane().setBackground(Color.blue);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        panel1.setPreferredSize(new Dimension(200,100));
        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.ORANGE);
        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.NORTH);
        panel3.add(proceed);
        frame.add(panel3);
        frame.add(panel2);
        panel1.add(label);
        panel2.add(descriptions, BorderLayout.CENTER);
        panel2.add(proceed, BorderLayout.PAGE_END);
        proceed.setBounds(200,200,100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setBackground(Color.BLUE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == proceed) {
            frame.dispose();
            Game1 game = new Game1();
        }
    }
}