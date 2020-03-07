package FileIterators;

import Animals.*;

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

            if (! row[1].equals(row[2])) {

                for (Animal uniqueAnimal : animalList) {
                    if (uniqueAnimal.getNoun().contains(row[1])) {
                        row[0] = "Duplicate";
                        break;
                    }
                }

                try {

                    switch (row[0]) {
                        case "Mammal":

                            ArrayList<String> mammalColours = new ArrayList<>(Collections.singleton(row[6]));
                            ArrayList<String> mammalCountries = new ArrayList<>(Collections.singleton(row[7]));
                            ArrayList<String> mammalHabitats = new ArrayList<>(Collections.singleton(row[8]));

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
                                break;
                            } else {
                                animalList.add(new Bat(row[0],
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
                            ArrayList<String> fishColours = new ArrayList<>(Collections.singleton(row[6]));
                            ArrayList<String> fishCountries = new ArrayList<>(Collections.singleton(row[7]));
                            ArrayList<String> fishHabitats = new ArrayList<>(Collections.singleton(row[8]));


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
                            ArrayList<String> birdColours = new ArrayList<>(Collections.singleton(row[6]));
                            ArrayList<String> birdCountries = new ArrayList<>(Collections.singleton(row[7]));
                            ArrayList<String> birdHabitats = new ArrayList<>(Collections.singleton(row[8]));
                            ArrayList<String> birdFeathers = new ArrayList<>(Collections.singleton(row[10]));

                            if (row[1].contains("Ostrich") || row[1].contains("Penguin")) {

                                animalList.add(new FlightlessBird(row[0], row[1], row[2],
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
                            } else {
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
                            }
                            break;

                        case "Reptile":
                            ArrayList<String> reptileColours = new ArrayList<>(Collections.singleton(row[6]));
                            ArrayList<String> reptileCountries = new ArrayList<>(Collections.singleton(row[7]));
                            ArrayList<String> reptileHabitats = new ArrayList<>(Collections.singleton(row[8]));

                            animalList.add(new Reptile(row[0], row[1], row[2],
                                    Double.parseDouble(row[3]),
                                    Double.parseDouble(row[4]),
                                    Double.parseDouble(row[5]),
                                    reptileColours,
                                    reptileCountries,
                                    reptileHabitats));
//                    System.out.println(Arrays.toString(row));
                            break;
                        case "Duplicate":
                            System.out.println(row[1] + " already appears in the database. Ignoring duplicate dataset. ");
                    }
                } catch (IllegalArgumentException ryan) {
                    System.out.println(ryan.getMessage());
                }
            } else {
                System.out.println("Name " + row[1] + " & scientific name" + row[2] + " cannot be the same; " +
                        " Ignoring name error. ");
            }
        }
        return animalList;
    }
}


