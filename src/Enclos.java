//Enclos.java
public class Enclos {
//Les propriétés de l'enclos son : le numéro de l'enclos, la zone dans la quelle se trouve l'enclos dans le zoo, si l'enclos possède des caractéristiques spéciales et la grandeur de l'enclos

    private int numEnclos;
    private String area;
    private String enclosureType;
    private String cellSize;

    public Enclos(){}

    public Enclos(int aNumEnclos, String anArea, String anEnclosureType, String aCellSize) {

        numEnclos = aNumEnclos;
        area = anArea;
        enclosureType = anEnclosureType;
        cellSize = aCellSize;
    }
//Tous les getters et les setters de cette classe
    public void setNumEnclos(int aNumEnclos) { numEnclos = aNumEnclos; }
    public int getNumEnclos() { return numEnclos; }

    public void setAreaName(String anArea) { area = anArea; }
    public String getAreaName() { return area; }

    public void setEnclosureType(String anEnclosureType) { enclosureType = anEnclosureType; }
    public String  getEnclosureType() { return enclosureType; }

    public void setCellSize(String aCellSize) { cellSize = aCellSize; }
    public String getCellSize() { return cellSize; }

//Le toString() qui permet d'afficher les informations du maniere lisible.
    @Override
    public String toString() {
        String txt = "";
        txt += "Infos sur l'enclos : ";
        txt += "\nNumero : " + getNumEnclos();
        txt += "\nZone de l'enclos : " + getAreaName();
        txt += "\nCaractéristiques spéciales : " + getEnclosureType();
        txt += "\nGrandeur de l'enclos : " + getCellSize();
        txt += "\n---------------------------------------";
        return txt;
    }
}
