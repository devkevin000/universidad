public class Moto extends Vehiculos {

    public String modelo;
    public Integer pasajero;
    public Moto(String placa, Integer pasajeros, Persona Conductor, String modelo, Integer pasajero) {
        super(placa, pasajeros, Conductor);
    }

    @Override
    void setPasajeros(Integer pasajero) {
        
        if(pasajero >4){
            System.out.println("un vehiculo no puede tener mas de 4 pasajeros");
        }
        else{
            this.pasajero = pasajero;
            System.out.println("el vehiculo tiene" + this.pasajero + " pasajeros");
        }
    }


    public Integer getPasajero() {
        return pasajero;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}
