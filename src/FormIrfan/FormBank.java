package FormIrfan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormBank {
    private JTextField textNomor;
    private JComboBox comboJenis;
    private JComboBox comboBank;
    private JTextField textNama;
    private JButton SIMPANButton;
    private JButton browseButton;
    private JTextArea textArea1;
    private JLabel iniImage;
    private JLabel form;
    private JPanel rootPanel;
    private JLabel nomor;

    public String namaGambar;

    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("fileBank.txt", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }

    public FormBank() {
        browseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser cariGambar = new JFileChooser();

                int showOpenDialogue = cariGambar.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    File gambarTerpilih = cariGambar.getSelectedFile();
                    String gambarPath = gambarTerpilih.getAbsolutePath();

                    namaGambar = cariGambar.getSelectedFile().getName();

                    ImageIcon gambar = new ImageIcon(gambarPath);
                    Image image = gambar.getImage().getScaledInstance(iniImage.getWidth(), iniImage.getHeight(), Image.SCALE_SMOOTH);

                    iniImage.setIcon(new ImageIcon(image));
                }

            }
        });
        SIMPANButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String no = textNomor.getText();
                String atm = (String) comboJenis.getSelectedItem();
                String bank = (String) comboBank.getSelectedItem();
                String nama = textNama.getText();

                User data = new User();
                data.setNomor(no);
                data.setATM(atm);
                data.setBank(bank);
                data.setNama(nama);

                String hasil = "Tersimpan!" + "\nNo Kartu = " + no + "\nJenis ATM = " + atm + "\nBank = " + bank +
                        "\nNama Pemilik = " + nama + "\nNama File Gambar = " + namaGambar;

                textArea1.append(hasil);

                try {
                    insertingDataToFile(hasil + "\n\n");
                    namaGambar = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    public JPanel getRootPanel(){
        return rootPanel;
    }
}

