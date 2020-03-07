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

        final Integer BIRD_MIN_SIZE = 5;
        final Integer BIRD_MAX_SIZE = 210;

        if (size < BIRD_MIN_SIZE || size > BIRD_MAX_SIZE) {
            throw new IllegalArgumentException(this.noun + " has an incorrect bird size value - ignoring entry to " +
                    "database" +
                    ".");
        }



        this.shapeOfTheBeak = shapeOfTheBeak;
        this.coloursOfTheFeathers = coloursOfTheFeathers;
        this.minLengthOfWingspan = minLengthOfWingspan;
        this.maxLengthOfWingspan = maxLengthOfWingspan;


        if(noun.contains("Penguin") || noun.contains("Ostrich")) { setMovements(AnimalMovements.walk,
                AnimalMovements.swim); }

        else { setMovements(AnimalMovements.swim, AnimalMovements.walk, AnimalMovements.fly); }
        
    }

//    public String getShapeOfBeak2() {return shapeOfTheBeak; }

//    @Override
    public ArrayList<String> getColoursOfTheFeathers() { return coloursOfTheFeathers; }
//
//    @Override
    public String getShapeOfTheBeak() { return shapeOfTheBeak; }

//    @Override
    public Double getMinLengthOfWingspan() { return minLengthOfWingspan; }

//    @Override
    public Double getMaxLengthOfWingspan() { return maxLengthOfWingspan; }

//    public void setColoursOfTheFeathers(ArrayList<String> coloursOfTheFeathers) {
//        this.coloursOfTheFeathers = coloursOfTheFeathers;
//    }



//    public void setShapeOfTheBeak(String shapeOfTheBeak) {
//        this.shapeOfTheBeak = shapeOfTheBeak;
//    }



//    public void setMinLengthOfWingspan(Double minLengthOfWingspan) {
//        this.minLengthOfWingspan = minLengthOfWingspan;
//    }


//
//    public void setMaxLengthOfWingspan(Double maxLengthOfWingspan) {
//        this.maxLengthOfWingspan = maxLengthOfWingspan;
//    }

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
