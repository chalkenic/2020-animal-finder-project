package Animals;

import java.util.ArrayList;

public class FlightlessBird extends Bird {

    public FlightlessBird(
            String type,
            String noun,
            String scientificNoun,
            Double minSizeCm,
            Double maxSizeCm,
            Double size,
            ArrayList<String> colour,
            ArrayList<String> country,
            ArrayList<String> naturalHabitat,
            String shapeOfTheBeak,
            ArrayList<String> coloursOfTheFeathers,
            Double minLengthOfWingspan,
            Double maxLengthOfWingspan) {

        super(type, noun, scientificNoun, minSizeCm,
                maxSizeCm, size, colour, country,
                naturalHabitat, shapeOfTheBeak, coloursOfTheFeathers, minLengthOfWingspan, maxLengthOfWingspan);
    }
}

