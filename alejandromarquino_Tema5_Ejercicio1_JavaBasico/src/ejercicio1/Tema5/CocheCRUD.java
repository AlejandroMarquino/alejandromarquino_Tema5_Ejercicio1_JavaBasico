package ejercicio1.Tema5;

import java.util.ArrayList;

public interface CocheCRUD {



    public void save(Coche coche, ArrayList coches);
    public void findAll(ArrayList coches);
    public void delete();

}
