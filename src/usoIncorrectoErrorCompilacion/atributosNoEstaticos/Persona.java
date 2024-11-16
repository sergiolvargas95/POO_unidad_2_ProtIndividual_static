package usoIncorrectoErrorCompilacion.atributosNoEstaticos;

public class Persona {
    private String nombre;

    public static void mostrarNombre() {
        System.out.println("Nombre: " + nombre); //Error de compilación al intentar acceder a un atributo que no es estatico.
    }
}
