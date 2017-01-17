package se.sandboge.japanese.adjective;


import org.junit.Test;
import se.sandboge.japanese.conjugation.Adjective;
import se.sandboge.japanese.conjugation.AdjectiveType;
import se.sandboge.japanese.conjugation.Copula;

import static org.junit.Assert.assertEquals;

public class AdjectiveTest {
    @Test
    public void dictionaryForm() {
        Adjective adjective = new Adjective("元気", AdjectiveType.na);

        String result = adjective.asPolite();

        assertEquals("元気です", result);
    }

}
