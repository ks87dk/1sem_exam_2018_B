import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {              // klasse med access modifier public, hvorved denne kan tilgås af alle

    private static int latestId = 100;  // instansvariable med access modifier private - kan kun tilgås af klassen selv
                                        // og static - der er et datafield som deles mellem alle der bruger denne.
                                        // den har identifieren latestId og er tilskrevet værdien 100

    public static int generate() {      // metode som opretter objekt med identifieren file,

        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        try {           // denne har til formål at fange udtryk som optræder i pakken (indenfor de krøllede paranteser),
                        // if metode, hvis file.exists() er true, så oprettes nye objekter
                        // af Filereader typen med identifiers som fileReader, og scanner, og latestId increments with 1

            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();         // explicit casting, næste input fra en user vil blive
            }                                               // castet til datatypen int

            latestId++;

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        return latestId;
    }

}