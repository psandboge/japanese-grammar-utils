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
}
