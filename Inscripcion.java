package validadorCorrelativas;

import poo.reproductor.Album;

import java.time.LocalDate;

public class Inscripcion {
  private Alumno alumno;
  private Materia materia;
  private LocalDate fecha;

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public Materia getMateria() {
    return materia;
  }

  public void setMateria(Materia materia) {
    this.materia = materia;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public Inscripcion(Alumno alumno, Materia materia) {
    this.alumno = alumno;
    this.materia = materia;
    this.fecha = LocalDate.now();
  }

  public boolean aprobada(){

    return !this.materia.tenesCorrelativas() || this.materia.puedeCursar(this.alumno);
  }
}
