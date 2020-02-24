package Animals;

public class Fish extends Animal {

    public Fish (
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

    }
}
