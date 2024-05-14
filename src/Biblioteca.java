public class Biblioteca {
    private int nLibri = 1000;
    private Libro [] volumi;

    public Biblioteca() {
        volumi = new Libro[nLibri];
    }

    public Biblioteca(Libro volumi[]) {
        volumi = new Libro[nLibri];
        for (int i = 0; i < volumi.length; i++) {
            this.volumi[i] = volumi[i];
        }
    }

    public Biblioteca(Biblioteca b) {
        volumi = new Libro[nLibri];
        for (int i = 0; i < b.volumi.length; i++) {
            volumi[i] = new Libro(b.getVolume(i));
        }
    }

    public Libro getVolume(int posizione) {
        return volumi[posizione];
    }

    public int AddLibro(Libro l, int posizione) {
        if (posizione < 0 || posizione >= nLibri) {
            return -1;
        } else if (volumi[posizione] == null) {
            return -2;
        } else {
            volumi[posizione] = new Libro(l);
            return 0;
        }
    }

    public int ricercaPerTitolo(String titolo) {
        int libroTrovato = -1;
        int i = 0;
        while (i < volumi.length) {
            if (volumi[i].getTitolo().equals(titolo)) {
                libroTrovato = i;
            } 
        }
        return libroTrovato;
    }

    public int ricercaPerAutore(String autore) {
        int libroTrovato = 0;
        boolean r = false;
        for (int i = 0; i < volumi.length; i++) {
            r = false;
            if (volumi[i].getAutore().equals(autore)) {
                libroTrovato ++;
                r = true;
            } if (i == volumi.length && r == false) {
                libroTrovato = -1;
            }
        }
        return libroTrovato;
    }

    public int nLibriPresenti() {
        int conta = 0;
        for (int i = 0; i < volumi.length; i++) {
            if (volumi[i] != null) {
                conta++;
            }
        }
        return conta;
    }
}
