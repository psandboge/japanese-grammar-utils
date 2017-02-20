package se.sandboge.japanese.conjugation;

import se.sandboge.japanese.dictionary.Dictionary;
import se.sandboge.japanese.dictionary.DictionaryHolder;

import java.util.HashMap;
import java.util.Map;

public class Verb {

    private final String dictionaryVerb;
    private final Dictionary dictionary;

    private VerbType verbType;
    private static Map<String, String> uVerbs = new HashMap<>();
    static {
        uVerbs.put("要る", "要る");
        uVerbs.put("帰る", "かえる");
        uVerbs.put("切る", "きる");
        uVerbs.put("喋る", "しゃべる");
        uVerbs.put("知る", "しる");
        uVerbs.put("入る", "はいる");
        uVerbs.put("走る", "はしる");
        uVerbs.put("減る", "へる");
        uVerbs.put("焦る", "あせる");
        uVerbs.put("限る", "かぎる");
        uVerbs.put("蹴る", "ける");
        uVerbs.put("滑る", "すべる");
        uVerbs.put("握る", "にぎる");
        uVerbs.put("練る", "ねる");
        uVerbs.put("参る", "まいる");
        uVerbs.put("交じる", "まじる");
        uVerbs.put("嘲る", "あざける");
        uVerbs.put("覆る", "くつがえる");
        uVerbs.put("遮る", "さえぎる");
        uVerbs.put("罵る", "ののしる");
        uVerbs.put("捻る", "ひねる");
        uVerbs.put("翻る", "ひるがえる");
        uVerbs.put("滅入る", "めいる");
        uVerbs.put("蘇る", "よみがえる");
        uVerbs.put("乗る", "のる");
    }

    private Verb(String dictionaryVerb, VerbType verbType, boolean consistencyCheck) {
        dictionary = DictionaryHolder.getDictionary();
        this.dictionaryVerb = dictionaryVerb;
        this.verbType = verbType;
        if (consistencyCheck) {
            checkVerbConcistency();
        }
    }

    public Verb(String dictionaryVerb, VerbType verbType) {
        this(dictionaryVerb, verbType, true);
    }

    public Verb(String dictionaryVerb) {
        dictionary = DictionaryHolder.getDictionary();
        this.dictionaryVerb = dictionaryVerb;
        deduceVerbType();
    }

    public static Verb forceRu(String s) {
        if (s.length() > 1) {
            return new Verb(s.substring(0, s.length() - 1) + 'る', VerbType.ru, false);
        } else {
            return new Verb(s + 'る', VerbType.ru, false);
        }
    }

    public static Verb forceU(String s) {
        return new Verb(s, VerbType.u, false);
    }

    public static Verb forceSuru(String s) {
        if (s.endsWith("する")) {
            return new Verb(s);
        }
        return new Verb(s.substring(0, s.length() - 1) + "する", VerbType.irregular, false);
    }

    public static Verb forceKuru(String s) {
        if (s.endsWith("来る") || s.endsWith("くる")) {
            return new Verb(s);
        }
        return new Verb(s.substring(0, s.length() - 1) + "来る", VerbType.irregular, false);
    }

