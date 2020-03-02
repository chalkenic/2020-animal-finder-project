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
    }

}
