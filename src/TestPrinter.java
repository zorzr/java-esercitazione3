// ESERCITAZIONE 3

/**
 * @see Colore
 * @see ImgVect
 * @see InkJetPrinter
 * @author zorzr
 */

public class TestPrinter {
    public static void main(String[] args) {
        InkJetPrinter hp = new InkJetPrinter();
        
        hp.initCatrtidges();
        hp.showCartridgesLevel();
        
        // TEST
        ImgVect imm = new ImgVect(4);
        imm.addForma( new Quadrato(5, Colore.RED) );
        imm.addForma( new Quadrato(7, Colore.BLACK) );
        imm.addForma( new Quadrato(6, Colore.BLUE) );
        
        System.out.println("\nStampa:");
        hp.stampa(imm);
        hp.showCartridgesLevel();
        
        System.out.println("\nForma aggiuntiva:");
        imm.addForma( new Quadrato(7, Colore.RED) );
        hp.stampa(imm);
        hp.showCartridgesLevel();
    }
    
}
