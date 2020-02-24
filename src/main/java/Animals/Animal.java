package Animals;

public class Animal {
    private String type;
    private String noun;
    private String scientificNoun;
    private Integer minSizeCm;
    private Integer maxSizeCm;
    private Double size;
    private String colour;
    private String country;
    private String[] naturalHabitat;



    public Animal(String type, String noun, String scientificNoun, Integer minSizeCm, Integer maxSizeCm, Double size, String colour, String country, String[] naturalHabitat) {
        this.type = type;
        this.noun = noun;
        this.scientificNoun = scientificNoun;
        this.minSizeCm = minSizeCm;
        this.maxSizeCm = maxSizeCm;
        this.size = size;
        this.colour = colour;
        this.country = country;
        this.naturalHabitat = naturalHabitat;
    }
}
