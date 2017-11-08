// ESERCITAZIONE 3
import java.util.Arrays;

/**
 * @see Forma
 * @see Colore
 * @see ImgVect
 * @author zorzr
 */

public class TestImmagini {
    public static void main(String[] args) {
        ImgVect[] imm = new ImgVect[3];
        imm[0] = new ImgVect(3);
        imm[1] = new ImgVect(5);
        imm[2] = new ImgVect(2);
        
        imm[0].addForma( new Cerchio(1, Colore.RED) );
        imm[0].addForma( new Quadrato(4, Colore.BLUE) );
        imm[1].addForma( new Quadrato(3, Colore.RED) );
        imm[1].addForma( new Rettangolo(2, 5, Colore.YELLOW) );
        imm[1].addForma( new Cerchio(3, Colore.BLACK) );
        imm[1].addForma( new Cerchio(3, Colore.BLACK) );
        imm[2].addForma( new Cerchio(1, Colore.BLACK) );
        
        for (int i = 0; i < 3; i++) {
            if (imm[i] != null) {
                System.out.println(imm[i]);
            }
        }
        
        System.out.println("\n[ORDINAMENTO]");
        Arrays.sort(imm);
        
        for (int i = 0; i < 3; i++) {
            if (imm[i] != null) {
                System.out.println(imm[i]);
            }
        }
    }
}
