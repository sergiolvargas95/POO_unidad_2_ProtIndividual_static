package usoCorrecto.AtributoStatic;

public class Contador {
    static int contadorGlobal = 0;

    public Contador() {
        contadorGlobal++;
    }

    public static void mostrarContador() {
        System.out.println("contador global: " + contadorGlobal);
    }
}
