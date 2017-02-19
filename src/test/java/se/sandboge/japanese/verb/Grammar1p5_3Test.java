package se.sandboge.japanese.verb;


import org.junit.Test;
import se.sandboge.japanese.conjugation.Verb;

import static org.junit.Assert.assertEquals;

public class Grammar1p5_3Test {
    @Test
    public void shortForm() {
        Verb verb[] = {
                new Verb("見る"),
                new Verb("呼ぶ"),
                new Verb("買う"),
                new Verb("する"),
                new Verb("書く"),
                new Verb("読む"),
                new Verb("話す"),
                new Verb("売る"),
                new Verb("待つ"),
                new Verb("死ぬ"),
                new Verb("来る"),
                new Verb("稼ぐ")
        };
        String shortForm[] = {
                "見る",
                "呼ぶ",
                "買う",
                "する",
                "書く",
                "読む",
                "話す",
                "売る",
                "待つ",
                "死ぬ",
                "来る",
                "稼ぐ",
        };

        String masuForm[] = {
                "見ます",
                "呼びます",
                "買います",
                "します",
                "書きます",
                "読みます",
                "話します",
                "売ります",
                "待ちます",
                "死にます",
                "きます",
                "稼ぎます",
        };

        for (int i = 0; i < 12; i++) {
            Verb v = verb[i];
            String sf = v.asShortForm();
            String mf = v.asPoliteForm();

            assertEquals(shortForm[i], sf);
            assertEquals(masuForm[i], mf);
        }
    }
}
