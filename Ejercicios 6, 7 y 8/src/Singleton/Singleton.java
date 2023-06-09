package Singleton;

public class Singleton {
    private static Singleton singleton = null;
    int contador;

    public static Singleton getInstance(){
        if (singleton == null){
            return singleton = new Singleton();
        }
        else return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
