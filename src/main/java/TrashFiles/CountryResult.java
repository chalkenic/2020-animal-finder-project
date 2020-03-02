//package UserResults;
//
//import Animals.Animal;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class CountryResult {
//
//    private List<Animal> animalList;
//    private List<Animal> countryResult = new ArrayList<Animal>() {
//    };
//
////    ListIterator<String> iterator = .listIterator();
//
//    private Scanner userEntry = new Scanner(System.in);
//
//
//    public CountryResult(List<Animal> animalList) {
//        this.animalList = animalList;
//    }
//
//
//    public List<Animal> countrySearch() {
//        int resultCount = 0;
//        String countryLocation  = null;
//        System.out.println("Please enter a country: \n");
//        String userChoice = userEntry.nextLine();
////        System.out.println(userChoice);
//
//
//        for (Animal data : animalList) {
//
////
//            ArrayList<String> tempCountries = data.getCountry();
//
//            //Converts all data in tempHabitat array to lowercase.
//            for (int i = 0; i < tempCountries.size(); i++) {
//                tempCountries.set(i, tempCountries.get(i).toLowerCase());
//            }
////            System.out.println(tempNoun);
////            {if (tempNoun.contains(userChoice.substring(0,1).toUpperCase() + userChoice.substring(1))) {
//            for (String row : tempCountries) {
////                System.out.println(row);
//
//                String[] countries = row.split(",");
////                System.out.println(habitats);
//                for (String value : countries) {
//                    if (value.contains(userChoice.toLowerCase())) {
//                        countryLocation = value;
//                        countryResult.add(data);
//                        resultCount++;
//                    }
//
//                }
//            }
//        }
//        System.out.println(resultCount + " Animal(s) located in country \"" + userChoice + "\": ");
//        for (Animal row : countryResult) {
//            if (resultCount <= 1) {
//                System.out.println(row);
//            } else {
//
//                System.out.println(row.getNoun() + ": " + countryLocation);
//            }
//        } return countryResult;
//    }
//}
