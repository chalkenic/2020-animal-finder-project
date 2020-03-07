package Animals;

import java.util.ArrayList;

public class Mammal extends Animal {

//    private AnimalMovements swim;
//    private AnimalMovements fly;
//    private AnimalMovements walk;

    public Mammal(
            String type,
            String noun,
            String scientificNoun,
            Double minSizeCm,
            Double maxSizeCm,
            Double size,
            ArrayList<String> colour,
            ArrayList<String> country,
            ArrayList<String> naturalHabitat
    ) {
        super(type, noun, scientificNoun, minSizeCm,
                maxSizeCm, size, colour, country,
                naturalHabitat);

        final Integer MAMMAL_MAX_SIZE = 3000;
        final Integer MAMMAL_MIN_SIZE = 2;
        if (size < MAMMAL_MIN_SIZE || size > MAMMAL_MAX_SIZE) {
            throw new IllegalArgumentException(this.noun + " has an incorrect mammal size value - ignoring entry to " +
                    "database" +
                    ".");
        }

//    this.fly = AnimalMovements.cannotFly;

        if (noun.contains("Whale")) {
            setMovements(AnimalMovements.swim);
        } else {
            setMovements(AnimalMovements.swim, AnimalMovements.walk);
        }

//    canFly() {
//        return false;
//    }

    }

}
