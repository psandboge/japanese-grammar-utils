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

    @Test
    public void shortForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asShortForm();

        assertEquals("元気だ", result);
    }

    @Test
    public void shortPastForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asShortPastForm();

        assertEquals("元気だった", result);
    }

    @Test
    public void shortNegForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asShortNegForm();

        assertEquals("元気じゃない", result);
    }

    @Test
    public void shortPastNegForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asShortPastNegForm();

        assertEquals("元気じゃなかった", result);
    }

    @Test
    public void representativeForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asRepresentativeForm();

        assertEquals("元気だったり", result);

    }

    @Test
    public void looksLikeForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asLooksLikeForm();

        assertEquals("元気そうです", result);

    }

    @Test
    public void looksLikeNegForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asLooksLikeNegForm();

        assertEquals("元気じゃなさそうです", result);

    }

}
