import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
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
        setSize(650, 500);

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

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 1, new Insets(30, 30, 30, 30), -1, -1));
        rootPanel.setBorder(BorderFactory.createTitledBorder(null, "Email To PNG", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font(rootPanel.getFont().getName(), rootPanel.getFont().getStyle(), rootPanel.getFont().getSize())));
        clickButton = new JButton();
        clickButton.setText("Render eMail");
        rootPanel.add(clickButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textField1 = new JTextField();
        rootPanel.add(textField1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        eMailLabel = new JLabel();
        eMailLabel.setText("");
        rootPanel.add(eMailLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        saveImageButton = new JButton();
        saveImageButton.setText("Save eMail");
        saveImageButton.setMnemonic('S');
        saveImageButton.setDisplayedMnemonicIndex(0);
        rootPanel.add(saveImageButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
