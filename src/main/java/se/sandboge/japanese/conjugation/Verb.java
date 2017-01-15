package se.sandboge.japanese.conjugation;

public class Verb {

    private final String dictionaryVerb;

    private final VerbType verbType;

    public Verb(String dictionaryVerb, VerbType verbType) {
        this.dictionaryVerb = dictionaryVerb;
        this.verbType = verbType;
        checkVerbConcistency(dictionaryVerb, verbType);
    }

    private void checkVerbConcistency(String dictionaryVerb, VerbType verbType) {
        char last = dictionaryVerb.charAt(dictionaryVerb.length() - 1);
        switch (verbType) {
            case ru:
                if (last != 'る') throw new IllegalArgumentException("Not a proper ru verb in dictionary form");
                break;
            case u:
                switch (last) {
                    case 'う':
                    case 'る':
                    case 'つ':
                    case 'ぶ':
                    case 'ぬ':
                    case 'む':
                    case 'く':
                    case 'ぐ':
                    case 'す':
                        break;
                    default:
                        throw new IllegalArgumentException("Not a proper u verb in dictionary form");

                }
                break;
            case irregular:
                if (!dictionaryVerb.endsWith("来る") && !dictionaryVerb.endsWith("くる") && !dictionaryVerb.endsWith("する")) {
                    throw new IllegalArgumentException("Not a proper irregular verb in dictionary form");
                }
                break;
        }
    }

    public String asPoliteForm() {
        return asStemForm() + "ます";
    }

    public String asStemForm() {
        if (verbType.equals(VerbType.ru)) {
            if (!(dictionaryVerb.charAt(dictionaryVerb.length() - 1) == 'る')) {
                throw new IllegalArgumentException("Ru verbs must end with る!");
            }
            return dictionaryVerb.substring(0, dictionaryVerb.length() - 1);
        } else if (verbType.equals(VerbType.u)) {
            char end = dictionaryVerb.charAt(dictionaryVerb.length() - 1);
            String base = dictionaryVerb.substring(0, dictionaryVerb.length() - 1);
            switch (end) {
                case 'う':
                    return base + 'い';
                case 'る':
                    return base + 'り';
                case 'つ':
                    return base + 'ち';
                case 'ぶ':
                    return base + 'び';
                case 'む':
                    return base + 'み';
                case 'ぬ':
                    return base + 'に';
                case 'く':
                    return base + 'き';
                case 'ぐ':
                    return base + 'ぎ';
                case 'す':
                    return base + 'し';
                default:
                    throw new IllegalArgumentException("U verbs must end with one of う、る、つ、ぶ、む、ぬ、く、ぐ、す!");
            }
        } else if (verbType.equals(VerbType.irregular)) {
            if (dictionaryVerb.endsWith("する")) {
                return dictionaryVerb.substring(0, dictionaryVerb.length() - 2) + "し";
            } else if (dictionaryVerb.endsWith("くる") || dictionaryVerb.endsWith("来る")) {
                return dictionaryVerb.substring(0, dictionaryVerb.length() - 2) + "来";
            }
        }
        throw new IllegalArgumentException("Unhandled verb type.");
    }

    public String asPoliteNegForm() {
        return asStemForm() + "ません";
    }
}
