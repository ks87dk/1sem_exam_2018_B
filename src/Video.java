public class Video extends Media {
    private String filtype;
    private Double længde;
    private String opløsning;
    private String fotograf;

    @Override
    public void logToConsol(){
        System.out.printf("%s" + filtype);
        System.out.printf("%f" + længde);
        System.out.printf("%s" + opløsning);
        System.out.printf("%s" + fotograf);
    }
}
