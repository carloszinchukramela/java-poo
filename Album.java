package poo.reproductor;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Album extends Discografia implements ElementoMusical{
  private Year anioLanzamiento;
  private Artista artista;
  private List<Cancion> canciones = new ArrayList<>();

  public Album() {
  }

  public Album(Year anioLanzamiento, Artista artista, List<Cancion> canciones, String nombre) {
    this.anioLanzamiento = anioLanzamiento;
    this.artista = artista;
    this.nombre = nombre;
    this.canciones = canciones;
  }

  public Year getAnioLanzamiento() {
    return anioLanzamiento;
  }

  public void setAnioLanzamiento(Year anioLanzamiento) {
    this.anioLanzamiento = anioLanzamiento;
  }

  public Artista getArtista() {
    return artista;
  }

  public void setArtista(Artista artista) {
    this.artista = artista;
  }

  @Override
  public void mostrarNombreEnMinuscula() {

  }

  @Override
  public void reproducirMusica() {
    System.out.println("reproduciendo album " + this.nombre);
    for (Cancion cancion: this.canciones){
      cancion.reproducirMusica();
    }
  }

  public List<Cancion> getCanciones() {
    return canciones;
  }

  public void setCanciones(List<Cancion> canciones) {
    this.canciones = canciones;
  }
}
