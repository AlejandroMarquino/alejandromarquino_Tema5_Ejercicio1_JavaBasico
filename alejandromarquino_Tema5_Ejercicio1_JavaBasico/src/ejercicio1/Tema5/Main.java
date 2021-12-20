package ejercicio1.Tema5;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDimpl();

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();

    }
}
