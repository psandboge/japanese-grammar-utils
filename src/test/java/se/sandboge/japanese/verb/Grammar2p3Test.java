package se.sandboge.japanese.verb;


import org.junit.Test;
import se.sandboge.japanese.conjugation.Verb;

import static org.junit.Assert.assertEquals;

public class Grammar2p3Test {
    @Test
    public void tariForm() {
        Verb verb[] = {
                new Verb("消える"),
                new Verb("晴れる"),
                new Verb("曇る"),
                new Verb("笑う"),
                new Verb("泣く"),
                new Verb("質問する"),
                new Verb("踊る"),
                new Verb("見せる"),
                new Verb("送る"),
                new Verb("弾く"),
                new Verb("来る"),
                new Verb("上る"),
                new Verb("心配する"),
                new Verb("喜ぶ"),
                new Verb("止まる"),
                new Verb("押す"),
                new Verb("混む"),
                new Verb("騒ぐ"),
                new Verb("吹く"),
                new Verb("もらう"),
                new Verb("浴びる"),
                new Verb("曲がる"),
                new Verb("習う"),
                new Verb("決める"),
                new Verb("払う"),
                new Verb("咲く"),
                new Verb("貸す"),
                new Verb("選ぶ"),
                new Verb("変える"),
                new Verb("サボる"),
                new Verb("飼う"),
                new Verb("置く"),
                new Verb("渇く"),
                new Verb("なる"),
                new Verb("始める"),
                new Verb("並べる"),
                new Verb("思う"),
                new Verb("開く"),
                new Verb("磨く"),
        };

        String representativeForm[] = {
                "消えたり",
                "晴れたり",
                "曇ったり",
                "笑ったり",
                "泣いたり",
                "質問したり",
                "踊ったり",
                "見せたり",
                "送ったり",
                "弾いたり",
                "きたり",
                "上ったり",
                "心配したり",
                "喜んだり",
                "止まったり",
                "押したり",
                "混んだり",
                "騒いだり",
                "吹いたり",
                "もらったり",
                "浴びたり",
                "曲がったり",
                "習ったり",
                "決めたり",
                "払ったり",
                "咲いたり",
                "貸したり",
                "選んだり",
                "変えたり",
                "サボったり",
                "飼ったり",
                "置いたり",
                "渇いたり",
                "なったり",
                "始めたり",
                "並べたり",
                "思ったり",
                "開いたり",
                "磨いたり",
        };

        for (int i = 0; i < verb.length; i++) {
            Verb v = verb[i];
            String mf = v.asRepresentativeForm();

            assertEquals(representativeForm[i], mf);
        }
    }
}
