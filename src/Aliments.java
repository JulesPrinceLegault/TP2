//Aliments.java
public class Aliments {
//Les propriétés de l'alient son : le type de nourriture, le format de la nourriture et les stocks de la nourriture

    private String foodType;
    private String foodFormat;
    private double foodStock;

    public Aliments(){}

    public Aliments(String aFoodType, String aFoodFormat, double aFoodStock) {
        foodType = aFoodType;
        foodFormat = aFoodFormat;
        foodStock = aFoodStock;
    }
//Tous les getters et les setters de cette classe
    public void setFoodType(String aFoodType) { foodType = aFoodType; }
    public String getFoodType() { return foodType; }

    public void setFoodFormat(String aFoodFormat) { foodFormat = aFoodFormat; }
    public String getFoodFormat() { return foodFormat; }

    public void setFoodStock(double aFoodStock) { foodStock = aFoodStock; }
    public double getFoodStock() { return foodStock; }


//Le toString() qui permet d'afficher les informations du maniere lisible.
    @Override
    public String toString() {
        String txt = "";
        txt += "Infos sur l'aliment : ";
        txt += "\nType : " + getFoodType();
        txt += "\nType : " + getFoodFormat();
        txt += "\nStock : " + getFoodStock();
        txt += "\n---------------------------------------";
        return txt;
    }
}
