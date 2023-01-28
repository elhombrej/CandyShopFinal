package App;

public class PagoCredito extends MetodoDePago {

    @Override
    public double realizarPago() {
        double credito = Inventario.subtotal * 0.10;//el boton de pago con credito aumenta en un 10% el valor del subtotal
        double totalCredito = Inventario.subtotal + credito;
        return totalCredito;
    }
}
