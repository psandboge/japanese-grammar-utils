package se.sandboge.japanese.conjugation;



public class Adjective {
    private String dictionaryAdjective;
    private AdjectiveType adjectiveType;

    public Adjective(String dictionaryAdjective, AdjectiveType adjectiveType) {
        this.dictionaryAdjective = dictionaryAdjective;
        this.adjectiveType = adjectiveType;
    }

    public String asPolite() {
        return dictionaryAdjective + "です";
    }
}
