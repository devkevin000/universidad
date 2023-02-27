class Main {
  public static void main(String[] args) {
    
    Persona conductor = new Persona("kevin", 123);

    Vehiculos vehiculos = new Vehiculos("null", 1, conductor);
    vehiculos.setPasajeros(4);
    vehiculos.getPasajeros();

  }
}