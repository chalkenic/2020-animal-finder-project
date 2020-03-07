package UserResults;

import Animals.Animal;
import FileIterators.TextWriter;

import java.util.*;

public class AllResult {

    private List<Animal> test;
    private List<Animal> animalList;
    private String userQueryEntry;
    private String searchType;
    private Scanner userEntry = new Scanner(System.in);
    private List<Animal> allResult = new ArrayList<Animal>();

    public AllResult(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void returnAll() {
        searchType = "all";

        int animalCount = 0;
        HashMap<String, Boolean> queryChoices = new HashMap<String, Boolean>();
//        boolean animalFound = true;

        System.out.println("Please enter your criteria to search the database:");

        String userChoice = userEntry.nextLine();
        ArrayList<String> userChoiceList = new ArrayList<String>(Arrays.asList(userChoice.split(" ")));



//        int arrayLength = choiceArray.length();
//        ArrayList<String> animal = new ArrayList<String>();
//        test = new LinkedList<Animal>();
        for (Animal row : animalList) {
            System.out.println("TEST 1 : " + row.getNoun());


            for (String userEntry : userChoiceList) {
                queryChoices.put(userEntry, false);
            }
//            test.add(row);
            ArrayList<String> animalEntry = row.getAllData();

            for (String choice : userChoiceList) {
                System.out.println("TEST 2 : " +choice);

                choice = choice.toLowerCase();
//                System.out.println(entry);
                for (String animalData : animalEntry) {

                    animalData = animalData.toLowerCase();
//                    System.out.println("Test" + s);

//                    boolean value = s.equalsIgnoreCase();
                    if (animalData.contains(choice)) {
                        queryChoices.put(choice, true);
                    }
                }
            } boolean userChoiceMatch = areAllChoicesTrue(queryChoices);
            if (userChoiceMatch) {
                //Checks List to see if duplicate.
                if(allResult.contains(row)) {
                    break; }
                else {
                    allResult.add(row);
                    animalCount++;
                }
            };

        } System.out.println("\n" + animalCount + " animals found with query \"" + userChoice + "\": ");

        if (animalCount < 1) { System.out.println("\nNo results found. Returning to main menu..."); }
        else if (animalCount == 1) { System.out.println(allResult.toString()); }
        else {for (Animal row: allResult) { System.out.println(row.getNoun()+ ""); }
        }
        writeResult(userChoiceList);
    }
    //Code adapted from Beginners book: https://beginnersbook.com/2013/12/how-to-loop-hashmap-in-java/
    //Accessed 04/03/2020.
    public boolean  areAllChoicesTrue(HashMap<String, Boolean> choices) {
        boolean allChoiceCheck = true;
        for (Map.Entry values : choices.entrySet()) {
            if (values.getValue().equals(false)) {
                allChoiceCheck = false;
                break;
            }
        } return allChoiceCheck;
    }

//    private void writeAllResult(ArrayList userQueryEntry) {
//        TextWriter result = new TextWriter();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        Date date = new Date();
//        result.writeNewLine("User search: " +  searchType + "; User Query: " + userQueryEntry + "; result: (");
//
//        for(Animal row: allResult) result.writeChars(row.getNoun() + ", ");
//        result.writeChars("); date searched " + dateFormat.format(date));
//    }

    private void writeResult(ArrayList<String> userQueryEntry) {
        TextWriter result = new TextWriter();
        result.writeAllResult(searchType, userQueryEntry, allResult);

    }
}



