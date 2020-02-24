package Animals;

public class Bird extends Animal {
    private String[] coloursOfTheFeathers;
    private String shapeOfTheBeak;
    private Integer minLengthOfWingspan;
    private Integer maxLengthOfWingspan;

    public Bird (
            String type,
            String noun,
            String ScientificNoun,
            Integer minSizeCm,
            Integer maxSizeCm,
            Double size,
            String colour,
            String country,
            String[] naturalHabitat,
            String shapeOfTheBeak,
            Integer minLengthOfWingspan,
            Integer maxLengthOfWingspan,
            String[] coloursOfTheFeathers) {
        
        super(type, noun, ScientificNoun, minSizeCm,
                maxSizeCm, size, colour, country,
                naturalHabitat);

        this.coloursOfTheFeathers = coloursOfTheFeathers;
        this.shapeOfTheBeak = shapeOfTheBeak;
        this.minLengthOfWingspan = minLengthOfWingspan;
        this.maxLengthOfWingspan = maxLengthOfWingspan;
        
    }
}
