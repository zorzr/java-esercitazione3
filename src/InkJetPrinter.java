// ESERCITAZIONE 3

/**
 * @see Colore
 * @see ImgVect
 * @author zorzr
 */

public class InkJetPrinter {
    private final int MAX;
    private int[] cartridge;
    
    public InkJetPrinter() {
        this.MAX = 100;
        this.cartridge = new int[Colore.values().length];
    }
    
    public void initCatrtidges () {
        int i;
        for (i = 0; i < Colore.values().length; i++) {
            this.cartridge[i] = this.MAX;
        }
    }
    
    public void changeCartridge (Colore col) {
        int i = 0;
        for (Colore c : Colore.values()) {
            if (col.equals(c))   this.cartridge[i] = this.MAX;
            i++;
        }
    }
    
    public boolean checkCartridgesLevel (ImgVect v) {
        int i = 0;
        for (Colore c: Colore.values()) {
            if (v.getSommaAree(c) > this.cartridge[i])  return false;
            i++;
        }
        
        return true;
    }
    
    public void stampa (ImgVect v) {
        if (checkCartridgesLevel(v) == false) {
            System.out.println("Errore di stampa: colore insufficiente");
        } else {
            int i = 0;
            for (Colore c: Colore.values()) {
                this.cartridge[i] -= (int) v.getSommaAree(c);
                i++;
            }
            System.out.println(v);
        }
    }
    
    public void showCartridgesLevel () {
        int i = 0;
        for (Colore c : Colore.values()) {
            System.out.println(c + ":   " + this.cartridge[i]);
            i++;
        }
    }
}