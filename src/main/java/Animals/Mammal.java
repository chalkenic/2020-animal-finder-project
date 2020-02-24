package Animals;

public class Mammal extends Animal {
    private Integer minLengthOfWingspan;
    private Integer maxLengthOfWingspan;

    public Mammal (
            String type,
            String noun,
            String scientificNoun,
            Integer minSizeCm,
            Integer maxSizeCm,
            Double size,
            String colour,
            String country,
            String[] naturalHabitat) {

        super(type, noun, scientificNoun, minSizeCm,
                maxSizeCm, size, colour, country,
                naturalHabitat);
        this.minLengthOfWingspan = minLengthOfWingspan;
        this.maxLengthOfWingspan = maxLengthOfWingspan;
    }
}
