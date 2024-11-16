package usoIncorrectoSinErroCompilacion;

public class Banco {
    public static double tasaInteres = 0.05;

    public static void modificarTASA(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }

    public static void cambiarSaldo(double saldo) {
        saldo = saldo(1 + tasaInteres); //no hay atributo saldo definido
    }
}
