package Animals;

import java.util.ArrayList;

public class Bird extends Animal {
    private ArrayList<String> coloursOfTheFeathers;
    private String shapeOfTheBeak;
    private Double minLengthOfWingspan;
    private Double maxLengthOfWingspan;

    public Bird (
            String type,
            String noun,
            String ScientificNoun,
            Double minSizeCm,
            Double maxSizeCm,
            Double size,
            ArrayList<String> colour,
            ArrayList<String> country,
            ArrayList<String> naturalHabitat,
            String shapeOfTheBeak,
            ArrayList<String> coloursOfTheFeathers,
            Double minLengthOfWingspan,
            Double maxLengthOfWingspan
            ) {
        
        super(type, noun, ScientificNoun, minSizeCm,
                maxSizeCm, size, colour, country,
                naturalHabitat);


        this.shapeOfTheBeak = shapeOfTheBeak;
        this.minLengthOfWingspan = minLengthOfWingspan;
        this.maxLengthOfWingspan = maxLengthOfWingspan;
        this.coloursOfTheFeathers = coloursOfTheFeathers;
        
    }

    @Override
    public String toString() {
        return
                "\n--- TYPE: " + type +
                "\n--- NOUN: " + noun +
                "\n--- SCIENTIFIC NOUN: " + scientificNoun +
                "\n--- MINIMUM SIZE (CM): " + minSizeCm +
                "\n--- MAXIMUM SIZE(CM): " + maxSizeCm +
                "\n--- SIZE: " + size +
                "\n--- COLOUR: " + colour +
                "\n--- COUNTRY: " + country +
                "\n--- NATURAL HABITAT: " + naturalHabitat +
                "\n--- FEATHER COLOUR: " + coloursOfTheFeathers +
                "\n--- BEAK SHAPE: " + shapeOfTheBeak +
                "\n--- MINIMUM WINGSPAN LENGTH (CM): " + minLengthOfWingspan +
                "\n--- MAXIMUM WINGSPAN LENGTH (CM): " + maxLengthOfWingspan;
    }
}
