public class Main {
    public static void main(String[] args){
        Biblioteca b = new Biblioteca();
        Poesia p = new Poesia("Federico García Lorca","Romancero Gitano");
        Poesia p2 = new Poesia("Gustavo Adolfo Bécquer","Amor Eterno");
        Novela n = new Novela("Vladimir Nabókov", "Lolita");
        Novela n2 = new Novela("Alexandre Dumas", "El conde de Monte Cristo");
        Relato r = new Relato("Lady Boopy", "La Manzana");
        Relato r2 = new Relato("Tejas verdes", "Hernán Valdés");

        Usuario u1 = new Usuario("Jorge", "García");
        Usuario u2 = new Usuario("Víctor", "López");
        Usuario u3 = new Usuario("Aarón", "Velázquez");

        b.añadirUsuario(u1);
        b.añadirUsuario(u2);
        b.añadirUsuario(u3);

        b.añadirLibro(p);
        b.añadirLibro(p2);
        b.añadirLibro(n);
        b.añadirLibro(r);
        b.añadirLibro(n2);
        b.añadirLibro(r2);

        u1.reservarLibro(p);
        u1.reservarLibro(p2);
        u2.reservarLibro(p);

        b.setOrden(0);
        System.out.print(b.getOrden());

        //org.junit.runner.JUnitCore.runClasses(Pruebas.class);

    }
}
