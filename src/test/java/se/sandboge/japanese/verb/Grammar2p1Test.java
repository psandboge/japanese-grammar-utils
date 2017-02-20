package se.sandboge.japanese.verb;


import org.junit.Test;
import se.sandboge.japanese.conjugation.Verb;

import static org.junit.Assert.assertEquals;

public class Grammar2p1Test {
    @Test
    public void politeForm() {
        Verb verb[] = {
                new Verb("使う"),
                new Verb("休む"),
                new Verb("見る"),
                new Verb("書く"),
                new Verb("上げる"),
                new Verb("する"),
                new Verb("始める"),
                new Verb("忘れる"),
                new Verb("出かける"),
                new Verb("送る"),
                new Verb("知る"),
                new Verb("来る"),
                new Verb("旅行する"),
                new Verb("座る"),
                new Verb("入る"),
                new Verb("見せる"),
                new Verb("サボる"),
                new Verb("払う"),
                new Verb("働く"),
                new Verb("申し込む"),
                new Verb("張る"),
                new Verb("習う"),
                new Verb("歩く"),
                new Verb("着く"),
                new Verb("もらう"),
                new Verb("泳ぐ"),
                new Verb("死ぬ"),
                new Verb("取る"),
                new Verb("立つ"),
                new Verb("頼む"),
                new Verb("なる"),
                new Verb("起きる"),
                new Verb("帰る"),
                new Verb("渡す"),
                new Verb("翔ぶ"),
                new Verb("貸す"),
                new Verb("決める"),
                new Verb("役に立つ"),
                new Verb("やめる"),
                new Verb("上る")
        };

        String taiForm[] = {
                "使いたい",
                "休みたい",
                "見たい",
                "書きたい",
                "上げたい",
                "したい",
                "始めたい",
                "忘れたい",
                "出かけたい",
                "送りたい",
                "知りたい",
                "きたい",
                "旅行したい",
                "座りたい",
                "入りたい",
                "見せたい",
                "サボりたい",
                "払いたい",
                "働きたい",
                "申し込みたい",
                "張りたい",
                "習いたい",
                "歩きたい",
                "着きたい",
                "もらいたい",
                "泳ぎたい",
                "死にたい",
                "取りたい",
                "立ちたい",
                "頼みたい",
                "なりたい",
                "起きたい",
                "帰りたい",
                "渡したい",
                "翔びたい",
                "貸したい",
                "決めたい",
                "役に立ちたい",
                "やめたい",
                "上りたい",
        };

        for (int i = 0; i < 40; i++) {
            Verb v = verb[i];
            String mf = v.asDesireForm();

            assertEquals(taiForm[i], mf);
        }
    }
}
