//package UserResults;
//
//import Animals.Animal;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ColourResult {
//
//    private List<Animal> animalList;
//    private List<Animal> colourResult = new ArrayList<Animal>() {
//    };
//
////    ListIterator<String> iterator = .listIterator();
//
//    private Scanner userEntry = new Scanner(System.in);
//
//
//    public ColourResult(List<Animal> animalList) {
//        this.animalList = animalList;
//    }
//
//
//    public List<Animal> colourSearch() {
//        int resultCount = 0;
//        ArrayList<String> animalColour = null;
//        System.out.println("Please enter a colour: \n");
//        String userChoice = userEntry.nextLine();
////        System.out.println(userChoice);
//
//
//        for (Animal data : animalList) {
//
////
//            ArrayList<String> tempColour = data.getColour();
//
//            //Converts all data in tempHabitat array to lowercase.
//            for (int i = 0; i < tempColour.size(); i++) {
//                tempColour.set(i, tempColour.get(i).toLowerCase());
//            }
////            System.out.println(tempNoun);
////            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
//            for (String row : tempColour) {
////                System.out.println(row);
//
//                String[] habitats = row.split(",");
////                System.out.println(habitats);
//                for (String value : habitats) {
//                    if (value.contains(userChoice.toLowerCase())) {
//                        colourResult.add(data);
//                        resultCount++;
//                    }
//
//                }
//            }
//        }
//        System.out.println(resultCount + " Animal(s) with colour \"" + userChoice + "\": ");
//        for (Animal row : colourResult) {
//            if (resultCount <= 1) {
//                System.out.println(row);
//            } else {
//
//                System.out.println(row.getNoun() + ": " + row.getColour());
//            }
//        } return colourResult;
//    }
//}
