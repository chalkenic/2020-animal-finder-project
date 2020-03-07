package Animals;

import java.util.ArrayList;

public class Reptile extends Animal {

    public Reptile (
            String type,
            String noun,
            String scientificNoun,
            Double minSizeCm,
            Double maxSizeCm,
            Double size,
            ArrayList<String> colour,
            ArrayList<String> country,
            ArrayList<String> naturalHabitat) {

        super(type, noun, scientificNoun, minSizeCm,
                maxSizeCm, size, colour, country,
                naturalHabitat);

      setMovements(AnimalMovements.swim, AnimalMovements.walk);

        final double REPTILE_MIN_SIZE = 0.14;
        final Integer REPTILE_MAX_SIZE = 600;

        if (size < REPTILE_MIN_SIZE || size > REPTILE_MAX_SIZE) {
            throw new IllegalArgumentException(this.noun + " has an incorrect reptile size value - ignoring entry to " +
                    "database" +
                    ".");

        }
    }

}
