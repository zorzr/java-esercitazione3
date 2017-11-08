// ESERCITAZIONE 2

/**
 * @see Forma
 * @see Colore
 * @see ImgVect
 * @author zorzr
 */

public class Quadrato extends Forma {
    protected double lato;
    
    public Quadrato (double l, Colore col) {
        super(col);
        this.lato = l;
    }

    public double getLato() {
        return lato;
    }
    
    public double getArea () {
        return lato*lato;
    }
    
    public double getPerimetro () {
        return 4*lato;
    }
    
    public String toString () {
        return "Quadrato     lato = " + lato + "           colore = " + super.getColore();
    }
}
