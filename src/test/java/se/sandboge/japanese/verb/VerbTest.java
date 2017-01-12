package se.sandboge.japanese.verb;

import org.junit.Test;

import static org.junit.Assert.*;

public class VerbTest {
    @Test
    public void masuFormRu() throws Exception {
        Verb verb = new Verb("食べる", VerbType.ru);

        String result = verb.masuForm();

        assertEquals("食べます", result);
    }

    @Test
    public void masuFormUSu() throws Exception {
        Verb verb = new Verb("話す", VerbType.u);

        String result = verb.masuForm();

        assertEquals("話します", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void masuFormIError() throws Exception {
        Verb verb = new Verb("食べる", VerbType.irregular);

        String result = verb.masuForm();
    }

    @Test
    public void masuFormIIku() throws Exception {
        Verb verb = new Verb("来る", VerbType.irregular);

        String result = verb.masuForm();

        assertEquals("来ます", result);
    }

    @Test
    public void masuFormISuru() throws Exception {
        Verb verb = new Verb("する", VerbType.irregular);

        String result = verb.masuForm();

        assertEquals("します", result);
    }

}