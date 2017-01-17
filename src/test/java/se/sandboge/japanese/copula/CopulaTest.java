package se.sandboge.japanese.copula;


import org.junit.Test;
import se.sandboge.japanese.conjugation.Copula;

import static org.junit.Assert.assertEquals;

public class CopulaTest {
    @Test
    public void politeForm() {
        Copula copula = new Copula("お茶");

        String result = copula.asPoliteForm();

        assertEquals("お茶です", result);
    }

    @Test
    public void politeNegForm() {
        Copula copula = new Copula("お茶");

        String result = copula.asPoliteNegForm();

        assertEquals("お茶じゃないです", result);
    }

    @Test
    public void politePastForm() {
        Copula copula = new Copula("お茶");

        String result = copula.asPolitePastForm();

        assertEquals("お茶でした", result);
    }

    @Test
    public void politePastNegForm() {
        Copula copula = new Copula("お茶");

        String result = copula.asPolitePastNegForm();

        assertEquals("お茶じゃなかったです", result);
    }
}
