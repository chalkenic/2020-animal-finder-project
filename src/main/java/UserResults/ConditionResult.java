package UserResults;

import Animals.Animal;
import Animals.AnimalMovements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConditionResult {

    private List<Animal> animalList;
    private List<Animal> conditionResult = new ArrayList<Animal>();
    private Scanner userEntry = new Scanner(System.in);

    public ConditionResult(List<Animal> animalList) {this.animalList = animalList; }

    public List<Animal> returnType() {

        int animalCount = 0;
        String userChoice = userEntry.nextLine();
        if (userChoice.toLowerCase().contains("m")) {
            for (Animal row : animalList) { if (row.getType().equals("Mammal")) {
                conditionResult.add(row);
                animalCount++; }
            }
        } else if (userChoice.toLowerCase().contains("f")){
            for (Animal row : animalList) { if (row.getType().equals("Fish")) {
                conditionResult.add(row);
                animalCount++; }
            }
        } else if (userChoice.toLowerCase().contains("b")){
            for (Animal row : animalList) { if (row.getType().equals("Bird")) {
                conditionResult.add(row);
                animalCount++; }
            }
        } else if (userChoice.toLowerCase().contains("r")){
            for (Animal row : animalList) { if (row.getType().equals("Reptile")) {
                conditionResult.add(row);
                animalCount++; }
            }
        } else {
            System.out.println("No animals found with query " + userChoice + ", returning to main menu");
            return conditionResult;
        }
        System.out.println(animalCount + " animals found with query \"" + userChoice + "\":\n");

        if (animalCount == 1) { System.out.println(conditionResult.toString()); }
        else {for (Animal row: conditionResult) { System.out.println(row.getNoun()); }

        } return conditionResult;
    }

    public List<Animal> returnNoun() {
        int animalCount = 0;
        String userChoice = userEntry.nextLine();
        System.out.println();
//        System.out.println(userChoice);
        for (Animal row : animalList) {
//            System.out.println(row);
            String tempNoun = row.getNoun().toLowerCase();
//            System.out.println(tempNoun);
//            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
            {if (tempNoun.contains(userChoice.toLowerCase())) { conditionResult.add(row); animalCount++; }

            }
        }
        System.out.println(animalCount + " animals found with query \"" + userChoice + "\": ");

        if (animalCount < 1) { System.out.println("\nNo results found. Returning to main menu..."); }
        else if (animalCount == 1) { System.out.println(conditionResult.toString()); }
        else {for (Animal row: conditionResult) { System.out.println(row.getNoun()+ ", "); }

        }return conditionResult;

    }

    public List<Animal> returnSNoun() {
        int animalCount = 0;
        String userChoice = userEntry.nextLine();
//        System.out.println(userChoice);
        for (Animal row : animalList) {
//            System.out.println(row);
            String tempNoun = row.getScientificNoun().toLowerCase();
//            System.out.println(tempNoun);
//            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
            {if (tempNoun.contains(userChoice.toLowerCase())) { conditionResult.add(row); animalCount++; }

            }
        }
        System.out.println(animalCount + " animals found with query \"" + userChoice + "\": ");

        if (animalCount < 1) { System.out.println("\nNo results found. Returning to main menu..."); }
        else if (animalCount == 1) { System.out.println(conditionResult.toString()); }
        else {for (Animal row:
                conditionResult) { System.out.println(row.getNoun()+ ": " + row.getScientificNoun().toUpperCase()); }

        }return conditionResult;
    }

    public List<Animal> returnColour() {
        int animalCount = 0;
        String userChoice = userEntry.nextLine();

        for (Animal data : animalList) {
            ArrayList<String> tempColour = data.getColour();

            for (int i = 0; i < tempColour.size(); i++) {
                tempColour.set(i, tempColour.get(i).toLowerCase()); }

            for (String row : tempColour) {
                String[] habitats = row.split(",");

                for (String value : habitats) {
                    if (value.contains(userChoice.toLowerCase())) {
                        conditionResult.add(data);
                        animalCount++;
                    }
                }
            }
        }
        System.out.println(animalCount + " Animal(s) with colour \"" + userChoice + "\": ");
        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu..."); }
        else if (animalCount == 1) {
                System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getNoun() + ": " + row.getColour());
            }
        } return conditionResult;
    }

    public List<Animal> returnCountry() {
        int animalCount = 0;

        String userChoice = userEntry.nextLine();

        for (Animal data : animalList) {

            ArrayList<String> tempCountries = data.getCountry();

            //Converts all data in tempHabitat array to lowercase.
            for (int i = 0; i < tempCountries.size(); i++) {
                tempCountries.set(i, tempCountries.get(i).toLowerCase());
            }

            for (String row : tempCountries) {

                String[] countries = row.split(",");

                for (String value : countries) {
                    if (value.contains(userChoice.toLowerCase())) {
                        conditionResult.add(data);
                        animalCount++;
                    }

                }
            }
        }
        System.out.println(animalCount + " Animal(s) located in country \"" + userChoice + "\": ");

        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu..."); }
        else if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getNoun() + ": " + row.getCountry());
            }
        } return conditionResult;
    }

    public List<Animal> returnHabitat() {
        int resultCount = 0;

        String userChoice = userEntry.nextLine();

        for (Animal data : animalList) {

            ArrayList<String> tempHabitat = data.getNaturalHabitat();

            //Converts all data in tempHabitat array to lowercase.
            for (int i = 0; i < tempHabitat.size(); i++) {
                tempHabitat.set(i, tempHabitat.get(i).toLowerCase());
            }

            for (String row : tempHabitat) {

                String[] habitats = row.split(",");

                for (String value : habitats) {
                    if (value.contains(userChoice.toLowerCase())) {
                        conditionResult.add(data);
                        resultCount++;
                    }
                }
            }
        }
        System.out.println(resultCount + " Animal(s) located in habitat \"" + userChoice + "\": ");
        for (Animal row : conditionResult) {
            if (resultCount <= 1) {
                System.out.println(row);
            } else {

                System.out.println(row.getNoun() + ": " + row.getNaturalHabitat());
            }
        } return conditionResult;
    }

    public List<Animal> returnMovement() {
        int resultCount = 0;

        String userChoice = userEntry.nextLine().toLowerCase();

        for (Animal data : animalList) {

            ArrayList<AnimalMovements> tempMovements = data.getMovements();

            for (AnimalMovements row : AnimalMovements.values()) {
                if (userChoice.equals(row.name())) {
                    if ( tempMovements.size() > 0) {
                        conditionResult.add(data);
                        resultCount++;
                    }
                }
            }


//            for (AnimalMovements row : tempMovements) {
//
////                AnimalMovements[] habitats = row.split(",");
//
//                for (AnimalMovements value : AnimalMovements.values()) {
//                    if (userChoice.equalsIgnoreCase(value.name())) {
//                        conditionResult.add(data);
//                        resultCount++;
//                    }
//                }
//            }
        }
        System.out.println(resultCount + " Animal(s) can move via the \"" + userChoice + "\" method: ");
        for (Animal row : conditionResult) {
            if (resultCount <= 1) {
                System.out.println(row);
            } else {

                System.out.println(row.getNoun() + ": " + row.getMovements());
            }
        } return conditionResult;

    }


}
