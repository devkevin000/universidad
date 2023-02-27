public class Persona {
  String nombre;
  Integer cedula;

  public Persona(String nombre, Integer cedula) {
    this.nombre = nombre;
    this.cedula = cedula;
  }

  public String getNombre() {
      return nombre;
  } 

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }


}