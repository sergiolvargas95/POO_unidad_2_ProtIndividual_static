package ejercicioUno;

public class Coche {
    private String marca;
    private String modelo;
    static int contarCoches;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

        contarCoches++;
    }

    static public void mostarNumeroCoches() {
        System.out.println("Se han creado " + contarCoches + " coches");
    }
}
