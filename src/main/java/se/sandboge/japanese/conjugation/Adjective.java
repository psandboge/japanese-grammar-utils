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

    public String asShortForm() {
        switch (adjectiveType) {
            case i:
            case yoi:
                return dictionaryAdjective;
            case na:
                return dictionaryAdjective + 'だ';
        }
        return null;
    }

    public String asShortNegForm() {
        switch(adjectiveType) {
            case na:
                return baseAdjective + "じゃない";
            case i:
            case yoi:
                return baseAdjective + "くない";
        }
        return  null;
    }

    public String asShortPastForm() {
        switch(adjectiveType) {
            case na:
                return baseAdjective + "だった";
            case i:
            case yoi:
                return baseAdjective + "かった";
        }
        return  null;
    }

    public String asShortPastNegForm() {
        switch(adjectiveType) {
            case na:
                return baseAdjective + "じゃなかった";
            case i:
            case yoi:
                return baseAdjective + "くなかった";
        }
        return  null;
    }

    public String asRepresentativeForm() {
        return asShortPastForm() + "り";
    }

    public String asLooksLikeForm() {
        switch(adjectiveType) {
            case na:
            case i:
                return baseAdjective + "そうです";
            case yoi:
                return baseAdjective + "さそうです";
        }
        return  null;
    }

    public String asLooksLikeNegForm() {
        String a = asShortNegForm();
        return a.substring(0, a.length() - 1) + "さそうです";
    }
}
