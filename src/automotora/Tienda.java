package automotora;

public class Tienda {
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private int stock;

    public Tienda() {
    }

    public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "automotora.Tienda{" +
                "stock=" + stock +
                ", vendedor=" + vendedor +
                ", vehiculo=" + vehiculo +
                '}';
    }

    public String existeStock(){
        if (getStock() > 0){
            return "cantidad de stock es " + getStock();
        }
        return "No hay stock disponible";
        }

}
