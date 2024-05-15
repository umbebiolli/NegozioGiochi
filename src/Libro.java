public class Libro {
    private String titolo;
    private String autore;
    private int numeroPagine;
    private static double costoPagina = 0.05;
    private final double COSTOFISSO = 5.5;

    // Default
    public Libro() {

    }

    // Master
    public Libro(String titolo, String autore, int numeroPagine) {
        /*this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;*/
        setTitolo(titolo);
        setAutore(autore);
        setNumeroPagine(numeroPagine);
    }

    // Copia
    public Libro(Libro l) {
        this.titolo = l.titolo;
        this.autore = l.autore;
        this.numeroPagine = l.numeroPagine;
    }

    // Get titolo
    public String getTitolo() {
        return titolo;
    }

    // Set titolo
    public void setTitolo(String titolo) {
        if (titolo.isEmpty()) {
            System.out.println("errore");
            return;
        }
        this.titolo = titolo;
    }

    // Get Autore
    public String getAutore() {
        return autore;
    }

    // Set autore
    public void setAutore(String autore) {
        this.autore = autore;
    }

    // Get numeroPagine
    public int getNumeroPagine() {
        return numeroPagine;
    }

    // Set numeroPagine
    // + setNumeroPagine(numeroPagine : int) : void
    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    // Metodo per il prezzo
    public double prezzo() {
        double p;
        p = COSTOFISSO + (costoPagina * numeroPagine);
        return p;
    }

    // Set costoPagina
    public static void setCostoPagina(double costo) {
        costo = costoPagina;
    }

    // toString
    public String toString() {
        return "Titolo del libro - " + titolo + "\n" + "Autore del libro - " + autore + "\n" + "Numero delle pagine - "
                + numeroPagine;
    }

    // autore e titolo uguali per equals
    public boolean equals(String autore, String titolo) {
        boolean r = false;
        if (this.autore.equals(autore)) {
            r = true;
        } else {
            if (this.titolo.equals(titolo)) {
                r = true;
            }
        }
        return r;
    }

    public Libro getCopySh() {
        return this;
    }

    public Libro getCopyDeep() {
        return new Libro(getTitolo(), getAutore(), getNumeroPagine());
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (titolo == null) {
            if (other.titolo != null)
                return false;
        } else if (!titolo.equals(other.titolo))
            return false;
        if (autore == null) {
            if (other.autore != null)
                return false;
        } else if (!autore.equals(other.autore))
            return false;
        if (numeroPagine != other.numeroPagine)
            return false;
        return true;
    }

    
}

