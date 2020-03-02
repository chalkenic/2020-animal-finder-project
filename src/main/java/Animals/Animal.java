package Animals;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Animal {
    public String type;
    public String noun;
    String scientificNoun;
    Double minSizeCm;
    Double maxSizeCm;
    public Double size;
    public ArrayList<String> colour;
    public ArrayList<String> country;
    ArrayList<String> naturalHabitat;
    private ArrayList<AnimalMovements> movements  = new ArrayList<>();
//    private AnimalMovements canSwim;
//    private AnimalMovements canFly;
//    private AnimalMovements canWalk;



    public Animal(String type, String noun, String scientificNoun,
                  Double minSizeCm, Double maxSizeCm, Double size,
                  ArrayList<String> colour, ArrayList<String> country,
                  ArrayList<String> naturalHabitat) {
        this.type = type;
        this.noun = noun;
        this.scientificNoun = scientificNoun;
        this.minSizeCm = minSizeCm;
        this.maxSizeCm = maxSizeCm;
        this.size = size;
        this.colour = colour;
        this.country = country;
        this.naturalHabitat = naturalHabitat;

    }

//    public void addHabitat(Animal habitatAdded){
//        naturalHabitat.add(habitatAdded);
//    }

    //Animal Getters
    public String getType() { return type; }
    public String getNoun() { return noun; }
    public String getScientificNoun() { return scientificNoun; }
    public Double getMinSizeCm() { return minSizeCm; }
    public Double getMaxSizeCm() { return maxSizeCm; }
    public Double getSize() { return size; }
    public ArrayList<String> getColour() { return colour; }
    public ArrayList<String> getCountry() { return country; }
    public ArrayList<String> getNaturalHabitat() { return naturalHabitat; }
    public ArrayList<AnimalMovements> getMovements() { return movements; }


    public void setType(String type) { this.type = type; }
    public void setNoun(String noun) { this.noun = noun; }
    public void setScientificNoun(String scientificNoun) { this.scientificNoun = scientificNoun; }
    public void setMinSizeCm(Double minSizeCm) { this.minSizeCm = minSizeCm; }
    public void setMaxSizeCm(Double maxSizeCm) { this.maxSizeCm = maxSizeCm; }
    public void setSize(Double size) { this.size = size; }
    public void setColour(ArrayList<String> colour) { this.colour = colour; }
    public void setCountry(ArrayList<String> country) { this.country = country; }
    public void setNaturalHabitat(ArrayList<String> naturalHabitat) { this.naturalHabitat = naturalHabitat; }
    public void setMovements(ArrayList<AnimalMovements> movements) { this.movements = movements;
    }

//    public void setCanSwim(String type, String noun) {
//        if (type.equals("Mammal") || type.equals("Reptile")) {
//            if (noun.equals("Whale")) {
//                this.canSwim = AnimalMovements.canSwim;
//            } else {
//                this.canSwim = AnimalMovements.cannotSwim;
//            }
//        }
//        this.canSwim = canSwim;
//    }
//
//    public void setCanFly(AnimalMovements canFly) {
//        this.canFly = canFly;
//    }
//
//    public void setCanWalk(AnimalMovements canWalk) {
//        this.canWalk = canWalk;
//    }
//
//    public void setMovement(AnimalMovements swim, AnimalMovements fly, AnimalMovements walk) {
//
//        if(this.type.equals("Mammal")) {
//        }
//        else if(this.type.equals("Bird")) {
//
//        }
//    }

    void setMovements(AnimalMovements... movement) {
        movements.addAll(Arrays.asList(movement));
    }

    @Override
    public String toString() {
        return
                "-- TYPE: " + type +
                "\n--- NAME: " + noun +
                "\n--- SCIENTIFIC NAME: " + scientificNoun +
                "\n--- MINIMUM SIZE (CM): " + minSizeCm +
                "\n--- MAXIMUM SIZE (CM): " + maxSizeCm +
                "\n--- APPROX SIZE: " + size +
                "\n--- COLOUR: " + colour +
                "\n--- ORIGIN(S) OF ANIMAL: " + country +
                "\n--- NATURAL HABITAT(S): " + naturalHabitat;
    }

}
