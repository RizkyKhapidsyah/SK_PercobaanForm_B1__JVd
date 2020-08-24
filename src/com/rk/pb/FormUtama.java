import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormUtama extends JFrame {
    JLabel LabelNIK;
    JLabel LabelNamaKaryawan;
    JLabel LabelJabatan;
    JLabel LabelAlamat;
    JLabel LabelEmail;
    JLabel LabelNomorTelepon;
    JLabel LabelTD1;
    JLabel LabelTD2;
    JLabel LabelTD3;
    JLabel LabelTD4;
    JLabel LabelTD5;
    JLabel LabelTD6;
    JTextField TextNIK;
    JTextField TextNamaKaryawan;
    JComboBox cmbJabatan;
    JTextField TextAlamat;
    JTextField TextEmail;
    JTextField TextNomorTelepon;

    public FormUtama() {
        FormUtamaLayout customLayout = new FormUtamaLayout();

        getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 12));
        getContentPane().setLayout(customLayout);

        LabelNIK = new JLabel("NIK");
        getContentPane().add(LabelNIK);

        LabelNamaKaryawan = new JLabel("Nama Karyawan");
        getContentPane().add(LabelNamaKaryawan);

        LabelJabatan = new JLabel("Jabatan");
        getContentPane().add(LabelJabatan);

        LabelAlamat = new JLabel("Alamat");
        getContentPane().add(LabelAlamat);

        LabelEmail = new JLabel("Email");
        getContentPane().add(LabelEmail);

        LabelNomorTelepon = new JLabel("Nomor Telepon");
        getContentPane().add(LabelNomorTelepon);

        LabelTD1 = new JLabel(":");
        getContentPane().add(LabelTD1);

        LabelTD2 = new JLabel(":");
        getContentPane().add(LabelTD2);

        LabelTD3 = new JLabel(":");
        getContentPane().add(LabelTD3);

        LabelTD4 = new JLabel(":");
        getContentPane().add(LabelTD4);

        LabelTD5 = new JLabel(":");
        getContentPane().add(LabelTD5);

        LabelTD6 = new JLabel(":");
        getContentPane().add(LabelTD6);

        TextNIK = new JTextField("");
        getContentPane().add(TextNIK);

        TextNamaKaryawan = new JTextField("");
        getContentPane().add(TextNamaKaryawan);

        cmbJabatan = new JComboBox();
        cmbJabatan.addItem("Embedded System Programmer");
        cmbJabatan.addItem("Desktop Software Developer");
        cmbJabatan.addItem("IT Engineer");
        cmbJabatan.addItem("IT Programmer");
        cmbJabatan.addItem("Network Administrator");
        cmbJabatan.addItem("Database Administrator");
        cmbJabatan.addItem("Office Boy");
        getContentPane().add(cmbJabatan);

        TextAlamat = new JTextField("");
        getContentPane().add(TextAlamat);

        TextEmail = new JTextField("");
        getContentPane().add(TextEmail);

        TextNomorTelepon = new JTextField("");
        getContentPane().add(TextNomorTelepon);

        setSize(getPreferredSize());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        FormUtama window = new FormUtama();

        window.setTitle("FormUtama");
        window.pack();
        window.show();
    }
}

class FormUtamaLayout implements LayoutManager {

    public FormUtamaLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 373 + insets.left + insets.right;
        dim.height = 215 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+8,72,24);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+40,72,24);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+72,72,24);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+104,72,24);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+136,72,24);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+168,72,24);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+152,insets.top+8,16,24);}
        c = parent.getComponent(7);
        if (c.isVisible()) {c.setBounds(insets.left+152,insets.top+40,16,24);}
        c = parent.getComponent(8);
        if (c.isVisible()) {c.setBounds(insets.left+152,insets.top+72,16,24);}
        c = parent.getComponent(9);
        if (c.isVisible()) {c.setBounds(insets.left+152,insets.top+104,16,24);}
        c = parent.getComponent(10);
        if (c.isVisible()) {c.setBounds(insets.left+152,insets.top+136,16,24);}
        c = parent.getComponent(11);
        if (c.isVisible()) {c.setBounds(insets.left+152,insets.top+168,16,24);}
        c = parent.getComponent(12);
        if (c.isVisible()) {c.setBounds(insets.left+160,insets.top+8,200,24);}
        c = parent.getComponent(13);
        if (c.isVisible()) {c.setBounds(insets.left+160,insets.top+40,200,24);}
        c = parent.getComponent(14);
        if (c.isVisible()) {c.setBounds(insets.left+160,insets.top+72,200,24);}
        c = parent.getComponent(15);
        if (c.isVisible()) {c.setBounds(insets.left+160,insets.top+104,200,24);}
        c = parent.getComponent(16);
        if (c.isVisible()) {c.setBounds(insets.left+160,insets.top+136,200,24);}
        c = parent.getComponent(17);
        if (c.isVisible()) {c.setBounds(insets.left+160,insets.top+168,200,24);}
    }
}
