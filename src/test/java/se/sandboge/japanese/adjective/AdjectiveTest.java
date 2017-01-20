package se.sandboge.japanese.adjective;


import org.junit.Test;
import se.sandboge.japanese.conjugation.Adjective;
import se.sandboge.japanese.conjugation.AdjectiveType;
import se.sandboge.japanese.conjugation.Copula;

import static org.junit.Assert.assertEquals;

public class AdjectiveTest {
    @Test
    public void politeForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asPoliteForm();

        assertEquals("元気です", result);
    }

    @Test
    public void politePastForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asPolitePastForm();

        assertEquals("元気でした", result);
    }

    @Test
    public void politeNegForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asPoliteNegForm();

        assertEquals("元気じゃないです", result);
    }

    @Test
    public void politePastNegForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asPolitePastNegForm();

        assertEquals("元気じゃなかったです", result);
    }

}
