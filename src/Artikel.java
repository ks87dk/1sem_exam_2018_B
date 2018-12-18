import java.awt.image.BufferedImage;
import java.io.File;

public class Artikel extends Media {
    private String forfatter;
    private String artikeltekst;
    BufferedImage billede = null;
    File f = null;

    @Override
    public void logToConsol(){
        System.out.printf("%s" + forfatter);
        System.out.printf("%s" + artikeltekst);
        System.out.printf("MANGLLER");              // MANGLER!!!!!!!!!!!!
    }
}
