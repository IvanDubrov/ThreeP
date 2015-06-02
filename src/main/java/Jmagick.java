import magick.ImageInfo;
import magick.MagickException;
import magick.MagickImage;

/**
 * Created by Ivan on 28.05.2015.
 */
public class Jmagick {
    public static void main(String a[]) throws MagickException {
        ImageInfo info = new ImageInfo("img/1.jpg");
        MagickImage image = new MagickImage(info);
        System.out.print(image);
    }
}
