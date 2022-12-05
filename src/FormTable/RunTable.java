package FormTable;

import javax.swing.*;

public class RunTable {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        //set image icon
        ImageIcon imageIcon = new ImageIcon("res/logo.png");
        JFrame jFrame = new JFrame("Form with table");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new FormJTable().getRootPanel());
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
