package UserChoices;

import Animals.Animal;
import FileIterators.TextReader;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private int result;

    private List<Animal> animalList;
    private List<Animal> conditionResult = new ArrayList<Animal>();

    private Scanner entry = new Scanner(System.in);
    private UserResults.ConditionResult returnCondition =
            new UserResults.ConditionResult();

    public Menu(List<Animal> animals){
        this.animalList = animals;
    }

    public int userMainMenu (int queryCount) {
        int userChoice;
        do {
            try { System.out.println(
                        "\n|------------------------------------ANIMAL IDENTIFIER------------------------------------>\n" +
                                "|  Searches performed: " + queryCount + "  |\n" +
                                "|-------------------------|\n\n" +
                                "Welcome to the Animal Identifier.\n" +
                                "Enter the corresponding digit: \n\n" +
                                "1  -- Search database by entry.\n" +
                                "2  -- Search database via condition. \n" +
                                "3  -- Present all prior entries.\n" +
                                "4  -- Search previous entries via entry.\n\n" +

                                "entry any other key to exit program.");
                userChoice = entry.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Exiting program...");
                return -1; }
            } while (userChoice == 0);

        switch (userChoice) {
            case 1:
                UserResults.AllResult returnResults =
                        new UserResults.AllResult(animalList);
                returnResults.returnAll();
                break;
            case 2:
                return userConditionMenu(animalList);
            case 3:
                TextReader fullText = new TextReader(animalList);
                fullText.readTextFull();
                break;
            case 4:
                String textChoice;
                TextReader readEntries = new TextReader(animalList);
                System.out.println("\n|------------------------------------SEARCH " +
                        "FILE--------------------------------------->\n" +
                        "How would you like to search the file - enter the corresponding digit: \n\n" +
                        "1 -- query by entry.\n" +
                        "2 -- List all prior animal results");

                entry = new Scanner(System.in);
                textChoice = entry.nextLine();

                switch (textChoice) {
                    case "1":
                        return result = readEntries.readTextByEntry();

                    case "2":
                        return result = readEntries.readTextByAnimals();

                    default:
                        return result = 0;
                }
            default:
                return result = -1;

        }    return result;
    }

    private int userConditionMenu(List<Animal> animalResult) {

        int userChoice;
        do {
            try {
                System.out.println
                        ("\n<---------------------------------CONDITION " +
                                "SEARCH----------------------------------------->\n" +
                                "Which condition would you like to search?\n " +
                                "Enter the corresponding digit: \n\n" +
                                "1  - (All) -- search by animal's species. (Mammal/Bird/Fish/Reptile)\n" +
                                "2  - (All) -- search for an animal by name.\n" +
                                "3  - (All) -- search for an animal by the given scientific name.\n" +
                                "4  - (All) -- search for animals by Size (+/- 10%).\n" +
                                "5  - (All) -- search by animal colour(s).\n" +
                                "6  - (All) -- search by an animals' Country(s) of origin.\n" +
                                "7  - (All) -- search by an animal's Natural habitat(s).\n" +
                                "8  - (All) -- search by how an animal can move.\n" +
                                "9  - (Bird) - search by a bird's beak shape\n" +
                                "10 - (Bird) - search by a bird's feather colour\n" +
                                "11 - (All) -- search by an animals' wingspan length (cm)\n\n" +
                                "entry any other key to return to main menu.");
                userChoice = entry.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("returning to main menu...");
                return 0;
            }
        } while (userChoice == 0);



        switch (userChoice) {
            case 1:
                result = 1;
                System.out.println("Please enter the animal type you're searching for: ");
                conditionResult = returnCondition.returnType(animalResult);
                for (Animal row: conditionResult
                     ) {
                    System.out.println(row.getNoun());
                }
                break;
            case 2:
                result = 2;
                System.out.println("Please enter the animal name you're searching for: ");
                conditionResult = returnCondition.returnNoun(animalResult);
                break;
            case 3:
                result = 3;
                System.out.println("Please enter the scientific animal name you're searching for:");
                conditionResult = returnCondition.returnSNoun(animalResult);
                break;
            case 4:
                System.out.println("Please enter your animal size (+/- 10%): ");
                result = 4;
                conditionResult = returnCondition.returnSize(animalResult);
                break;
            case 5:
                result = 5;
                System.out.println("Please enter a colour:");
                conditionResult = returnCondition.returnColour(animalResult);
                break;
            case 6:
                result = 6;
                System.out.println("Please enter a country:");
                conditionResult = returnCondition.returnCountry(animalResult);
                break;
            case 7:
                result = 7;
                System.out.println("Please enter an animal habitat: ");
                conditionResult = returnCondition.returnHabitat(animalResult);
                break;
            case 8:
                result = 8;
//                 movementChoice;
                System.out.println("Please enter your movement method:\n" +
                        "1 - fly\n" +
                        "2 - walk\n" +
                        "3 - swim");
                entry = new Scanner(System.in);
                String movementChoice = entry.nextLine();

                if (! movementChoice.equals("")) {
                    conditionResult = returnCondition.returnMovement(movementChoice, animalResult);
                }
//
                break;
            case 9:
                System.out.println("Please your bird's beak shape: ");
                result = 9;
                conditionResult = returnCondition.returnBeakShape(animalResult);
                break;
            case 10:
                System.out.println("Please your bird's feather colour: ");
                result = 10;
                conditionResult = returnCondition.returnFeatherColour(animalResult);
                break;
            case 11:
                System.out.println("Please your animal's wingspan: ");
                result = 11;
                conditionResult = returnCondition.returnAnimalWingspan(animalResult);
                break;
            default:
                result = 0;
                break;
        }
        boolean refinefurther = true;
        while (refinefurther) {
//            for (Animal row : conditionResult) {
//                System.out.println(row.getNoun());
//            }
            System.out.println("Would you like to refine your search by adding another condition?\n\n" +
                    "1 = yes\n" +
                    "any key = no");
            entry = new Scanner(System.in);
            String refineChoice = entry.nextLine();

            switch (refineChoice) {
                case "1":
                    userConditionMenu(conditionResult);
                    break;
                default:
                    refinefurther = false;
                    return result;
            }
        }  return result;

    }
}
