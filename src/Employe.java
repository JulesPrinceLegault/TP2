//Employe.java
public class Employe {
//Les propriétés de l'animal son le numéro de l'employé, le type de travaill de l'emplyé, son prénom puis son nom de famille

    private int numEmploye;
    private String workerType;
    private String firstName;
    private String lastName;

    public Employe(){}

    public Employe(int aNumEmploye, String aWorkerType, String aFirstName, String aLastName) {
        numEmploye = aNumEmploye;
        workerType = aWorkerType;
        firstName = aFirstName;
        lastName = aLastName;
    }
//Tous les getters et les setters de cette classe

    public void setNumEmploye(int aNumEmploye) { numEmploye = aNumEmploye; }
    public int getNumEmploye() { return numEmploye; }

    public void setWorkerType(String aWorkerType) { workerType = aWorkerType; }
    public String getWorkerType() { return workerType; }

    public void setFirstName(String aFirstName) { firstName = aFirstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String aLastName) { lastName = aLastName; }
    public String getLastName() { return lastName; }

//Le toString() qui permet d'afficher les informations du maniere lisible.
    @Override
    public String toString() {
        String txt = "";
        txt += "Infos sur l'employé(e) : ";
        txt += "\nNumero : " + getNumEmploye();
        txt += "\nType de travailleur : " + getWorkerType();
        txt += "\nPrénom : " + getFirstName();
        txt += "\nNom de famille : " + getLastName();
        txt += "\n---------------------------------------";
        return txt;
    }
}
