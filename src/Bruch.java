public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public double toDecimal() {
        // Achtung: Ganzzahldivision!
        return (double)this.numerator/(double)this.denominator;
    }

    public String print() {
        return this.numerator + " / " + this.denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        Bruch ergBruch = new Bruch(this.getNumerator()*b2.getNumerator(),this.getDenominator()*b2.getDenominator());
        return ergBruch;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        Bruch ergBruch = new Bruch(this.getNumerator()*b2.getNumerator()*b3.getNumerator(),this.getDenominator()*b2.getDenominator()*b3.getDenominator());
        return ergBruch;
    }
}
