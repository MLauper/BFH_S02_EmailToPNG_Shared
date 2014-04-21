import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Provides a StringImage. Basically provides the functionality to convert a simple string to an image.
 */
public class StringImage extends Image {
    private String string;
    private Graphics graphicsImage;

    /**
     * Class Constructor.
     * Create an Image based on the provided String
     * Image Size: 500x42
     * @param string to be represented by the image.
     */
    public StringImage(String string) {
        bufferedImage = new BufferedImage(500, 42, BufferedImage.TYPE_INT_ARGB);
        this.string = string;
        this.renderImage();
    }

    /**
     * Class Constructor. Create an Image which is completely transparent.
     * Image Size: 500x42
     */
    public StringImage() {
        bufferedImage = new BufferedImage(500, 42, BufferedImage.TYPE_INT_ARGB);
    }

    /**
     * Change the string represented by the image.
     * @param string to be represented by the image.
     */
    public void setString(String string) {
        this.string = string;
        bufferedImage = new BufferedImage(500, 42, BufferedImage.TYPE_INT_ARGB);
        this.renderImage();
    }

    /**
     * Render the image based on the current string.
     */
    private void renderImage() {
        graphicsImage = bufferedImage.createGraphics();

        graphicsImage.setFont(new Font("Serif", Font.PLAIN, 36));
        graphicsImage.setColor(Color.BLUE);

        graphicsImage.drawString(string, 10, 32);
        graphicsImage.dispose();

    }
}
