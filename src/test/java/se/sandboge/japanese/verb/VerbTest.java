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
    public void masuFormDeduceMiru() throws Exception {
        Verb verb = new Verb("見る");

        String result = verb.asPoliteForm();

        assertEquals("見ます", result);
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

    @Test
    public void constructorRu() {
        Verb verb = new Verb("食べる");

        assertEquals("食べ", verb.asStemForm());
    }

    @Test
    public void constructorU() {
        Verb verb = new Verb("知る");

        assertEquals("知り", verb.asStemForm());
    }

    @Test
    public void teFormRu() {
        Verb verb = new Verb("食べる");

        String result = verb.asTeForm();

        assertEquals("食べて", result);
    }

    @Test
    public void teFormU() {
        Verb verb = new Verb("知る");

        String result = verb.asTeForm();

        assertEquals("知って", result);
    }

    @Test
    public void politeRequestForm() {
        Verb verb = new Verb("知る");

        String result = verb.asPoliteRequestForm();

        assertEquals("知ってください", result);
    }

    @Test
    public void politePermissionForm() {
        Verb verb = new Verb("知る");

        String result = verb.asPolitePermissionForm();

        assertEquals("知ってもいいです", result);
    }

    @Test
    public void politeProhibitionForm() {
        Verb verb = new Verb("知る");

        String result = verb.asPoliteProhibitionForm();

        assertEquals("知ってはいけません", result);
    }

    @Test
    public void inProgressForm() {
        Verb verb = new Verb("知る");

        String result = verb.asInProgressForm();

        assertEquals("知っている", result);
    }

    @Test
    public void movementPurposeForm() {
        Verb verb = new Verb("知る");

        String result = verb.asMovementPurposeForm();

        assertEquals("知りに行く", result);
    }

    @Test
    public void shortForm() {
        Verb verb = new Verb("知る");

        String result = verb.asShortForm();

        assertEquals("知る", result);
    }

    @Test
    public void shortNegForm() {
        Verb verb = new Verb("知る");

        String result = verb.asShortNegForm();

        assertEquals("知らない", result);
    }

    @Test
    public void shortPastForm() {
        Verb verb = new Verb("知る");

        String result = verb.asShortPastForm();

        assertEquals("知った", result);
    }

    @Test
    public void shortPastNegForm() {
        Verb verb = new Verb("知る");

        String result = verb.asShortPastNegForm();

        assertEquals("知らなかった", result);
    }

    @Test
    public void forceRu() {

        Verb result = Verb.forceRu("勉強する");

        assertEquals("勉強する", result.asDictionaryForm());
        assertEquals(VerbType.ru, result.getVerbType());
    }

    @Test
    public void forceRu2() {

        Verb result = Verb.forceRu("泳ぐ");

        assertEquals("泳る", result.asDictionaryForm());
        assertEquals(VerbType.ru, result.getVerbType());
    }

    @Test
    public void forceU() {

        Verb result = Verb.forceU("食べる");

        assertEquals("食べる", result.asDictionaryForm());
        assertEquals(VerbType.u, result.getVerbType());
    }

    @Test
    public void forceU2() {

        Verb result = Verb.forceU("する");

        assertEquals("する", result.asDictionaryForm());
        assertEquals(VerbType.u, result.getVerbType());
    }

    @Test
    public void forceSuru() {

        Verb result = Verb.forceSuru("食べる");

        assertEquals("食べする", result.asDictionaryForm());
        assertEquals(VerbType.irregular, result.getVerbType());
    }

    @Test
    public void forceSuru2() {

        Verb result = Verb.forceSuru("書く");

        assertEquals("書する", result.asDictionaryForm());
        assertEquals(VerbType.irregular, result.getVerbType());
    }

    @Test
    public void forceKuru() {

        Verb result = Verb.forceKuru("食べる");

        assertEquals("食べ来る", result.asDictionaryForm());
        assertEquals(VerbType.irregular, result.getVerbType());
    }

    @Test
    public void forceKuru2() {

        Verb result = Verb.forceKuru("する");

        assertEquals("す来る", result.asDictionaryForm());
        assertEquals(VerbType.irregular, result.getVerbType());
    }

    @Test
    public void nounForm() {
        Verb verb = new Verb("食べる");

        String result = verb.asNounForm();

        assertEquals("食べるの", result);
    }

    @Test
    public void opinionQuoteForm() {
        Verb verb = new Verb("食べる");

        String result = verb.asOpinionQuoteForm();

        assertEquals("食べると思います", result);
    }

    @Test
    public void heardQuoteForm() {
        Verb verb = new Verb("食べる");

        String result = verb.asHeardQuoteForm();

        assertEquals("食べると言っていました", result);
    }

    @Test
    public void politeRefrainRequestForm() {
        Verb verb = new Verb("食べる");

        String result = verb.asPoliteRefrainRequestForm();

        assertEquals("食べないでください", result);
    }

    @Test
    public void desireForm() {
        Verb verb = new Verb("食べる");

        String result = verb.asDesireForm();

        assertEquals("食べたい", result);
    }

    @Test
    public void representativeForm() {
        Verb verb = new Verb("食べる");

        String result = verb.asRepresentativeForm();

        assertEquals("食べたり", result);
    }

    @Test
    public void potentialForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asPotentialForm();

        assertEquals("手伝える", result);
    }

    @Test
    public void passiveForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asPassiveForm();

        assertEquals("手伝われる", result);
    }

    @Test
    public void iHearSoudesuForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asIHearSoudesuForm();

        assertEquals("手伝うそうです", result);
    }

    @Test
    public void iHearTteForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asIHearTteForm();

        assertEquals("手伝うって", result);
    }

    @Test
    public void ifThenForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asIfThenForm();

        assertEquals("手伝ったら", result);
    }

    @Test
    public void ifThenNegForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asIfThenNegForm();

        assertEquals("手伝わなかったら", result);
    }

    @Test
    public void volitionalForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asVolitionalForm();

        assertEquals("手伝おう", result);
    }

    @Test
    public void adviceForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asAdviceForm();

        assertEquals("手伝ったらどうですか", result);
    }

    @Test
    public void itIsPossibleForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asItIsPossibleForm();

        assertEquals("手伝うかもしれません", result);
    }

    @Test
    public void itIsPossibleNegForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asItIsPossibleNegForm();

        assertEquals("手伝わないかもしれません", result);
    }

    @Test
    public void itIsPossiblePastForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asItIsPossiblePastForm();

        assertEquals("手伝ったかもしれません", result);
    }

    @Test
    public void itIsPossiblePastNegForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asItIsPossiblePastNegForm();

        assertEquals("手伝わなかったかもしれません", result);
    }

    @Test
    public void haveALookAtForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asHaveALookAtForm();

        assertEquals("手伝ってみる", result);
    }

    @Test
    public void determinationForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asDeterminationForm();

        assertEquals("手伝おうと思っています", result);
    }

    @Test
    public void preparationForm() {
        Verb verb = new Verb("手伝う");

        String result = verb.asPreparationForm();

        assertEquals("手伝っておく", result);
    }

}