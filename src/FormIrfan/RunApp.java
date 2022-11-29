package FormIrfan;

import javax.swing.*;

public class RunApp {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Data Bank");
        jf.setContentPane(new FormBank().getRootPanel());
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(500,400);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
