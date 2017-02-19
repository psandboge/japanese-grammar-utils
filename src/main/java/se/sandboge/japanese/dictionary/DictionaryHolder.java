package se.sandboge.japanese.dictionary;


public class DictionaryHolder {
    private static Dictionary dictionary;

    public static Dictionary getDictionary() {
        if (dictionary == null) {
            dictionary = new DefaultDictionary();
        }
        return dictionary;
    }

    public static void setDictionary(Dictionary dictionary) {
        DictionaryHolder.dictionary = dictionary;
    }
}
