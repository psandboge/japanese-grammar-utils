package se.sandboge.japanese.dictionary;

import java.util.HashMap;
import java.util.Map;

public class DefaultDictionary implements Dictionary {
    private static Map<String, String> knownWords = new HashMap<>();

    static {
        knownWords.put("見る", "みる");
        knownWords.put("出る", "でる");
        knownWords.put("出来る", "できる");
    }

    @Override
    public String lookupReading(String s) {
        return knownWords.getOrDefault(s, s);
    }
}
