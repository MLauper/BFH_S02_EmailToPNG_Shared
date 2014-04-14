/**
 * Created by Marco on 15.03.14.
 */
public class ImageTester {
    public static void main(String[] args) {
        Image myImage = new Image("bld.jpg");
        System.out.println(myImage.toString());
        myImage.saveImage("bld2.jpg");
    }
}
