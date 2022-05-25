import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class Main implements ActionListener {
    public static void main(String[]args) throws IOException {
        Main game = new Main();
    }
    JButton button;
    JFrame frame;
    Main() throws IOException {
        frame = new JFrame("Game");
        ImageIcon image = new ImageIcon(new URL("https://www.oregoncoast.org//imager/files_idss_com/C346/e76b236c-a805-4149-86fc-05e06144b9ef_34885bcf6c3d525ea7d8d3955ff2e09f.jpg"));
        JLabel label = new JLabel(image);
        JLabel title = new JLabel("Mini Arcade");
        title.setSize(800, 200);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setForeground(Color.GREEN);
        title.setFont(new Font("MV Boli", Font.BOLD, 126));
        ImageIcon game = new ImageIcon(new URL("https://imaligor.files.wordpress.com/2009/06/screenhunter_18-jun-23-16-36.gif"));
        button = new JButton();
        button.setIcon(game);
        button.setFocusable(false);
        button.setBounds(295, 325, 215, 100);
        button.addActionListener(this);
        label.add(title);
        frame.add(button);
        frame.add(label);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            Introduction window = new Introduction();
        }
    }
}