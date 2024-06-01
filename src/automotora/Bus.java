package automotora;

public class Bus extends Vehiculo {
    private int cantidadDeAsientos;

    public Bus() {
    }

    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
    public int asientosDisponibles(int asientosOcupados){
        if(asientosOcupados <= cantidadDeAsientos){
            return cantidadDeAsientos - asientosOcupados;
        }
        return 0;

    }

    @Override
    public String toString() {
        return "automotora.Bus{" +
                "color='" + getColor() + '\'' +
                ", patente='" + getPatente() + '\'' +
                ", cantidadDeAsientos=" + cantidadDeAsientos +
                '}';
    }

}
