//Main.java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList <Animal> arrayOfAnimal = new ArrayList<Animal>();
        String species, name, socialGroup, gender, dateOfBirth, locationOfBirth, arrivalDate;
        boolean isExotic = false, isDomestic = false;
        double foodQuantity;
        int foodFrequency, numOfEnclos, numOfEmploye;

        ArrayList <Enclos> arrayOfEnclos = new ArrayList<Enclos>();
        int numEnclos;
        String area;
        String enclosureType;
        String cellSize;

        ArrayList <Aliments> arrayOfAliments = new ArrayList<Aliments>();
        String foodType, foodFormat;
        double foodStock;

        ArrayList <Employe> arrayOfEmploye = new ArrayList<Employe>();
        int numEmploye;
        String workerType,firstName, lastName;

        while (true) {
            System.out.println("***************************************************");
            System.out.println("1 - Ajouter un animal\n2 - Ajouter un enclos\n3 - Ajouter de la nourriture\n4 - Ajouter un employée\n5 - Afficher toutes les informations disponibles\n6 - Afficher les données à entrer dans chacune des classes\n" +
                "7 - Modifier une information d'un animal\n 8 - Afficher tous les animaux pour chaques enclos\n9 - Afficher tous les animaux dont un nourrisseur est responsable\n10 - Quitter le programme");
            System.out.println("---------------------------------------");
            Scanner sc = new Scanner(System.in);
            int option = 0;
            System.out.print("Choisisser l'option que vous voulez : ");
            option = sc.nextInt();

            //Ajouter un animal
            if (option == 1) {

                System.out.println("---------------------------------------");
                //On demande a l'usager d'entrez tous les informations nécéssaires pour la classe "Animal"
                System.out.println("Entrez l'espèce de l'animal : ");
                species = sc.next();

                System.out.println("Entrez le nom de l'animal : ");
                name = sc.next();

                System.out.println("Indiquez si l'animal est exotique (OUI ou NON) : ");
                String exoticResponse = sc.next();
                if (exoticResponse.equalsIgnoreCase("oui")) isExotic = true;
                if (exoticResponse.equalsIgnoreCase("non")) isExotic = false;

                System.out.println("Indiquez si l'animal est domestique (OUI ou NON) : ");
                String domesstcResponse = sc.next();
                if (domesstcResponse.equalsIgnoreCase("oui")) isDomestic = true;
                if (domesstcResponse.equalsIgnoreCase("non")) isDomestic = false;

                System.out.println("Entrez la quantité de nourriture que doit constituer un repas (en lbs) : ");
                foodQuantity = sc.nextDouble();

                System.out.println("Entrez la frequence des rations que doit avoir l'animal (en nombre de repas par jour) : ");
                foodFrequency = sc.nextInt();

                System.out.println("Entrez le genre de l'animal (M pour male, F pour femelle");
                gender = sc.next();

                System.out.println("Entrez le groupe sociale de l'animal");
                socialGroup = sc.next();

                System.out.println("Entrez la date de naissance de l'animal (AAAA-MM-JJ) ");
                dateOfBirth = sc.next();

                System.out.println("Entrez le lieu de naissance de l'animal");
                locationOfBirth = sc.next();

                System.out.println("Entrez la date d'arrivée de l'animal dans le zoo (AAAA-MM-JJ)");
                arrivalDate = sc.next();

                System.out.println("Entrez le numero de l'enclos ou sera l'animal");
                numOfEnclos = sc.nextInt();

                System.out.println("Entrez le numero de l'employé(e) nourrisseur qui s'occupera de l'animal");
                numOfEmploye = sc.nextInt();

                //Et ensuite, on ajoutes tous ces information dans la liste d'animals et on affiche les information que l'on vient d'écrire
                Animal newAnimal = new Animal(name, species, isExotic, isDomestic, foodQuantity, foodFrequency, gender, socialGroup, dateOfBirth, locationOfBirth, arrivalDate, numOfEnclos, numOfEmploye);
                arrayOfAnimal.add(newAnimal);
                System.out.println(newAnimal);
            }

            //Ajouter un enclos
            else if (option == 2) {
                //On demande a l'usager d'entrez tous les informations nécéssaires pour la classe "Enclos"
                System.out.println("---------------------------------------");

                System.out.println("Entrez le numero de l'enclos : ");
                numEnclos = sc.nextInt();

                System.out.println("Indiquez la zone de l'enclos (H - Herbivores, C - Carnivores, O - Omnivores: ");
                area = sc.next();

                System.out.println("Indiquez si l'enclos possède des caractéristiques spéciales, si non, écrivez 'aucun' : ");
                enclosureType = sc.next();

                System.out.println("Indiquez la taille de l'enclos, P - Petite, M - Moyenne, G - Grande : ");
                cellSize = sc.next();

                //Et ensuite, on ajoutes tous ces information dans la liste d'enclos et on affiche les information que l'on vient d'écrire
                Enclos newEnclos = new Enclos(numEnclos, area, enclosureType, cellSize);
                arrayOfEnclos.add(newEnclos);
                System.out.println(newEnclos);
            }

            //Ajouter de la nourriture
            else if (option == 3) {
                //On demande a l'usager d'entrez tous les informations nécéssaires pour la classe "Aliments"
                System.out.println("---------------------------------------");

                System.out.println("Entrez le type d'aliment : ");
                foodType = sc.next();

                System.out.println("Entrez le format d'aliment (Livres, Balles, Boisseaux : ");
                foodFormat = sc.next();

                System.out.println("Entrez les stocks de nourritures (en lbs) : ");
                foodStock = sc.nextDouble();

                //Et ensuite, on ajoutes tous ces information dans la liste d'aliments et on affiche les information que l'on vient d'écrire
                Aliments newAliment = new Aliments(foodType, foodFormat, foodStock);
                arrayOfAliments.add(newAliment);
                System.out.println(newAliment);
            }

            //Ajouter un employé
            else if (option == 4) {
                //On demande a l'usager d'entrez tous les informations nécéssaires pour la classe "Employe"
                System.out.println("---------------------------------------");

                System.out.println("Entrez le numero de l'employé(e) : ");
                numEmploye = sc.nextInt();

                System.out.println("Entrez le type d'employé : ");
                workerType = sc.next();

                System.out.println("Entrez le prénom de l'employé : ");
                firstName = sc.next();

                System.out.println("Entrez le nom de l'employé : ");
                lastName = sc.next();

                //Et ensuite, on ajoutes tous ces information dans la liste d'employés et on affiche les information que l'on vient d'écrire
                Employe newEmploye = new Employe(numEmploye, workerType, firstName, lastName);
                arrayOfEmploye.add(newEmploye);
                System.out.println(newEmploye);
            }

            //Afficher toutes les informations disponibles
            else if (option == 5) {
                //Pour tous les classes, on fait une boucle for qui affiche chaques informations de la classe avec le toString()

                System.out.println("---------------------------------------");

                System.out.println("Tous les animaux : ");
                System.out.println("---------------------------------------");
                for (Animal a : arrayOfAnimal) {
                    System.out.println(a);
                }
                System.out.println("Tous les enclos : ");
                System.out.println("---------------------------------------");
                for (Enclos b : arrayOfEnclos) {
                    System.out.println(b);
                }
                System.out.println("Toute la nourritues : ");
                System.out.println("---------------------------------------");
                for (Aliments c : arrayOfAliments) {
                    System.out.println(c);
                }
                System.out.println("Tous les employes : ");
                System.out.println("---------------------------------------");
                for (Employe d : arrayOfEmploye) {
                    System.out.println(d);
                }
            }

            //Afficher les données à entrer dans chacune des classes
            else if (option == 6) {
                System.out.println("Les données à entrer pour les animaux :\n");
                System.out.println("L'espèce\nLe nom\nSi il est exotique\nSi il est domestique\nLa Quantité de nourriture qu'il mange en une ration\nLa fréquance de ses rations\nSon genre\n Son group sociale\nLa date de naissance\nLe lieu de naissance\nLa date de son arrivé\nLe numéro de son enclos\nLe numéro de l'employé chargé de le nourrire");
                System.out.println("---------------------------------------");
            }

            //Modifier une information d'un animal
            else if (option == 7) {

            }

            //Afficher tous les animaux pour chaques enclos
            else if (option == 8) {
                //On fait une boucle qui vérifie pour chaque enclos, si il y a un animal dans cette enclos en vérifiant si leur numero sont égale.
                //Si pour l'enclos, le compteur est rester à zéro, cela veut dire que l'enclos ne contien aucun animaux et on l'affiche.
                System.out.println("---------------------------------------");

                for (Enclos i1 : arrayOfEnclos) {
                    int counter = 0;
                    System.out.println(i1);
                    for (Animal i2 : arrayOfAnimal) {
                        if (i2.getNumOfEnclos() == i1.getNumEnclos()) {
                            counter ++;
                            System.out.println(i2.getName()+" le/la "+i2.getSpecies());
                        }
                    }
                    if (counter == 0) System.out.println("Aucun animal pour cet enclos");
                    System.out.println("---------------------------------------");
                }
            }

            //Afficher tous les animaux dont un nourrisseur est responsable
            else if (option == 9) {

                System.out.println("---------------------------------------");
                //On fait une boucle qui vérifie pour chaque animaux, si il y a un employée qui en est responsable en vérifiant si leur numero est égale.
                //Si pour l'animal, le compteur est rester à zéro, cela veut dire que l'animal n'a pas d'employé qui est ressponsable de lui et on l'affiche.
                for (Animal i3 : arrayOfAnimal) {
                    int counter = 0;
                    for (Employe i4 : arrayOfEmploye) {
                        if (i3.getNumOfEmploye() == i4.getNumEmploye()){
                            counter ++;
                            System.out.println(i4.getFirstName()+" "+i4.getLastName());
                        }
                    }
                    System.out.println("est responsable de : "+i3.getName()+" le/la "+i3.getSpecies());
                    System.out.println("---------------------------------------");
                    if (counter == 0) System.out.println("Aucun employées n'est responsable de cette animal");
                }
            }

            //Quitter le programme
            else if (option == 10) {

                //On fait un break ce qui nous fait sortir du while true et termine le programme car il n'y a rien d'autre après la boucle
                System.out.println("---------------------------------------");

                System.out.println("Au revoir ! ");
                break;

            }
        }
    }
}