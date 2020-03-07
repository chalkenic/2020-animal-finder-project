package Animals;

import java.util.ArrayList;

public class Fish extends Animal {

    public Fish (
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

        setMovements(AnimalMovements.swim);

        final double FISH_MIN_SIZE = 0.7;
        final Integer FISH_MAX_SIZE = 1265;

        if (size < FISH_MIN_SIZE || size > FISH_MAX_SIZE) {
            throw new IllegalArgumentException(this.noun + " has an incorrect fish size value - ignoring entry to " +
                    "database" +
                    ".");

        }

    }
}
