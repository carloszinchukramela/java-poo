package poo.reproductor;

public class Cancion extends Discografia {
  private Album album;
  private String duracion;

  public Cancion() {
  }

  public Cancion(Album album, String duracion, String nombre) {
    this.nombre = nombre;
    this.album = album;
    this.duracion = duracion;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }

  public String getDuracion() {
    return duracion;
  }

  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }
  @Override
  public void mostrarNombreEnMinuscula(){
    System.out.println(this.nombre.toLowerCase());
  }

  public void reproducirMusica() {
    System.out.println("reproduciendo cancion " + this.nombre);
  }
}
