package Animals;

import java.util.*;

public class AnimalCreator {
    private List<String[]> allAnimals;
    private List<Animal> animalList = new ArrayList<>();

    public AnimalCreator(List<String[]> allAnimals) {

        this.allAnimals = allAnimals;
    }

    public List<Animal> createAnimalList() {

//        ArrayList<Animal> animals = new ArrayList<>();
        for (String[] row : allAnimals) {
            switch (row[0]) {
                case "Mammal":
                    ArrayList<String>mammalColours =  new ArrayList<>(Collections.singleton(row[6]));
                    ArrayList<String>mammalCountries = new ArrayList<>(Collections.singleton(row[7]));
                    ArrayList <String>mammalHabitats = new ArrayList<>(Collections.singleton(row[8]));

                    if (row[11].equals("Null")) {

                        animalList.add(new Mammal(row[0],
                                row[1],
                                row[2],
                                Double.parseDouble(row[3]),
                                Double.parseDouble(row[4]),
                                Double.parseDouble(row[5]),
                                mammalColours,
                                mammalCountries,
                                mammalHabitats));
//                        System.out.println(Arrays.toString(row));
                        break; }
                    else {
                        animalList.add(new Mammal(row[0],
                                row[1],
                                row[2],
                                Double.parseDouble(row[3]),
                                Double.parseDouble(row[4]),
                                Double.parseDouble(row[5]),
                                mammalColours,
                                mammalCountries,
                                mammalHabitats,
                                Double.parseDouble(row[11]),
                                Double.parseDouble(row[12])));
//                        System.out.println(Arrays.toString(row));
                        break;
                    }

                case "Fish":
                    ArrayList<String>fishColours =  new ArrayList<>(Collections.singleton(row[6]));
                    ArrayList<String>fishCountries = new ArrayList<>(Collections.singleton(row[7]));
                    ArrayList <String>fishHabitats = new ArrayList<>(Collections.singleton(row[8]));

                    animalList.add(new Fish(row[0],
                            row[1],
                            row[2],
                            Double.parseDouble(row[3]),
                            Double.parseDouble(row[4]),
                            Double.parseDouble(row[5]),
                            fishColours,
                            fishCountries,
                            fishHabitats));

//                    System.out.println(Arrays.toString(row));

                    break;
                case "Bird":
                    ArrayList<String>birdColours =  new ArrayList<>(Collections.singleton(row[6]));
                    ArrayList<String>birdCountries = new ArrayList<>(Collections.singleton(row[7]));
                    ArrayList <String>birdHabitats = new ArrayList<>(Collections.singleton(row[8]));
                    ArrayList <String>birdFeathers = new ArrayList<>(Collections.singleton(row[12]));

                    animalList.add(new Bird(row[0], row[1], row[2],
                            Double.parseDouble(row[3]),
                            Double.parseDouble(row[4]),
                            Double.parseDouble(row[5]),
                            birdColours,
                            birdCountries,
                            birdHabitats,
                            row[9],
                            birdFeathers,
                            Double.parseDouble(row[11]),
                            Double.parseDouble(row[12])));
//                    System.out.println(Arrays.toString(row));
                    break;

                case "Reptile":
                    ArrayList<String>reptileColours =  new ArrayList<>(Collections.singleton(row[6]));
                    ArrayList<String>reptileCountries = new ArrayList<>(Collections.singleton(row[7]));
                    ArrayList <String>reptileHabitats = new ArrayList<>(Collections.singleton(row[8]));

                    animalList.add(new Reptile(row[0], row[1], row[2],
                            Double.parseDouble(row[3]),
                            Double.parseDouble(row[4]),
                            Double.parseDouble(row[5]),
                            reptileColours,
                            reptileCountries,
                            reptileHabitats));
//                    System.out.println(Arrays.toString(row));
                    break;
            }
        }
        return animalList;
    }

    public void addAnimal(List<String> newAnimal) {

    }
}

////        for (int row = 0; row < allAnimals.size(); row++) {
////            for (int cell = 0; cell < row; cell++) {
////
////                switch(cell) {
////                    case "Mammal":
////                        animals.add(new Mammal(allAnimals.get(i)));
////                        break;
////                    default:
////                        throw new IllegalStateException("Unexpected value: " + allAnimals.get(i));
////                }
////            }
//
//
//        }
//        for (String[] row : allAnimals) {
//            for (String cell : row) {
//                System.out.println(cell + "\t");
//            }
//            System.out.println();
//        }





//    List<String[]> animalData = null;
//
//    public AnimalCreator(String type, String noun, String scientificNoun, Integer minSizeCm, Integer maxSizeCm, Double size, String colour, String country, String[] naturalHabitat) {
//        super(type, noun, scientificNoun, minSizeCm, maxSizeCm, size, colour, country, naturalHabitat);
//    }
//    //
//    public static void createAnimalList(List<String[]> animalData) {
//
//        for (int i = 1; i < animalData.size(); i++) {
//            switch (animalData.get(i)[0]) {
//                case "Bird":
//                    Bird bird = new Bird(animalData.get(i)[0], animalData.get(i)[1],animalData.get(i)[2], animalData.get(i)[3],
//                            animalData.get(i)[4], animalData.get(i)[5], animalData.get(i)[6],
//                            animalData.get(i)[7], animalData.get(i)[8], animalData.get(i)[9],
//                            animalData.get(i)[10],animalData.get(i)[11], animalData.get(i)[12]);
//                break;
//                case "Fish":
//                break;
//                case "Mammal":
//                break;
//                case "Fish":
//                break;
//            }
//        }
//    }

