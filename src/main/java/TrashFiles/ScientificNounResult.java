//package UserResults;
//
//import Animals.Animal;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ScientificNounResult {
//
//    private List<Animal> animalList;
//    private List<Animal> sNounResult = new ArrayList<Animal>() {
//    };
//
//    private Scanner userEntry = new Scanner(System.in);
//
//
//
//    public ScientificNounResult(List<Animal> animalList) {
//        this.animalList = animalList;
//    }
//
//
//    public List<Animal> sNounSearch() {
//        int animalCount = 0;
//        System.out.println("Please enter the animal noun you're searching for: \n");
//        String userChoice = userEntry.nextLine();
////        System.out.println(userChoice);
//        for (Animal row : animalList) {
////            System.out.println(row);
//            String tempNoun = row.getScientificNoun().toLowerCase();
////            System.out.println(tempNoun);
////            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
//            {if (tempNoun.contains(userChoice.toLowerCase())) { sNounResult.add(row); animalCount++; }
//
//            }
//        } for (Animal row: sNounResult) {
//
//            if (animalCount <= 1) { System.out.println(row); }
//            else { System.out.println(row.getScientificNoun());
//            }
//
//        }return sNounResult;
//    }
//}
