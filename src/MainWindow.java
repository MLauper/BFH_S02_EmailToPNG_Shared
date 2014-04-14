import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Marco on 15.03.14.
 */
public class MainWindow extends JFrame {
    private JButton clickButton;
    private JPanel rootPanel;
    private JTextField textField1;
    private JLabel eMailLabel;
    private JButton saveImageButton;
    private StringImage eMailImage;

    public MainWindow() {
        super("Email to PMG Converter");
        pack();
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(650,500);

        this.eMailImage = new StringImage();
        eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));

        setVisible(true);


        //this.eMailImage.setString("teststring");

        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //JOptionPane.showConfirmDialog(MainWindow.this, "MyDialog");
               eMailImage.setString(textField1.getText());
               eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));
            }
        });
        saveImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eMailImage.saveImage();
            }
        });

        textField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                eMailImage.setString(textField1.getText());
                eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                eMailImage.setString(textField1.getText());
                eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                eMailImage.setString(textField1.getText());
                eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));
            }
        });

    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();


    }

}
