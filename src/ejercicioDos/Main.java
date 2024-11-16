package ejercicioDos;

public class Main {
    public static void main(String[] args) {
        double primerNumero = 3;
        double segundoNumero = 7;

        System.out.println("suma: " + Matematica.sumar(primerNumero, segundoNumero));
        System.out.println("resta: " + Matematica.restar(primerNumero, segundoNumero));
        System.out.println("multiplicación: " + Matematica.multiplicar(primerNumero, segundoNumero));
        System.out.println("divison: " + Matematica.dividir(primerNumero, segundoNumero));
        //retorna la exception
        System.out.println("divison: " + Matematica.dividir(primerNumero, 0));
    }
}
