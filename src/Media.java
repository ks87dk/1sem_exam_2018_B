import java.io.File;
import java.time.Instant;
import java.util.Date;

public class Media {

    /* klasse med identifier-navnet Media, public - kan tilgås af alle. Indeholder 4 instansvariabler, hvoraf 2 er
        er af den primitive datatype, access modifier´en Private betyder at disse kun kan tilgås inde i  klassen.

    */

    private int assetId;                // en declaration af assetId, som har en default value of 0. instansvariabler
    private String name;                // har denne værdi per default
    private Date created = new Date();
    private String fileName;


    /*
        en metode som tilskriver MediaID.generate() til assetId, MediaID.generate() er en metode som giver et unikt ID
        til assetId, en såkaldt Primary Key.
     */
    public Media() {
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
        Media obj1 = new Media();


    }

    public int getAssetId() {           // gettermetode med identifier´en: getAssetId, denne returnerer værdien som
        return assetId;                 // // er tildelt instansvariablen assetId
    }

    public void setAssetId(int assetId) {       //metode med parameter int assetId som benytter this. reference til
        this.assetId = assetId;                 // instansvariablen assetId
    }

    public String getName() {                   // get metode som returner værdien for instansvariablen
        return name;                            //  med identifier´en name
    }

    public void setName(String name) {          // setter som refererer til instansvariablen name, void betyder at
        this.name = name;                       // der ikke returnes noget til det kaldende objekt
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
    public void logToConsol(){
        System.out.println("assetId har værdien" + getAssetId());
        System.out.println("name har værdien" + getName());
        System.out.println("created har værdien" + getCreated());

}}