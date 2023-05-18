public enum listeAnimauxExotiques {

    LEMURIEN("Le lémurien"),
    WOMBAT("Le wombat"),
    RAGONDIN("Le ragondin"),
    OURANOUTAN("Le ouran outan"),
    CHIMPANZE("Le chimpanzé"),
    GRUECOURONNEE("La grue couronnée"),
    PAON("Le paon"),
    PANDA("Le panda"),
    CAPYBARA("Le capybara"),
    ELEPHANT("L'éléphant");

    String msg;
    listeAnimauxExotiques(String exotique) { this.msg = exotique; }

    public String getMsg(){
        return msg;
    }
}
