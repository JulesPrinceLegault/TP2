public enum listeAnimauxDomestiques {

    ANE("L'âne"),
    CHAT("Le chat"),
    CHIEN("Le chien"),
    CHEVAL("Le cheval"),
    CHEVRE("La chèvre"),
    DINDE("La dinde"),
    MOUTON("Le mouton"),
    LAPIN("Le lapin"),
    MULET("Le mulet"),
    COCHON("Le cochon");

    String msg;
    listeAnimauxDomestiques(String domestique) { this.msg = domestique; }

    public String getMsg(){
        return msg;
    }
}