    private void deduceVerbType() {
        if (dictionaryVerb.endsWith("来る") || dictionaryVerb.endsWith("くる") || dictionaryVerb.endsWith("する")) {
            this.verbType = VerbType.irregular;
        } else {
            char last = dictionaryVerb.charAt(dictionaryVerb.length() - 1);
            switch (last) {
                case 'う':
                case 'つ':
                case 'ぶ':
                case 'ぬ':
                case 'む':
                case 'く':
                case 'ぐ':
                case 'す':
                    verbType = VerbType.u;
                    break;
                case 'る':
                    char secondLast = dictionary.lookupReading(dictionaryVerb).charAt(dictionaryVerb.length() - 2);
                    switch (secondLast) {
                        case 'い':
                        case 'え':
                        case 'き':
                        case 'け':
                        case 'し':
                        case 'せ':
                        case 'ち':
                        case 'て':
                        case 'に':
                        case 'ね':
                        case 'ひ':
                        case 'へ':
                        case 'み':
                        case 'め':
                        case 'り':
                        case 'れ':
                        case 'ぎ':
                        case 'げ':
                        case 'じ':
                        case 'ぜ':
                        case 'ぢ':
                        case 'で':
                        case 'び':
                        case 'べ':
                        case 'ぴ':
                        case 'ぺ':
                            if (uVerbs.containsKey(dictionaryVerb)) {
                                verbType = VerbType.u;
                            } else {
                                verbType = VerbType.ru;
                            }
                            break;
                        default:
                            verbType = VerbType.u;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Not a proper verb in dictionary form");
            }
        }
    }

    private void checkVerbConcistency() {
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
                return dictionaryVerb.substring(0, dictionaryVerb.length() - 2) + "き";
            }
        }
        throw new IllegalArgumentException("Unhandled verb type.");
    }

    public String asPoliteNegForm() {
        return asStemForm() + "ません";
    }

    public String asPolitePastForm() {
        return asStemForm() + "ました";
    }

    public String asPolitePastNegForm() {
        return asStemForm() + "ませんでした";
    }

    public String asPoliteVolitionalForm() {
        return asStemForm() + "ましょう";
    }

    public String asTeForm() {
        String base = dictionaryVerb.substring(0, dictionaryVerb.length() - 1);
        switch (verbType) {
            case ru:
                return asStemForm() + 'て';
            case u:
                char last = dictionaryVerb.charAt(dictionaryVerb.length() - 1);
                if (dictionaryVerb.endsWith("行く") || dictionaryVerb.equals("いく")) {
                    return base + "って";
                }
                switch (last) {
                    case 'う':
                    case 'つ':
                    case 'る':
                        return base + "って";
                    case 'む':
                    case 'ぶ':
                    case 'ぬ':
                        return base + "んで";
                    case 'く':
                        return base + "いて";
                    case 'ぐ':
                        return base + "いで";
                    case 'す':
                        return base + "して";
                }
            case irregular:
                if (dictionaryVerb.endsWith("する")) {
                    return base.substring(0, base.length() - 1) + "して";
                } else {
                    return base.substring(0, base.length() - 1) + "来て";
                }
        }
        return "";
    }

    public String asPoliteRequestForm() {
        return asTeForm() + "ください";
    }

    public String asPolitePermissionForm() {
        return asTeForm() + "もいいです";
    }

    public String asPoliteProhibitionForm() {
        return asTeForm() + "はいけません";
    }

    public String asInProgressForm() {
        return asTeForm() + "いる";
    }

    public String asMovementPurposeForm() {
        return asStemForm() + "に行く";
    }

    public String asShortForm() {
        return dictionaryVerb;
    }

    public String asShortNegForm() {
        String base = dictionaryVerb.substring(0, dictionaryVerb.length() - 1);
        switch (verbType) {
            case ru:
                return asStemForm() + "ない";
            case u:
                char last = dictionaryVerb.charAt(dictionaryVerb.length() - 1);
                if (dictionaryVerb.equals("ある")) {
                    return "ない";
                }
                switch (last) {
                    case 'う':
                        return base + "わない";
                    case 'る':
                        return base + "らない";
                    case 'つ':
                        return base + "たない";
                    case 'ぶ':
                        return base + "ばない";
                    case 'む':
                        return base + "まない";
                    case 'ぬ':
                        return base + "なない";
                    case 'く':
                        return base + "かない";
                    case 'ぐ':
                        return base + "がない";
                    case 'す':
                        return base + "さない";
                    default:
                        throw new IllegalArgumentException("U verbs must end with one of う、る、つ、ぶ、む、ぬ、く、ぐ、す!");
                }
            case irregular:
                if (dictionaryVerb.endsWith("する")) {
                    return base.substring(0, base.length() - 1) + "しない";
                } else {
                    return base.substring(0, base.length() - 1) + "こない";
                }
        }
        throw new IllegalArgumentException("U verbs must end with one of う、る、つ、ぶ、む、ぬ、く、ぐ、す!");
    }

    public String asShortPastForm() {
        String te = asTeForm();
        if (te.endsWith("て")) {
            return te.substring(0, te.length() -1) + 'た';
        } else {
            return te.substring(0, te.length() -1) + 'だ';
        }
    }

    public String asShortPastNegForm() {
        String sn = asShortNegForm();
        return sn.substring(0, sn.length() -1) + "かった";
    }

    public String asOpinionQuoteForm() {
        return asShortForm() + "と思います";
    }

    public String asHeardQuoteForm() {
        return asShortForm() + "と言っていました";
    }

    public String asPoliteRefrainRequestForm() {
        return asShortNegForm() + "でください";
    }

    public String asNounForm() {
        return asShortForm() + 'の';
    }

    public String asDictionaryForm() {
        return dictionaryVerb;
    }

    public VerbType getVerbType() {
        return verbType;
    }

    public String asDesireForm() {
        return asStemForm() + "たい";
    }
}
