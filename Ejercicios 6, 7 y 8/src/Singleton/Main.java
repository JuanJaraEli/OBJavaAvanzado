package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(5);

        System.out.println("Contador: " + singleton.getContador());
        System.out.println("Zona de memoria: " + singleton);

        System.out.println("");

        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Contador: " + singleton2.getContador());
        System.out.println("Zona de memoria: " + singleton2);
    }
}
