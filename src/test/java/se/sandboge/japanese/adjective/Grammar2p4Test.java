package se.sandboge.japanese.adjective;


import org.junit.Test;
import se.sandboge.japanese.conjugation.Adjective;
import se.sandboge.japanese.conjugation.AdjectiveType;

import static org.junit.Assert.assertEquals;

public class Grammar2p4Test {
    @Test
    public void tariForm() {
        Adjective adjectives[] = {
                new Adjective("嬉しい", AdjectiveType.i),
                new Adjective("狭い", AdjectiveType.i),
                new Adjective("強い", AdjectiveType.i),
                new Adjective("真面目", AdjectiveType.na),
                new Adjective("青い", AdjectiveType.i),
                new Adjective("暗い", AdjectiveType.i),
                new Adjective("重い", AdjectiveType.i),
                new Adjective("暖かい", AdjectiveType.i),
                new Adjective("長い", AdjectiveType.i),
                new Adjective("大事", AdjectiveType.na),
                new Adjective("危ない", AdjectiveType.i),
                new Adjective("遠い", AdjectiveType.i),
                new Adjective("安全", AdjectiveType.na),
                new Adjective("かわいい", AdjectiveType.i),
                new Adjective("高い", AdjectiveType.i),
                new Adjective("弱い", AdjectiveType.i),
                new Adjective("下手", AdjectiveType.na),
                new Adjective("薄い", AdjectiveType.i),
                new Adjective("辛い", AdjectiveType.i),
                new Adjective("太い", AdjectiveType.i),
                new Adjective("明るい", AdjectiveType.i),
                new Adjective("遅い", AdjectiveType.i),
                new Adjective("短い", AdjectiveType.i),
                new Adjective("綺麗", AdjectiveType.na),
                new Adjective("低い", AdjectiveType.i),
                new Adjective("涼しい", AdjectiveType.i),
                new Adjective("大変", AdjectiveType.na),
                new Adjective("不便", AdjectiveType.na),
                new Adjective("いい", AdjectiveType.yoi),
                new Adjective("悪い", AdjectiveType.i),
                new Adjective("甘い", AdjectiveType.i),
                new Adjective("上手", AdjectiveType.na),
                new Adjective("寂しい", AdjectiveType.i),
                new Adjective("欲しい", AdjectiveType.i),
                new Adjective("悲しい", AdjectiveType.i),
                new Adjective("広い", AdjectiveType.i),
                new Adjective("立派", AdjectiveType.na),
                new Adjective("近い", AdjectiveType.i),
                new Adjective("若い", AdjectiveType.i),
                new Adjective("細い", AdjectiveType.i)
        };

        String representativeForm[] = {
                "嬉しかったり",
                "狭かったり",
                "強かったり",
                "真面目だったり",
                "青かったり",
                "暗かったり",
                "重かったり",
                "暖かかったり",
                "長かったり",
                "大事だったり",
                "危なかったり",
                "遠かったり",
                "安全だったり",
                "かわいかったり",
                "高かったり",
                "弱かったり",
                "下手だったり",
                "薄かったり",
                "辛かったり",
                "太かったり",
                "明るかったり",
                "遅かったり",
                "短かったり",
                "綺麗だったり",
                "低かったり",
                "涼しかったり",
                "大変だったり",
                "不便だったり",
                "よかったり",
                "悪かったり",
                "甘かったり",
                "上手だったり",
                "寂しかったり",
                "欲しかったり",
                "悲しかったり",
                "広かったり",
                "立派だったり",
                "近かったり",
                "若かったり",
                "細かったり",
        };

        for (int i = 0; i < adjectives.length; i++) {
            Adjective adjective = adjectives[i];
            String mf = adjective.asRepresentativeForm();

            assertEquals(representativeForm[i], mf);
        }
    }
}
