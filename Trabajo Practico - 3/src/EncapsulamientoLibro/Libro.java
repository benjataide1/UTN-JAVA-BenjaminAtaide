
package EncapsulamientoLibro;

public class Libro {
  private String titulo;
  private String autor;
  private int anioPublicacion;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getAnioPublicacion() {
    return anioPublicacion;
  }

  public void setAnioPublicacion(int anioPublicacion) {
    if (anioPublicacion < 2000) {
      System.out.println("Libro Viejo No lo puedes Publicar");
      this.anioPublicacion = anioPublicacion;
    } else {
      System.out.println("Libro Nuevo Puedes Publicarlo");
      this.anioPublicacion = anioPublicacion;
    }

  }

  public void mostrarInfo() {
    System.out.println("Titulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Año de Publicacion: " + anioPublicacion);
  }

}