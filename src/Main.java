import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {                                             // åben klasse, sådan at hvis der nedarves, kan klasser
                                                                // nedarvet fra denne kunne tilgå elementer i denne.
                                                                // klassens identifier er Main

    public static final String SOFTWARE_VERSION = "0.1.0";      //  String som kan indeholde diverse karakterer (bogstaver,
                                                                // tal, tegn mm.), den er static hvilket vil sige at den
                                                                // deles af alle eventuelle klasser, men der opvares kun en
                                                                // kopi, som deles mellem alle, og dermed kan overskrives
                                                                // flere gange. Dog er denne string Final, hvilket vil sige
                                                                // at værdien ikke kan ændres, heller ikke med setter metode



    public static final String MEDIA_MAPPE = "media/";          // access modifiers for denne string er public - kan tilgås
                                                                // af alle, static - den kan tilgås fra andre klasser.
                                                                // denne Strings identifier er MEDIA_MAPPE og værdien tilknyttet
                                                                // er media/.

    public static void main(String[] args) {                    // Main metode som kan betegnes som driver klassen.
                                                                // denne sørger for at programmet kører, da der ikke er
                                                                // en specifik constructor, tildeles denne automatisk en
                                                                // no-arg constructor

        Test.test();                                            // kalder metoden test i test-klassen


/*      DETTE VAR EN PRØVE, KODENLINJERNE KØRER, MEN VISER BARE FEJL EFTER FEJL
        Path path = Paths.get("C:\\Users\\ks87d\\IdeaProjects\\1sem_exam_2018_B\\media");

        try (Stream<Path> media_Content = Files.walk(path)) {

            media_Content.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


        public static void readMediaFolder(String Media)   {
            File folder = new File(MEDIA_MAPPE);
            File[] listOfFiles = folder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println("File " + listOfFiles[i].getName());
                } else if (listOfFiles[i].isDirectory()) {
                    System.out.println("Directory " + listOfFiles[i].getName());
                }
            }

        }
*/

    }
}

