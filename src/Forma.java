// ESERCITAZIONE 3

/**
 * @see Colore
 * @author zorzr
 */

public abstract class Forma implements Misurabile {
    protected Colore colore;
    
    public Forma(Colore col) {
        this.colore = col;
    }

    public Colore getColore() {
        return colore;
    }
}
