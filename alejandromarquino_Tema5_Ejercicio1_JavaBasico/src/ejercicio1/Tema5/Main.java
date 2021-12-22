package ejercicio1.Tema5;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDimpl();
        Coche coche1 = new Coche("WV", 130, true);
        Coche coche2 = new Coche("Mercedes", 180, true);
        Coche coche3 = new Coche("Dacia", 90, false);

        ArrayList<Coche> coches = new ArrayList<Coche>();

        cocheCrud.delete();
        cocheCrud.save(coche1, coches);
        cocheCrud.save(coche2, coches);
        cocheCrud.save(coche3, coches);
        cocheCrud.findAll(coches);


    }
}
