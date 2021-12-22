package ejercicio1.Tema5;

public class Coche {

    public String marca;
    public int cv;
    public boolean modoSport;

    public Coche() {}

    public Coche(String marca, int cv, boolean modoSport) {
        this.marca = marca;
        this.cv = cv;
        this.modoSport = modoSport;
    }
    public String toString(){
        return marca + " / " + cv + " / " + modoSport;
    }

}
