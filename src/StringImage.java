import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Marco on 15.03.14.
 */
public class StringImage extends Image{
    private String string;
    private Graphics graphicsImage;

    public Graphics getGraphicsImage() {
        return graphicsImage;
    }
    public StringImage(String string) {
        //super("bld.jpg");
        bufferedImage = new BufferedImage(500,42,BufferedImage.TYPE_INT_ARGB);
        this.string = string;
        this.renderImage();
    }

    public StringImage() {
        bufferedImage = new BufferedImage(500,42,BufferedImage.TYPE_INT_ARGB);
        //this.string = string;
        //this.renderImage();
    }

    public String getString() {
        return string;
    }

    private void renderImage(){
        //Work with BufferedImage
        //-> Has a ColorModel and a Raster
        graphicsImage = bufferedImage.createGraphics();

        graphicsImage.setFont(new Font("Serif", Font.BOLD, 20));
        //FontMetrics fm = graphicsImage.getFontMetrics();
            System.out.println(graphicsImage.getFont());
            System.out.println(string);
        Font font = new Font("Serif", Font.PLAIN, 36);
        graphicsImage.setFont(font);
        //FontRenderContext frc = ((Graphics2D)graphicsImage).getFontRenderContext();
        graphicsImage.setColor(Color.BLUE);

        graphicsImage.drawString(string,10,32);
        graphicsImage.dispose();

    }

    public void setString(String string){
        this.string = string;
        bufferedImage = new BufferedImage(500,42,BufferedImage.TYPE_INT_ARGB);
        this.renderImage();
    }

    private BufferedImage getImage(){
        this.renderImage();
        return bufferedImage;
    }

//    @Override
//    public void saveImage(String relativePath) {
//        File saveFile = new File(relativePath);
//        new java.awt.FileDialog((java.awt.Frame) null).setVisible(true);
//        //JFileChooser chooser = new JFileChooser();
//        //chooser.setSelectedFile(saveFile);
//        //int rval = chooser.showSaveDialog(cb);
////        if (rval == JFileChooser.APPROVE_OPTION) {
////            saveFile = chooser.getSelectedFile();
////                 /* Write the filtered image in the selected format,
////                  * to the file chosen by the user.
////                  */
//        try {
//            ImageIO.write(graphicsImage, "PNG", saveFile);
//        } catch (IOException ex) {
//        }
//    }
}
