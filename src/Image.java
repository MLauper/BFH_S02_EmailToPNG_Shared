import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Provides a custom Image Object. provides default values and functions to handle an Image.
 */
public class Image {
    BufferedImage bufferedImage;

    /**
     * Class Constructor
     * Creates an empty image (null).
     */
    public Image() {
        bufferedImage = null;
    }

    /**
     * Class Constructor
     * Load an image from a relative path.
     * @param relativePath the relative path to the image which is loaded
     */
    public Image(String relativePath) {
        loadImage(relativePath);
    }

    /**
     * Returns a plain BufferedImage Object
     * @return the image stored in the object
     */
    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    /**
     * Load a new image into the object. The old image will be removed.
     * @param relativePath  the relative path to the image which is loaded
     */
    public void loadImage(String relativePath) {
        try {
            bufferedImage = ImageIO.read(new File(relativePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves the current image as PNG.
     * @param relativePath the relative path to the image where it should be stored
     */
    public void saveImage(String relativePath) {
        File saveFile = new File(relativePath);

        try {
            ImageIO.write(bufferedImage, "PNG", saveFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves the Image. Provides an AWT GUI-Dialog to ask user where to store the file.
     */
    public void saveImageDialog() {
        java.awt.FileDialog dialog = new FileDialog((java.awt.Frame) null, "Save as...", FileDialog.SAVE);
        dialog.setFile("EmailPNG.png");
        dialog.setVisible(true);
        System.out.println(dialog.getDirectory());
        System.out.println(dialog.getFile());
        saveImage(dialog.getDirectory() + dialog.getFile());
    }
}