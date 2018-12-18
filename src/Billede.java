public class Billede extends Media {
    private String filtype;
    private int bredde;
    private int højde;
    private String fotograf;

    @Override
    public void logToConsol(){
        System.out.printf("%s" + filtype);
        System.out.printf("%d" + bredde);
        System.out.printf("%d" + højde);
        System.out.printf("%s" + fotograf);
}
}
