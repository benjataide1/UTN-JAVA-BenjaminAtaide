package ejercicio_8;

public class Documento {

    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, FirmaDigital firmaDigital) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = firmaDigital;
    }

}
