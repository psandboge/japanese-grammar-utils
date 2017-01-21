package se.sandboge.japanese.verb;

import org.junit.Test;
import se.sandboge.japanese.conjugation.Verb;
import se.sandboge.japanese.conjugation.VerbType;

import static org.junit.Assert.*;

public class VerbTest {
    @Test
    public void masuFormRu() throws Exception {
        Verb verb = new Verb("食べる", VerbType.ru);

        String result = verb.asPoliteForm();

        assertEquals("食べます", result);
    }

    @Test
    public void masuFormUSu() throws Exception {
        Verb verb = new Verb("話す", VerbType.u);

        String result = verb.asPoliteForm();

        assertEquals("話します", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void masuFormIError() throws Exception {
        Verb verb = new Verb("食べる", VerbType.irregular);

        verb.asPoliteForm();
    }

    @Test
    public void masuFormIKuru() throws Exception {
        Verb verb = new Verb("来る", VerbType.irregular);

        String result = verb.asPoliteForm();

        assertEquals("きます", result);
    }

    @Test
    public void masuFormISuru() throws Exception {
        Verb verb = new Verb("する", VerbType.irregular);

        String result = verb.asPoliteForm();

        assertEquals("します", result);
    }

    @Test
    public void masenFormRu() throws Exception {
        Verb verb = new Verb("食べる", VerbType.ru);

        String result = verb.asPoliteNegForm();

        assertEquals("食べません", result);
    }

    @Test
    public void stemFormRu() throws Exception {
        Verb verb = new Verb("食べる", VerbType.ru);

        String result = verb.asStemForm();

        assertEquals("食べ", result);
    }

    @Test
    public void politePastFormRu() throws Exception {
        Verb verb = new Verb("食べる", VerbType.ru);

        String result = verb.asPolitePastForm();

        assertEquals("食べました", result);
    }

    @Test
    public void politePastNegFormRu() throws Exception {
        Verb verb = new Verb("食べる", VerbType.ru);

        String result = verb.asPolitePastNegForm();

        assertEquals("食べませんでした", result);
    }

    @Test
    public void politeVolitionalFormRu() throws Exception {
        Verb verb = new Verb("食べる", VerbType.ru);

        String result = verb.asPoliteVolitionalForm();

        assertEquals("食べましょう", result);
    }


}