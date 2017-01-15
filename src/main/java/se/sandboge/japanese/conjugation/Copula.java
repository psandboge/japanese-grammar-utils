package se.sandboge.japanese.conjugation;


public class Copula {
    String expression;

    public Copula(String expression) {
        this.expression = expression;
    }

    public String asPoliteForm() {
        return expression + "です";
    }

    public String asPolitePastForm() {
        return expression + "でした";
    }

    public String asPoliteNegForm() {
        return expression + "じゃないです";
    }

    public String asPolitePastNegForm() {
        return expression + "じゃなかったです";
    }
}
