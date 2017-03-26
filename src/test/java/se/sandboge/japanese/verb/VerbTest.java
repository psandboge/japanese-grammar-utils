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

    @Test
    public void asPoliterRequest() {
        Verb verb = new Verb("持つ");

        String result = verb.asPoliterRequestForm();

        assertEquals("持っていただけませんか", result);
    }

    @Test
    public void asRequest() {
        Verb verb = new Verb("手伝う");

        String result = verb.asRequestForm();

        assertEquals("手伝ってくれませんか", result);
    }

    @Test
    public void asCasualRequestForm() {
        Verb verb = new Verb("取る");

        String result = verb.asCasualRequestForm();

        assertEquals("取ってくれない", result);
    }

    @Test
    public void asGoodWishForm() {
        Verb verb = new Verb("見つかる");

        String result = verb.asGoodWishForm();

        assertEquals("見つかるといいですね", result);
    }

    @Test
    public void asSelfWishForm() {
        Verb verb = new Verb("する");

        String result = verb.asSelfWishForm();

        assertEquals("するといいんですが", result);
    }

    @Test
    public void asSelfWishCasualForm() {
        Verb verb = new Verb("乗れる");

        String result = verb.asSelfWishCasualForm();

        assertEquals("乗れるといいんだけど", result);
    }

    @Test
    public void asApologizeForForm() {
        Verb verb = new Verb("使う");

        String result = verb.asApologizeForForm();

        assertEquals("使ってすみませんでした", result);
    }

    @Test
    public void asApologizeForNegForm() {
        Verb verb = new Verb("持って来る");

        String result = verb.asApologizeForNegForm();

        assertEquals("持ってこなくてすみませんでした", result);
    }

    @Test
    public void asNeedNotForm() {
        Verb verb = new Verb("脱ぐ");

        String result = verb.asNeedNotForm();

        assertEquals("脱がなくてもいいです", result);
    }

    @Test
    public void asAppearsPastForm() {
        Verb verb = new Verb("降る");

        String result = verb.asAppearsPastForm();

        assertEquals("降ったみたいです", result);
    }

    @Test
    public void asAppearsForm() {
        Verb verb = new Verb("脱ぐ");

        String result = verb.asAppearsForm();

        assertEquals("脱ぐみたいです", result);
    }

    @Test
    public void asAppearsNegForm() {
        Verb verb = new Verb("食べる");

        String result = verb.asAppearsNegForm();

        assertEquals("食べないみたいです", result);
    }

    @Test
    public void asAppearsPastNegForm() {
        Verb verb = new Verb("見る");

        String result = verb.asAppearsPastNegForm();

        assertEquals("見なかったみたいです", result);
    }

    @Test
    public void asYBeforeXForm() {
        Verb verb = new Verb("帰る");

        String result = verb.asYBeforeXForm();

        assertEquals("帰る前に", result);
    }

    @Test
    public void asYAfterXForm() {
        Verb verb = new Verb("勉強する");

        String result = verb.asYAfterXForm();

        assertEquals("勉強してから", result);
    }

    @Test
    public void asTeNegForm() {
        Verb verb = new Verb("走る");

        String result = verb.asTeNegForm();

        assertEquals("走らなくて", result);
    }

    @Test
    public void asFinishForma() {
        Verb verb = new Verb("読む");

        String result = verb.asFinishForm();

        assertEquals("読んでしまう", result);
    }

    @Test
    public void asRegretablyForm() {
        Verb verb = new Verb("読む");

        String result = verb.asRegretablyForm();

        assertEquals("読んでしまう", result);
    }

    @Test
    public void asCauseForm() {
        Verb verb = new Verb("話す");

        String result = verb.asCauseForm();

        assertEquals("話すと", result);
    }

    @Test
    public void asConcurrentActionForm() {
        Verb verb = new Verb("聞く");

        String result = verb.asConcurrentActionForm();

        assertEquals("聞きながら", result);
    }

    @Test
    public void asEbaForm() {
        Verb verb = new Verb("聞く");

        String result = verb.asEbaForm();

        assertEquals("聞けば", result);
    }

    @Test
    public void asEbaNegForm() {
        Verb verb = new Verb("聞く");

        String result = verb.asEbaNegForm();

        assertEquals("聞かなければ", result);
    }

    @Test
    public void asAlternativeWishForm() {
        Verb verb = new Verb("聞く");

        String result = verb.asAlternativeWishForm();

        assertEquals("聞けばよかったです", result);
    }

    @Test
    public void asAlternativeWishNegForm() {
        Verb verb = new Verb("聞く");

        String result = verb.asAlternativeWishNegForm();

        assertEquals("聞かなければよかったです", result);
    }

}