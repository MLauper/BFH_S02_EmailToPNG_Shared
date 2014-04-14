import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Marco on 15.03.14.
 */
public class Image {
    BufferedImage bufferedImage;

    public Image() {
        bufferedImage = null;
    }

    public Image(String relativePath) {
        loadImage(relativePath);
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void loadImage(String relativePath) {
        try {
            bufferedImage = ImageIO.read(new File(relativePath));
        } catch (IOException e) {
            //TODO: Add proper exception handler if file isn't available...
            e.printStackTrace();
        }
    }

    public void saveImage(String relativePath) {
        File saveFile = new File(relativePath);

        //JFileChooser chooser = new JFileChooser();
        //chooser.setSelectedFile(saveFile);
        //int rval = chooser.showSaveDialog(cb);
//        if (rval == JFileChooser.APPROVE_OPTION) {
//            saveFile = chooser.getSelectedFile();
//                 /* Write the filtered image in the selected format,
//                  * to the file chosen by the user.
//                  */
        try {
            ImageIO.write(bufferedImage, "PNG", saveFile);
        } catch (IOException ex) {
        }
    }
    public void saveImage(){
        java.awt.FileDialog dialog = new FileDialog((java.awt.Frame)null, "Save as...", FileDialog.SAVE);
        dialog.setFile("EmailPNG.png");
        dialog.setVisible(true);
        System.out.println(dialog.getDirectory());
        System.out.println(dialog.getFile());

        saveImage(dialog.getDirectory() + dialog.getFile());


    }
}