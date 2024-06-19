package aed;

import aed.interfaces.Estudiantes;

public class EstudiantesImpl implements Estudiantes{
  private TrieDiccionario<Integer> trieEstudiantes;

  public EstudiantesImpl(){
    this.trieEstudiantes = new TrieDiccionario<>();
  }

  public void registrarEnelSistema(String lu){
    trieEstudiantes.definir(lu,0); 
  }

  public void inscribirAMateria(String lu){
    trieEstudiantes.definir(lu,cantMateriasInscriptas(lu) + 1);
  }

  public int cantMateriasInscriptas(String lu){
    return this.trieEstudiantes.obtener(lu); 
  }

  public void desinscribir(String lu){
    trieEstudiantes.definir(lu, cantMateriasInscriptas(lu) - 1);
  }

}
