package UserResults;

import Animals.Animal;
import Animals.AnimalMovements;
import Animals.Bird;
import FileIterators.TextWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConditionResult {

//    private List<Animal> animalList;
    private List<Animal> conditionResult;
    private Scanner userEntry = new Scanner(System.in);
    private String userQueryEntry;
    private String searchType;


    public List<Animal> returnType(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();

        searchType = "Type";
        int animalCount = 0;
        userQueryEntry = userEntry.nextLine();

        if (userQueryEntry.toLowerCase().contains("m")) {
            for (Animal row : animalList) {
                if (row.getType().equals("Mammal")) {
                    conditionResult.add(row);
                    animalCount++;
                }
            }
        } else if (userQueryEntry.toLowerCase().contains("f")) {
            for (Animal row : animalList) {
                if (row.getType().equals("Fish")) {
                    conditionResult.add(row);
                    animalCount++;
                }
            }
        } else if (userQueryEntry.toLowerCase().contains("bi")) {
            for (Animal row : animalList) {
                if (row.getType().equals("Bird")) {
                    conditionResult.add(row);
                    animalCount++;
                }
            }
        } else if (userQueryEntry.toLowerCase().contains("r")) {
            for (Animal row : animalList) {
                if (row.getType().equals("Reptile")) {
                    conditionResult.add(row);
                    animalCount++;
                }
            }
        } else {
            System.out.println("No animals found with query " + userQueryEntry + ", returning to main menu");
            ;
        }
        System.out.println(animalCount + " animals found with query \"" + userQueryEntry + "\":\n");

        if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getNoun());
            }

        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnNoun(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Name";
        int animalCount = 0;
        userQueryEntry = userEntry.nextLine();

        System.out.println();
//        System.out.println(userChoice);
        for (Animal row : animalList) {
//            System.out.println(row);
            String tempNoun = row.getNoun().toLowerCase();
//            System.out.println(tempNoun);
//            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
            {
                if (tempNoun.contains(userQueryEntry.toLowerCase())) {
                    conditionResult.add(row);
                    animalCount++;
                }

            }
        }
        System.out.println(animalCount + " animals found with query \"" + userQueryEntry + "\": ");

        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu...");
        } else if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getNoun());
            }

        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnSNoun(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Scientific Name";
        int animalCount = 0;
        userQueryEntry = userEntry.nextLine();

        for (Animal row : animalList) {
//            System.out.println(row);
            String tempSNoun = row.getScientificNoun().toLowerCase();
//            System.out.println(tempNoun);
//            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
            {
                if (tempSNoun.contains(userQueryEntry.toLowerCase())) {
                    conditionResult.add(row);
                    animalCount++;
                }

            }
        }
        System.out.println(animalCount + " animals found with query \"" + userQueryEntry + "\": ");

        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu...");
        } else if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row :
                    conditionResult) {
                System.out.println(row.getNoun() + ": " + row.getScientificNoun().toUpperCase());
            }

        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnSize(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Size";
        int animalCount = 0;
        double userDoubleChoice = userEntry.nextDouble();
        //Code adapted from Journaldev.com. available at: https://www.journaldev.com/18380/java-convert-double-to-string
        //Accessed 04/03/2020
        userQueryEntry = Double.toString(userDoubleChoice);
//        System.out.println(userChoice);

//
        for (Animal row : animalList) {

//            System.out.println(row);
            Double tempMin = row.getMinSizeCm();
            Double tempMax = row.getMaxSizeCm();
//            System.out.println(tempNoun);
//            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
            {
                if (userDoubleChoice >= (tempMin * 0.9) && userDoubleChoice <= (tempMax * 1.1)) {
                    conditionResult.add(row);
                    animalCount++;
                }
            }
        }
        System.out.println(animalCount + " animals found which can have a size (+-10%) of " + userDoubleChoice + ": ");

        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu...");
        } else if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getType().toUpperCase() + ": " + row.getNoun());
            }

        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnColour(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Colour";
        int animalCount = 0;
        userQueryEntry = userEntry.nextLine();

        for (Animal data : animalList) {
            ArrayList<String> tempColour = data.getColour();

            for (int i = 0; i < tempColour.size(); i++) {
                tempColour.set(i, tempColour.get(i).toLowerCase());
            }

            for (String row : tempColour) {
                String[] colours = row.split(",");

                for (String value : colours) {
                    if (value.contains(userQueryEntry.toLowerCase())) {
                        conditionResult.add(data);
                        animalCount++;
                    }
                }
            }
        }
        System.out.println(animalCount + " Animal(s) with colour \"" + userQueryEntry + "\": ");
        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu...");
        } else if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getNoun() + ": " + row.getColour());
            }
        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnCountry(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Country";
        int animalCount = 0;

        userQueryEntry = userEntry.nextLine();

        for (Animal data : animalList) {

            ArrayList<String> tempCountries = data.getCountry();

            //Converts all data in tempHabitat array to lowercase.
            for (int i = 0; i < tempCountries.size(); i++) {
                tempCountries.set(i, tempCountries.get(i).toLowerCase());
            }

            for (String row : tempCountries) {

                String[] countries = row.split(",");

                for (String value : countries) {
                    if (value.contains(userQueryEntry.toLowerCase())) {
                        conditionResult.add(data);
                        animalCount++;
                    }

                }
            }
        }
        System.out.println(animalCount + " Animal(s) located in country \"" + userQueryEntry + "\": ");

        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu...");
        } else if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getNoun() + ": " + row.getCountry());
            }
        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnHabitat(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Habitat";
        int resultCount = 0;

        userQueryEntry = userEntry.nextLine();

        for (Animal data : animalList) {

            ArrayList<String> tempHabitat = data.getNaturalHabitat();

            //Converts all data in tempHabitat array to lowercase.
            for (int i = 0; i < tempHabitat.size(); i++) {
                tempHabitat.set(i, tempHabitat.get(i).toLowerCase());
            }

            for (String row : tempHabitat) {

                String[] habitats = row.split(",");

                for (String value : habitats) {
                    if (value.contains(userQueryEntry.toLowerCase())) {
                        conditionResult.add(data);
                        resultCount++;
                    }
                }
            }
        }
        System.out.println(resultCount + " Animal(s) located in habitat \"" + userQueryEntry + "\": ");
        for (Animal row : conditionResult) {
            if (resultCount <= 1) {
                System.out.println(row);
            } else {

                System.out.println(row.getNoun() + ": " + row.getNaturalHabitat());
            }
        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnMovement(String movement, List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Movement";
        int resultCount = 0;
        String movementMethod = null;
        userQueryEntry = movement;
//
        if (movement.equals("1") || movement.equalsIgnoreCase("fly")) {
            movementMethod = "fly";
        } else if (movement.equals("2") || movement.equalsIgnoreCase("walk")) {
            movementMethod = "walk";
        } else if (movement.equals("3") || movement.equalsIgnoreCase("swim")) {
            movementMethod = "swim";
        } else {
            System.out.println("Incorrect entry; returning to main menu");
        }

        for (Animal data : animalList) {

            ArrayList<AnimalMovements> tempMovements = data.getMovements();

            for (AnimalMovements row : tempMovements) {
                if (movementMethod.equals(row.name())) {
                    if (tempMovements.size() > 0) {
                        conditionResult.add(data);
                        resultCount++;
                    }
                }
            }
        }
        System.out.println(resultCount + " Animal(s) can move via the \"" + movementMethod + "\" method: ");
        for (Animal row : conditionResult) {
            if (resultCount <= 1) {
                System.out.println(row);
            } else {

                System.out.println(row.getNoun() + ": " + row.getMovements());
            }
        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnBeakShape(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Beak Shape";
        int animalCount = 0;
        userQueryEntry = userEntry.nextLine();
//        System.out.println(userChoice);

        for (Animal row : animalList) {
            if (row.getType().equals("Bird")) {
                String b = ((Bird) row).getShapeOfTheBeak().toLowerCase();

                if (b.contains(userQueryEntry.toLowerCase())) {
                    conditionResult.add(row);
                    animalCount++;
                }
            }
        }
        System.out.println(animalCount + " birds found with beak \"" + userQueryEntry + "\": ");

        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu...");
        } else if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getNoun() + ": " + ((Bird) row).getShapeOfTheBeak().toUpperCase());
            }

        }
        writeResult();
        return conditionResult;
    }

    public List<Animal> returnFeatherColour(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Feather Colour";
        int resultCount = 0;
        userQueryEntry = userEntry.nextLine();

        for (Animal data : animalList) {
            if (data.getType().equals("Bird")) {

                ArrayList<String> tempFeathers = ((Bird) data).getColoursOfTheFeathers();

                //Converts all data in tempHabitat array to lowercase.
                for (int i = 0; i < tempFeathers.size(); i++) {
                    tempFeathers.set(i, tempFeathers.get(i).toLowerCase());
                }

                for (String row : tempFeathers) {

                    String[] colours = row.split(",");

                    for (String value : colours) {
                        if (value.contains(userQueryEntry.toLowerCase())) {
                            conditionResult.add(data);
                            resultCount++;
                        }
                    }
                }
            }
        }
        System.out.println(resultCount + " birds(s) with potential feather colour \"" + userQueryEntry + "\":\n");
        for (Animal row : conditionResult) {
            if (resultCount <= 1) {
                System.out.println(row);
            } else {

                System.out.println(row.getNoun() + ": " + ((Bird) row).getColoursOfTheFeathers());
            }
        }
        writeResult();
        return conditionResult;
    }

    public List<Animal>  returnAnimalWingspan(List<Animal> animalList) {
        conditionResult= new ArrayList<Animal>();
        searchType = "Animal Wingspan";
        int animalCount = 0;
        double userDoubleChoice = userEntry.nextDouble();
        userQueryEntry = Double.toString(userDoubleChoice);
//        System.out.println(userChoice);

        for (Animal row : animalList) {
            if (row.getType().equals("Bird") || row.getType().equals("Bat")) {
//            System.out.println(row);
                Double tempMin = ((Bird) row).getMinLengthOfWingspan();
                Double tempMax = ((Bird) row).getMaxLengthOfWingspan();
//            System.out.println(tempNoun);
//            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
                {
                    if (userDoubleChoice >= tempMin && userDoubleChoice <= tempMax) {
                        conditionResult.add(row);
                        animalCount++;
                    }
                }
            }
        }
        System.out.println(animalCount + " animals found that can have a wingspan of " + userDoubleChoice + ": ");

        if (animalCount < 1) {
            System.out.println("\nNo results found. Returning to main menu...");
        } else if (animalCount == 1) {
            System.out.println(conditionResult.toString());
        } else {
            for (Animal row : conditionResult) {
                System.out.println(row.getType().toUpperCase() + ": " + row.getNoun());
            }

        }
        writeResult();
        return conditionResult;
    }

    private void writeResult() {
        TextWriter result = new TextWriter();
        result.writeConditionResult(searchType, userQueryEntry, conditionResult);

    }
}

//    private void writeResult() {
//        TextWriter result = new TextWriter();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        Date date = new Date();
//        result.writeNewLine("User search - " +  searchType + "; User Query - " + userQueryEntry + "; result: (");
//
//        for(Animal row: conditionResult) result.writeChars(row.getNoun() + ",");
//        result.writeChars("); date searched " + dateFormat.format(date));
//    }
//}
