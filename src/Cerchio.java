// ESERCITAZIONE 3

/**
 * @see Forma
 * @see Colore 
 * @see ImgVect
 * @author zorzr
 */

public class Cerchio extends Forma {
    protected double raggio;
    public final double pi = 3.14159;
    
    public Cerchio (double r, Colore col) {
        super(col);
        this.raggio = r;
    }

    public double getRaggio() {
        return raggio;
    }
    
    public double getArea () {
        return pi*raggio*raggio;
    }
    
    public double getPerimetro () {
        return 2*pi*raggio;
    }
    
    // TESTER
    public String toString () {
        return "Cerchio      raggio = " + raggio + "         colore = " + super.getColore();
    }
}
