public class Bus extends Vehiculo {
    private int cantidadDeAsientos;

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
    public int asientosDisponibles(){
        return cantidadDeAsientos;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "color='" + getColor() + '\'' +
                ", patente='" + getPatente() + '\'' +
                ", cantidadDeAsientos=" + cantidadDeAsientos +
                '}';
    }

}
