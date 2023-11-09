package poo.reproductor;

public abstract class Discografia implements ElementoMusical {
  protected String nombre;


  public void mostrarNombreEnMayuscula() {
    System.out.println(this.nombre.toUpperCase());
  }

  public abstract void mostrarNombreEnMinuscula();

  public String getNombre() {

    return nombre;
  }

  public void setNombre(String nombre) {

    this.nombre = nombre;
  }

  @Override
  public void reproducirMusica() {

  }
}

