package se.sandboge.japanese.conjugation;


import java.util.IllegalFormatException;

public class Adjective {
    private String dictionaryAdjective;
    private String baseAdjective;
    private AdjectiveType adjectiveType;

    public Adjective(String dictionaryAdjective, AdjectiveType adjectiveType) {
        this.dictionaryAdjective = dictionaryAdjective;
        this.adjectiveType = adjectiveType;
        switch (adjectiveType) {
            case i:
                baseAdjective = dictionaryAdjective.substring(0, dictionaryAdjective.length() - 1);
                break;
            case na:
                baseAdjective = dictionaryAdjective;
                break;
            case yoi:
                baseAdjective = dictionaryAdjective.substring(0, dictionaryAdjective.length() - 2) + 'よ';
                break;
        }
    }

    public String asPoliteForm() {
        return dictionaryAdjective + "です";
    }

    public String asPolitePastForm() {
        switch(adjectiveType) {
            case na:
                return baseAdjective + "でした";
            case i:
            case yoi:
                return baseAdjective + "かったです";
        }
        return  null;
    }

    public String asPoliteNegForm() {
        switch(adjectiveType) {
            case na:
                return baseAdjective + "じゃないです";
            case i:
            case yoi:
                return baseAdjective + "くないです";
        }
        return  null;
    }

    public String asPolitePastNegForm() {
        switch(adjectiveType) {
            case na:
                return baseAdjective + "じゃなかったです";
            case i:
            case yoi:
                return baseAdjective + "くなかったです";
        }
        return  null;
    }
}
