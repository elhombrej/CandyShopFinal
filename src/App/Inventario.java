package App;

public class Inventario extends javax.swing.JFrame {//apartado back-end de la aplicacion
    private String productos[] = {"Milka", "Bon o Bon", "Billiken", "Bazooka", "Chupetin POP", "M&M", "Rocklets", "Block"};
    public double precios[] = {100, 20, 5, 10, 15, 70, 50, 80};
    private double precio = 0;
    private int cantidad = 0;
    public static double subtotal = 0;
    //creo getters y setters
    public String[] getProductos() {
        return productos;
    }

    public double[] getPrecios() {
        return precios;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public static double getSubtotal() {
        return subtotal;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static void setSubtotal(double subtotal) {
        Inventario.subtotal = subtotal;
    }
}
