package Animals;

import java.util.ArrayList;

public class Mammal extends Animal {
    private Double minLengthOfWingspan;
    private Double maxLengthOfWingspan;
//    private AnimalMovements swim;
//    private AnimalMovements fly;
//    private AnimalMovements walk;

    public Mammal (
            String type,
            String noun,
            String scientificNoun,
            Double minSizeCm,
            Double maxSizeCm,
            Double size,
            ArrayList<String> colour,
            ArrayList<String> country,
            ArrayList<String> naturalHabitat
            )

    { super(type, noun, scientificNoun, minSizeCm,
                maxSizeCm, size, colour, country,
                naturalHabitat);

//    this.fly = AnimalMovements.cannotFly;

    if(noun.contains("Whale")) {
        setMovements(AnimalMovements.swim);

    } else {
        setMovements(AnimalMovements.swim, AnimalMovements.walk);
    }

//    canFly() {
//        return false;
//    }

    }

    public Mammal (
            String type,
            String noun,
            String scientificNoun,
            Double minSizeCm,
            Double maxSizeCm,
            Double size,
            ArrayList<String> colour,
            ArrayList<String> country,
            ArrayList<String> naturalHabitat,
            Double minLengthOfWingspan,
            Double maxLengthOfWingspan) {

        super(type, noun, scientificNoun, minSizeCm,
                maxSizeCm, size, colour, country,
                naturalHabitat);
        this.minLengthOfWingspan = minLengthOfWingspan;
        this.maxLengthOfWingspan = maxLengthOfWingspan;

        setMovements(AnimalMovements.swim, AnimalMovements.fly, AnimalMovements.walk);
    }

}
