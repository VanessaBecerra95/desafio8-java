public class Taxi extends Vehiculo{
    private int valorPasaje;

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int valorPasaje(int monto){
        int vuelto = 0;
        if (monto > valorPasaje){
            return vuelto = monto - valorPasaje;
        } else {
            return monto;
        }
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "color='" + getColor() + '\'' +
                ", patente='" + getPatente() + '\'' +
                ", valorPasaje=" + valorPasaje +
                '}';
    }
}
