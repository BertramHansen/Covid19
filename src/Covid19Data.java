public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfældeIAlt;
    private int døde;
    private int indlagtPåIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data (String region, String aldersgruppe, int bekræftedeTilfældeIAlt, int døde, int indlagtPåIntensiv, int indlagte, String dato){
        this.region =region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagtPåIntensiv = indlagtPåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }


    @Override
    public String toString(){
    return "Region// " + region + " -- Aldersgruppe// " + aldersgruppe + " -- Bekræftede tilfælde i alt// " + bekræftedeTilfældeIAlt +
            " -- Døde// " + døde + " -- Indlagt på intensiv// " + indlagtPåIntensiv + " -- Indlagte// " + indlagte + " -- Dato// " + dato;
    }
}