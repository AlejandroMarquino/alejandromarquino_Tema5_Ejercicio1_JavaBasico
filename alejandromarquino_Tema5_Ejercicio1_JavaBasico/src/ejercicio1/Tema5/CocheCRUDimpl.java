package ejercicio1.Tema5;

import java.util.ArrayList;

public class CocheCRUDimpl implements CocheCRUD{

        public CocheCRUDimpl(){}

        public void save(Coche coche, ArrayList coches){
                coches.add(coche);
        }
        public void findAll(ArrayList coches) {
                System.out.println(coches);
        }
        public void delete() {}
}
