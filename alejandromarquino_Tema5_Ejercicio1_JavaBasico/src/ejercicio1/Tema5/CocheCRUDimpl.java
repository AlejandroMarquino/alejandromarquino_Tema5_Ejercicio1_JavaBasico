package ejercicio1.Tema5;

public class CocheCRUDimpl implements CocheCRUD{

        public CocheCRUDimpl(){}

        public void save() {
                System.out.println("Save nos permite guardar datos.");
        }
        public void findAll() {
                System.out.println("FindAll nos permite encontrar datos de la BD.");
        }
        public void delete() {
                System.out.println("Delete nos permite borrar/eliminar datos.");
        }
}
