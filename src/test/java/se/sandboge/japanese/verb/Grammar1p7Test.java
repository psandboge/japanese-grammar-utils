package se.sandboge.japanese.verb;


import org.junit.Test;
import se.sandboge.japanese.conjugation.Verb;

import static org.junit.Assert.assertEquals;

public class Grammar1p7Test {
    @Test
    public void politeForm() {
        Verb verb[] = {
                new Verb("歌う"),
                new Verb("飲む"),
                new Verb("借りる"),
                new Verb("行く"),
                new Verb("開ける"),
                new Verb("する"),
                new Verb("会う"),
                new Verb("答える"),
                new Verb("出る"),
                new Verb("持つ"),
                new Verb("作る"),
                new Verb("来る"),
                new Verb("仕事する"),
                new Verb("ある"),
                new Verb("入る"),
                new Verb("いる"),
                new Verb("投げる"),
                new Verb("乗る"),
                new Verb("やる"),
                new Verb("使う"),
                new Verb("できる"),
                new Verb("出来る"),
                new Verb("雇う"),
                new Verb("歩く"),
                new Verb("聞く"),
                new Verb("下りる"),
                new Verb("泳ぐ"),
                new Verb("死ぬ"),
                new Verb("わかる"),
                new Verb("立つ"),
                new Verb("切る"),
                new Verb("走る"),
                new Verb("起きる"),
                new Verb("帰る"),
                new Verb("消す"),
                new Verb("休む"),
                new Verb("履く"),
                new Verb("急ぐ"),
                new Verb("読む"),
                new Verb("翔ぶ"),
                new Verb("返す")
        };

        String masuForm[] = {
                "歌います",
                "飲みます",
                "借ります",
                "行きます",
                "開けます",
                "します",
                "会います",
                "答えます",
                "出ます",
                "持ちます",
                "作ります",
                "きます",
                "仕事します",
                "あります",
                "入ります",
                "います",
                "投げます",
                "乗ります",
                "やります",
                "使います",
                "できます",
                "出きます",
                "雇います",
                "歩きます",
                "聞きます",
                "下ります",
                "泳ぎます",
                "死にます",
                "わかります",
                "立ちます",
                "切ります",
                "走ります",
                "起きます",
                "帰ります",
                "消します",
                "休みます",
                "履きます",
                "急ぎます",
                "読みます",
                "翔びます",
                "返します",
        };

        for (int i = 0; i < 40; i++) {
            Verb v = verb[i];
            String mf = v.asPoliteForm();

            assertEquals(masuForm[i], mf);
        }
    }
}
