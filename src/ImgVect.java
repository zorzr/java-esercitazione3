// ESERCITAZIONE 3

/**
 * @see Forma
 * @see Colore
 * @author zorzr
 */

public class ImgVect implements Comparable<ImgVect> {
    private int n_max, n;
    private Forma[] vett;
    
    public ImgVect (int max) {
        n = 0;
        n_max = max;
        vett = new Forma[max];
    }
    
    public void addForma (Forma f) {
        if (n < n_max) {
            vett[n] =  f;
            n++;
        }
        else {
            System.out.println("Errore: numero massimo di forme raggiunto\n");
        }
    }
    
    public double getSommaAree () {
        int i;
        double s_tot = 0.;
        
        for (i = 0; i < n; i++) {
            s_tot += vett[i].getArea();
        }
        
        return s_tot;
    }
    
    public double getSommaAree (Colore col) {
        int i;
        double s_col = 0.;
        
        for (i = 0; i < n; i++) {
            if (col.equals(vett[i].getColore())) {
                s_col += vett[i].getArea();
            }
        }
        
        return s_col;
    }
    
    public String toString() {
        String s = "";
        
        for (Forma f : vett) {
            if (f != null) {
                s += f + "\n";
            }
        }
        
        return s;
    }
    
    public int compareTo(ImgVect imm){
        if (this.getSommaAree() < imm.getSommaAree()) {
            return -1;
        }
        else if (this.getSommaAree() > imm.getSommaAree()) {
            return 1;
        }
        return 0;
    }
}
