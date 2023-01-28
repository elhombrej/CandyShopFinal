package App;

public class PagoEfectivo extends MetodoDePago {
    @Override
    public double realizarPago() {
        double efectivo = Inventario.subtotal * 0.05;//el pago con efectivo resta un 5% del valor al subtotal
        double totalEfectivo = Inventario.subtotal - efectivo;
        return totalEfectivo;
    }
}
