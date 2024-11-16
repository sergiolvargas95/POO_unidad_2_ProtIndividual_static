package ejercicioUno;

public class Main {
    public static void main(String[] args) {
        Coche miPrimeroCoche = new Coche("BMW", "XM 2023");
        Coche miSegundoCoche = new Coche("BMW", "i3");
        Coche miTercerCoche = new Coche("Tesla", "serie X");

        Coche.mostarNumeroCoches();
    }
}
