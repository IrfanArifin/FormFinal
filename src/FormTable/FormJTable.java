package FormTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormJTable {
    private JButton SIMPANButton;
    private JTextField textNama;
    private JTextField textNim;
    private JComboBox comboJurusan;
    private JTable table;
    private JPanel rootPanel;
    private DefaultTableModel tableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public FormJTable() {
        this.initComponents();
        SIMPANButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nim = textNim.getText();
                String jurusan = (String) comboJurusan.getSelectedItem();
                if (nama.isBlank() ||nim.isBlank() ||jurusan.isBlank()){
                    JOptionPane.showMessageDialog(rootPanel,
                            "Lengkapi data anda",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }else{
                    tableModel.addRow(new Object[]{nama, nim, jurusan});
                    //clear textfields
                    textNama.setText("");
                    textNim.setText("");
                    comboJurusan.getSelectedItem();
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom = {
                "Nama",
                "NIM",
                "Jurusan"
        };
        Object[][] iniData = {
        };
        tableModel = new DefaultTableModel(iniData, tableColom);
        //set table model
        table.setModel(tableModel);
        //menampilkan sorting disetiap kolom
        table.setAutoCreateRowSorter(true);
        //enable single selection
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }
}
