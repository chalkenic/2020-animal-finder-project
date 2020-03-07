package Animals;

import java.util.ArrayList;

public class Bat extends Mammal{
    private Double minLengthOfWingspan;
    private Double maxLengthOfWingspan;


    public Bat (
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


        setMovements(AnimalMovements.fly);
    }
   public Double getMinLengthOfWingspan(){return minLengthOfWingspan; }
   public Double getMaxLengthOfWingspan(){return maxLengthOfWingspan; }


    }
