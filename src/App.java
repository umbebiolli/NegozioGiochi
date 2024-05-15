public class App {
    public static void main(String[] args) throws Exception {
        Libro[] volumi = new Libro[4];
        Libro l1 = new Libro("", "J.K Rowling", 300);
        Libro l2 = new Libro("Pinocchio", "C. ColLodi", 300);
        Libro l3 = new Libro("Pluto", "Biollino", 300);
        Libro l4 = new Libro("Pippo", "Matia", 300);
        // volumi[0] = l1;
        volumi[1] = l2;
        volumi[2] = l3;
        volumi[3] = l4;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        Libro l7 = l2;
        Libro l8 = new Libro(l2);
        l7.setAutore("Umberto");
        System.out.println("Copia shallow " + l7);
        System.out.println(l8);

        Biblioteca b = new Biblioteca(volumi);
        b.AddLibro(l7, 0);

    }
}
