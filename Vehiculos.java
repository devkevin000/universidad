class Vehiculos {
    String placa;
    private Integer pasajeros;
    public Persona Conductor;

    public Vehiculos(String placa, Integer pasajeros, Persona Conductor) {
        this.placa = placa;
        this.Conductor = Conductor;
    }

   
    public Vehiculos(String placa2, String pasajero) {
    }


    void getPasajeros(){
        if(this.pasajeros == 1){
            
            System.out.println("solo hay 1 pasajero" + this.pasajeros);
            
        }else{
            System.out.println("hay" + this.pasajeros + "pasajeros");
        }
    }

    void setPasajeros(Integer pasajero){
        if(pasajero >4){
            System.out.println("un vehiculo no puede tener mas de 4 pasajeros");
        }
        else{
            this.pasajeros = pasajero;
            System.out.println("el vehiculo tiene" + this.pasajeros + " pasajeros");
        }
    }

    public void setConductor(Persona conductor) {
        Conductor = conductor;
    }
    void Datosvehiculos() {
        System.out.println("Placa: " + placa + ", Conductor: " + Conductor);
    }
}
