package Animals;

public class Reptile extends Animal {

    public Reptile (
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
