//package UserResults;
//
//import Animals.Animal;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class NaturalHabitatResult {
//
//    private List<Animal> animalList;
//    private List<Animal> habitatResult = new ArrayList<Animal>() {
//    };
//
////    ListIterator<String> iterator = .listIterator();
//
//    private Scanner userEntry = new Scanner(System.in);
//
//
//    public NaturalHabitatResult(List<Animal> animalList) {
//        this.animalList = animalList;
//    }
//
//
//    public List<Animal> habitatSearch() {
//        int resultCount = 0;
//        String habitatLocation = null;
//        System.out.println("Please enter an animal habitat: \n");
//        String userChoice = userEntry.nextLine();
////        System.out.println(userChoice);
//
//
//        for (Animal data : animalList) {
//
////
//            ArrayList<String> tempHabitat = data.getNaturalHabitat();
//
//            //Converts all data in tempHabitat array to lowercase.
//            for (int i = 0; i < tempHabitat.size(); i++) {
//                tempHabitat.set(i, tempHabitat.get(i).toLowerCase());
//            }
////            System.out.println(tempNoun);
////            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
//            for (String row : tempHabitat) {
////                System.out.println(row);
//
//                String[] habitats = row.split(",");
////                System.out.println(habitats);
//                for (String value : habitats) {
//                    if (value.contains(userChoice.toLowerCase())) {
//                        habitatLocation = value;
//                        habitatResult.add(data);
//                        resultCount++;
//                    }
//
//                }
//            }
//        }
//            System.out.println(resultCount + " Animal(s) located in habitat \"" + userChoice + "\": ");
//            for (Animal row : habitatResult) {
//                if (resultCount <= 1) {
//                    System.out.println(row);
//                } else {
//
//                    System.out.println(row.getNoun() + ": " + habitatLocation);
//                }
//            } return habitatResult;
//    }
//}
