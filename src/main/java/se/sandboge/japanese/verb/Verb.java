package se.sandboge.japanese.verb;

import static se.sandboge.japanese.verb.VerbType.irregular;
import static se.sandboge.japanese.verb.VerbType.ru;
import static se.sandboge.japanese.verb.VerbType.u;

public class Verb {

    private final String dictionaryVerb;

    private final VerbType verbType;

    public Verb(String dictionaryVerb, VerbType verbType) {
        this.dictionaryVerb = dictionaryVerb;
        this.verbType = verbType;
        checkVerbConcistency(dictionaryVerb, verbType);
    }

    private void checkVerbConcistency(String dictionaryVerb, VerbType verbType) {
        // TODO check that endings are correct
    }

    public String masuForm() {
        if (verbType.equals(ru)) {
            if (!(dictionaryVerb.charAt(dictionaryVerb.length() - 1) == 'る')) {
                throw new IllegalArgumentException("Ru verbs must end with る!");
            }
            return dictionaryVerb.substring(0, dictionaryVerb.length() - 1) + "ます";
        } else if (verbType.equals(u)) {
            char end = dictionaryVerb.charAt(dictionaryVerb.length() - 1);
            String base = dictionaryVerb.substring(0, dictionaryVerb.length() - 1);
            switch (end) {
                case 'う':
                    return base + 'い' + "ます";
                case 'る':
                    return base + 'り' + "ます";
                case 'つ':
                    return base + 'ち' + "ます";
                case 'ぶ':
                    return base + 'び' + "ます";
                case 'む':
                    return base + 'み' + "ます";
                case 'ぬ':
                    return base + 'に' + "ます";
                case 'く':
                    return base + 'き' + "ます";
                case 'ぐ':
                    return base + 'ぎ' + "ます";
                case 'す':
                    return base + 'し' + "ます";
                default:
                    throw new IllegalArgumentException("U verbs must end with one of う、る、つ、ぶ、む、ぬ、く、ぐ、す!");
            }
        } else if (verbType.equals(irregular)) {
            if (dictionaryVerb.endsWith("する")) {
                return dictionaryVerb.substring(0, dictionaryVerb.length() - 2) + "します";
            } else if (dictionaryVerb.endsWith("くる") || dictionaryVerb.endsWith("来る")) {
                return dictionaryVerb.substring(0, dictionaryVerb.length() - 2) + "来ます";
            }
        }
        throw new IllegalArgumentException("Unhandled verb type.");
    }

}
