package UserChoices;

import Animals.Animal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private int result;

    private List<Animal> animalList;
    private List<Animal> conditionResult = new ArrayList<Animal>();

    private Scanner entry = new Scanner(System.in);

    public Menu(List<Animal> animals){
        this.animalList = animals;
    }

    public int userMainMenu (int queryCount) {
        int userChoice;
        do {
            try { System.out.println(
                        "\n<------------------------------------ANIMAL IDENTIFIER------------------------------------>\n" +
                                "Searches performed: " + queryCount + "  |\n" +
                                "-----------------------|\n\n" +
                                "Welcome to the Animal Identifier.\n " +
                                "Enter the corresponding digit: \n\n" +
                                "1  -- Search database by entry.\n" +
                                "2  -- Search database via condition. \n" +
                                "3  -- Check prior entries made.\n" +
                                "4  \n" +

                                "entry any other key to exit program.");
                userChoice = entry.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Exiting program...");
                return -1; }
            } while (userChoice == 0);

        switch (userChoice) {
            case 1:
//                result = fileSearch();
                break;
            case 2:
                return userConditionMenu();

            case 3:
                result = 3;
                break;
            default:
                result = 0;
                break;
        } return userChoice;
    }

    private int userConditionMenu() {

        Scanner subEntry = new Scanner(System.in);

        int userChoice;
        do {
            try { System.out.println
                    ("\n<------------------------------------CONDITION SEARCH------------------------------------>\n" +
                        "Which condition would you like to search?\n " +
                        "Enter the corresponding digit: \n\n" +
                        "1  - (All) -- search by animal's species; returns all fields\n" +
                        "2  - (All) -- search for an animal by Noun\n" +
                        "3  - (All) -- search for an animal by the given Scientific noun\n" +
                        "4  - (All) -- search for animals by Size\n" +
                        "5  - (All) -- search by an animal Colour\n" +
                        "6  - (All) -- search by an animals' Country of origin\n" +
                        "7  - (All) -- search by an animal's Natural habitat\n" +
                        "8  - (All) -- search by how animals move\n" +
                        "9  - (Bird) - search by a bird's beak shape\n" +
                        "10 - (Bird) - search by a bird's feather colour\n" +
                        "11 - (All) -- search by an animals' wingspan length (cm)\n" +
                        "entry any other key to return to main menu.\n");
                userChoice = entry.nextInt();}
            catch (InputMismatchException error) {System.out.println("returning to main menu...");
            return 0;
            }
        } while (userChoice == 0);

        UserResults.ConditionResult returnCondition =
                new UserResults.ConditionResult(animalList);

        switch (userChoice) {
            case 1:
                result = 1;
                System.out.println("Please enter the animal type you're searching for: \n");
                conditionResult = returnCondition.returnType();
                break;
            case 2:
                result = 2;
                System.out.println("Please enter the animal name you're searching for: ");
                conditionResult = returnCondition.returnNoun();
                break;
            case 3:
                result = 3;
                System.out.println("Please enter the scientific animal name you're searching for: \n");
                conditionResult = returnCondition.returnSNoun();
                break;
//            case 4:
//                result = 4;
//                conditionResult = returnCondition.returnSize();
//                break;
            case 5:
                result = 5;
                System.out.println("Please enter a colour: \n");
                conditionResult = returnCondition.returnColour();
                break;
            case 6:
                result = 6;
                System.out.println("Please enter a country: \n");
                conditionResult = returnCondition.returnCountry();
                break;
            case 7:
                result = 7;
                System.out.println("Please enter an animal habitat: \n");
                conditionResult = returnCondition.returnHabitat();
                break;
            case 8:
                result = 8;
                System.out.println("Please enter your movement method: Fly/Walk/Swim \n");
                conditionResult = returnCondition.returnMovement();
                break;
//            case 9:
//                result = 9;
//                conditionResult = returnCondition.returnBeakShape();
//                break;
//            case 10:
//                result = 10;
//                conditionResult =  returnCondition.returnFeatherColour();
//                break;
//            case 11:
//                result = 11;
//                conditionResult = returnCondition.returnAnimalWingspan();
//                break;
            default:
                result = 0;
                break;
        }
            return result;
    }

}
