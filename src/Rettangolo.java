// ESERCITAZIONE 3

/**
 * @see Forma
 * @see Colore
 * @see ImgVect
 * @author zorzr
 */

public class Rettangolo extends Forma {
    protected double altezza, base;
    
    public Rettangolo (double a, double b, Colore col) {
        super(col);
        this.altezza = a;
        this.base = b;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getBase() {
        return base;
    }
    
    public double getArea () {
        return base*altezza;
    }
    
    public double getPerimetro () {
        return 2*(base + altezza);
    }
    
    // TESTER
    public String toString () {
        return "Rettangolo   b = " + base + "   a = " + altezza + "    colore = " + super.getColore();
    }
}
