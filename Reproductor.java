package poo.reproductor;

import java.time.Year;
import java.util.List;

public class Reproductor {
  public static void main(String[] args){
    Album album = new Album();
    Artista artista = new Artista("pop", "Michael Jackson");

    Cancion cancion = new Cancion(album, "5 minutos", "Cancion 1");
    Cancion cancion1 = new Cancion(album, "3 minutos", "cancion 2");
    Cancion cancion2 = new Cancion(album, "4 minutos", "cancion 3");

    album.setArtista(artista);
    album.setNombre("Thriller");
    album.setAnioLanzamiento(Year.of(1980));
    album.setCanciones(List.of(cancion, cancion1, cancion2));

    for (ElementoMusical elemento: List.of(cancion, cancion1, cancion2, album)){
      elemento.reproducirMusica();
    }

  }
}
