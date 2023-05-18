//Animal.java
public class Animal {
//Les propriétés de l'animal son: son espèce. son nom, si il est exotique, si il est domestique, sa quantité de nourriture qu'il mange en un repas, la fréquece de s'est repas, son genre,
//sont groupe spciale, sa date de naissance, son lieu de naissance, la date a laquelle il est arrivé dans le zoo, le numéro de l'enclos dans lequelle il ira ainsi que le numéro de l'emploiyé qui en sera responsable
    private String species;
    private String name;
    private boolean isExotic;
    private boolean isDomestic;
    private double foodQuantity;
    private int foodFrequency;
    private String gender;
    private String socialGroup;
    private String dateOfBirth;
    private String locationOfBirth;
    private String arrivalDate;
    private int numOfEnclos;
    private int numOfEmploye;
    public Animal(){}

    public Animal(String aSpecies, String aName, boolean isItExotic, boolean isItDomestic, double aFoodQuantity, int aFoodFrequency, String aGender, String aSocialGroup, String aDateOfBirth, String aLocationOfBirth, String anArrivalDate, int aNumOfEnclos, int aNumOfEmploye){
        species = aSpecies;
        name = aName;
        isExotic = isItExotic;
        isDomestic = isItDomestic;
        foodQuantity = aFoodQuantity;
        foodFrequency = aFoodFrequency;
        gender = aGender;
        socialGroup = aSocialGroup;
        dateOfBirth = aDateOfBirth;
        locationOfBirth = aLocationOfBirth;
        arrivalDate = anArrivalDate;
        numOfEnclos = aNumOfEnclos;
        numOfEmploye = aNumOfEmploye;
    }
//Tous les getters et les setters de cette classe
    public void setSpecies(String aSpecies){
        species = aSpecies;
    }
    public String getSpecies(){
        return species;
    }

    public void setName(String aName){ name = aName; }
    public String getName(){
        return name;
    }

    public void setIsExotic(boolean isItExotic){ isExotic = isItExotic; }
    public boolean getIsExotic(){
        return isExotic;
    }

    public void setIsDomestic(boolean isItDomestic){ isDomestic = isItDomestic; }
    public boolean getIsDomestic(){
        return isDomestic;
    }

    public void setFoodQuantity(double aFoodQuantity){ foodQuantity = aFoodQuantity; }
    public double getFoodQuantity(){
        return foodQuantity;
    }

    public void setFoodFrequency(int aFoodFrequency){ foodFrequency = aFoodFrequency; }
    public int getFoodFrequency() { return foodFrequency; }

    public void setGender(String aGender) {gender = aGender; }
    public String getGender(){
        return gender;
    }

    public void setSocialGroup(String aSocialGroup){ socialGroup = aSocialGroup; }
    public String getSocialGroup(){
        return socialGroup;
    }

    public void setDateOfBirth(String aDateOfBirth){ dateOfBirth = aDateOfBirth; }
    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setLocationOfBirth(String aLocationOfBirth){ locationOfBirth = aLocationOfBirth; }
    public String getLocationOfBirth(){
        return locationOfBirth;
    }

    public void setArrivalDate(String anArrivalDate){ arrivalDate = anArrivalDate; }
    public String getArrivalDate(){
        return arrivalDate;
    }

    public void setNumOfEnclos(int aNumOfEnclos) { numOfEnclos = aNumOfEnclos; }
    public int getNumOfEnclos() { return numOfEnclos; }

    public void setNumOfEmploye(int aNumOfEmploye) { numOfEnclos = aNumOfEmploye; }
    public int getNumOfEmploye() { return numOfEmploye; }

//Le toString() qui permet d'afficher les informations du maniere lisible.
    @Override
    public String toString(){
        String txt = "";
        txt += "Infos sur l'animal : ";
        txt += "\nEspèce : "+getSpecies();
        txt += "\nNom : "+getName();
        txt += "\nExotique : "+getIsExotic();
        txt += "\nDomestique : "+getIsDomestic();
        txt += "\nQuantité de nourriture : "+getFoodQuantity();
        txt += "\nFréquence des rations : "+getFoodFrequency();
        txt += "\nGenre : "+getGender();
        txt += "\nGroupe Sociale : "+getSocialGroup();
        txt += "\nDate de naissance : "+getDateOfBirth();
        txt += "\nLieu de naissance : "+getLocationOfBirth();
        txt += "\nDate d'arrivée : "+getArrivalDate();
        txt += "\nNumero de l'enclos : "+getNumOfEnclos();
        txt += "\nNumero de l'emplye nourisseur : "+getNumOfEmploye();
        txt += "\n---------------------------------------";
        return txt;
    }
}
