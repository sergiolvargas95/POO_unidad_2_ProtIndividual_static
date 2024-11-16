package ejercicioTres;

public class InstrumentoError {
    private String tipo;

    public static void setTipo(String nuevoTipo) {
       // tipo = nuevoTipo;            //Error de compilacion: No se puede hacer referencia a un campo no estático desde un contexto estático
    }


}
