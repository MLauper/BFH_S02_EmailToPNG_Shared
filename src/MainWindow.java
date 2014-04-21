import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Provides Main Gui for the Application
 */
public class MainWindow extends JFrame {
    private JTextField eMailTextField;
    private JLabel eMailLabel;
    private StringImage eMailImage;

    public MainWindow() {

        // Create new Window
        super("Email to PMG Converter");

        // Create JPanel and add GUI Elemetns
        JPanel rootPanel = new JPanel();
        eMailTextField = new JTextField("E-Mail Adresse", 40);
        eMailTextField.setFont(new Font("Serif", Font.BOLD, 20));
        rootPanel.add(eMailTextField, BorderLayout.NORTH);
        eMailLabel = new JLabel();
        eMailLabel.setText("");
        rootPanel.add(eMailLabel, BorderLayout.SOUTH);
        JButton saveImageButton = new JButton();
        saveImageButton.setText("Save Image");
        rootPanel.add(saveImageButton, BorderLayout.EAST);
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(650, 150);

        // Setup GUI Elements
        this.eMailImage = new StringImage();
        eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));

        saveImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eMailImage.saveImageDialog();
            }
        });
         eMailTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                eMailImage.setString(eMailTextField.getText());
                eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                eMailImage.setString(eMailTextField.getText());
                eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                eMailImage.setString(eMailTextField.getText());
                eMailLabel.setIcon(new ImageIcon(eMailImage.getBufferedImage()));
            }
        });

        //Show Window
        setVisible(true);
     }

    public static void main(String[] args) {
        new MainWindow();
    }

}