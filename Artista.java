package poo.reproductor;

public class Artista extends Discografia {
  private String generoMusical;

  public Artista() {}

  public Artista(String generoMusical, String nombre) {
    this.generoMusical = generoMusical;
    this.nombre = nombre;
  }

  public String getGeneroMusical() {
    return generoMusical;
  }

  public void setGeneroMusical(String generoMusical) {
    this.generoMusical = generoMusical;
  }

  @Override
  public void mostrarNombreEnMayuscula(){
    System.out.println("Método para Artista");
    super.mostrarNombreEnMayuscula();
  }

  @Override
  public void mostrarNombreEnMinuscula(){
    System.out.println("Método para Artista");
    System.out.println(this.nombre.toLowerCase());
  }
}

